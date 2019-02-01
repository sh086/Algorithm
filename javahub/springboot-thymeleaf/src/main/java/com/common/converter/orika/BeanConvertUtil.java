package com.common.converter.orika;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.apache.commons.lang3.StringUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Slf4j
public class BeanConvertUtil {
	private static Set<String> registeredMappers = new HashSet<>();
	private static Set<String> registeredConverters = new HashSet<>();

	private BeanConvertUtil() {
	}

	public static MapperFactory getInstance() {
		return BeanMapperFactoryHolder.mapperFactory;
	}

	public static MapperFacade getMapper() {
		return getInstance().getMapperFacade();
	}


	/**
	 * 注册自定义Converter
	 *
	 * @param converterList
	 */
	static void registerConverters(List<NameConverter> converterList) {
		for (NameConverter converter : converterList) {
			//todo 优化唯一名称检查
			Preconditions.checkArgument(StringUtils.isNotBlank(converter.getName()),
					"[%s]未设置Converter名称.", converter.getClass().getName());
			Preconditions.checkNotNull(converter.getConverter(),
					"[%s]未设置Converter.", converter.getClass().getName());

			if (!registeredConverters.add(converter.getName())) {
				throw new RegisterException("[" + converter.getName() + "]Converter名称重复.");
			}
			log.debug("注册Converter. {}", converter.getName());
			converter.registerMapper(BeanMapperFactoryHolder.mapperFactory);
		}
	}

	/**
	 * 注册自定义Mapper
	 *
	 * @param mapperList
	 */
	static void registerMappers(List<Mapper> mapperList) {
		for (Mapper mapper : mapperList) {
			Preconditions.checkArgument(StringUtils.isNotBlank(mapper.getName()),
					"[%s]自定义Mapper缺少名称", mapper.getClass().getName());

			if (!registeredMappers.add(mapper.getName())) {
				throw new RegisterException("[" + mapper.getName() + "]Mapper名称重复.");
			}

			log.debug("注册Mapper. {}", mapper.getName());
			mapper.registerMapper(BeanMapperFactoryHolder.mapperFactory);
		}
	}

	private static class BeanMapperFactoryHolder {
		private static MapperFactory mapperFactory;

		static {
			init();
		}

		private static void init() {
			mapperFactory = new DefaultMapperFactory.Builder()
					.mapNulls(false)
					.build();
		}
	}
}
