package com.common.utils;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.sqlserver.visitor.SQLServerSchemaStatVisitor;
import com.alibaba.druid.stat.TableStat;
import com.alibaba.druid.util.JdbcConstants;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * 封装sql语句
 * @author suhe
 * @since 2019年2月28日11:56:21
 * */
@Slf4j
public class MySqlUtils {

    /**
     * 解析Where过滤条件
     * @author suhe
     * @since 2019年2月28日13:51:08
     * */
    public static <T> T resolveWhere(String sql, Class<T> valueType) {

        T domain;
        Map<String,Object> whereMap = Maps.newHashMap();
        String dbType = JdbcConstants.MYSQL;
        String formatSql = SQLUtils.format(sql, dbType);
        try{
            //实例化
            domain = valueType.newInstance();
            //解析where条件到whereMap中
            List<SQLStatement> stmtList = SQLUtils.parseStatements(formatSql, dbType);
            for (SQLStatement stmt : stmtList) {
                //添加visitor
                SQLServerSchemaStatVisitor visitor = new SQLServerSchemaStatVisitor();
                stmt.accept(visitor);
                //解析表名
                String tableName;
                try {
                    tableName = visitor.getTables().keySet().toArray()[0].toString();
                }catch (Exception e){
                    throw new RuntimeException("表名解析失败:"+e.getMessage());
                }
                //解析参数
                List<TableStat.Condition> list = visitor.getConditions();
                for (val obj : list) {
                    val name = obj.getColumn().toString().replaceAll(tableName+".","");
                    val value = obj.getValues().toArray()[0];
                    whereMap.put(name,value);
                }
            }
            //生成Class类型
            Field[] fields = valueType.getDeclaredFields();
            for (Field field : fields) {
                //私有变量必须先设置Accessible为true
                field.setAccessible(true);
                String name = field.getName();
                String type = field.getType().toString();
                val value = whereMap.get(name);
                if("sourceId".equals(name)){
                	field.set(domain, value+"");
                }else{
                	field.set(domain, value);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("SQL语句解析异常:"+e.getMessage());
        }
        return domain;
    }
}
