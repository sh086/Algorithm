package com.common.utils;

import java.util.Arrays;
import java.util.List;

/**
 * 类型转化 工具类
 * @author suhe
 * @since 2018年11月9日11:32:19
 * */
public class ConvertUtils {
    /**
     * 转换整形数组为包装类型
     * */
    public static List<Integer> convertToInteger(int[] srcArrays){
        if(srcArrays == null || srcArrays.length <=0){
            return null;
        }
        Integer[] is = org.apache.commons.lang3.ArrayUtils.toObject(srcArrays);
        return Arrays.asList(is);
    }

    /**
     * 转换包装类型为int类型
     * */
    public static int [] convertToInt(List<Integer> srcArrays){
        if(srcArrays == null || srcArrays.size() <=0){
            return null;
        }
       int [] results = new int[srcArrays.size()];
       for(int i = 0; i < srcArrays.size(); i++){
           results[i] = srcArrays.get(i);
       }
        return results;
    }
}
