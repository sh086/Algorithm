package com.common.converter.orika;

import ma.glasnost.orika.Converter;
import ma.glasnost.orika.MapperFactory;


public interface NameConverter {
	/**
	 * 定义Converter唯一名称
	 *
	 * @return
	 */
	String getName();

	/**
	 * 真正执行的Converter
	 *
	 * @return
	 */
	Converter getConverter();

	/**
	 * 注册Converter
	 *
	 * @param mapperFactory
	 */
	void registerMapper(MapperFactory mapperFactory);

}
