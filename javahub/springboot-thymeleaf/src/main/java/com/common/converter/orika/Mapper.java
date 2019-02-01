package com.common.converter.orika;

import com.google.common.collect.Sets;
import ma.glasnost.orika.MapperFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 自定义映射
 */
public abstract class Mapper<S, D> {
	private Class<S> aType;

	private Class<D> bType;

	/**
	 * 源类型和目标类型在sortedClasses排序后在按遍历顺序拼接
	 * 两种类型就能确定唯一的名称, 即使交换S, D位置
	 */
	private final Set<Class> sortedClasses = Sets.newTreeSet(Comparator.comparing(Class::getName));

	public Mapper() {
		ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] types = parameterizedType.getActualTypeArguments();
		try {
			aType = (Class<S>) Class.forName(types[0].getTypeName());
			bType = (Class<D>) Class.forName(types[1].getTypeName());
		} catch (ClassNotFoundException e) {
			throw new RegisterException("Mapper异常.");
		}

		this.sortedClasses.add(aType);
		this.sortedClasses.add(bType);
	}

	/**
	 * 注册自定义字段映射关系
	 *
	 * @param mapperFactory MapperFactory
	 */
	public abstract void registerMapper(MapperFactory mapperFactory);

	protected Class<S> getAType() {
		return aType;
	}

	protected Class<D> getBType() {
		return bType;
	}

	public String getName() {
		return String.join("_", sortedClasses.stream()
				.map(Class::getName)
				.collect(Collectors.toList()));
	}
}
