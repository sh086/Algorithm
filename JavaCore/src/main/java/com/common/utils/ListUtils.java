package com.common.utils;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtils {

	/**
	 * 去除list集合中重复项
	 *
	 * @since suhe
	 * @since 2018年11月6日13:56:22
	 */
	public static List<String> removeDuplicate(List<String> list) {
		if(list == null || list.size()<=0){
			return null;
		}
		Set<String> set = new HashSet<String>();
		for (String str : list) {
			if (StringUtils.isNotBlank(str)) {
				set.add(str.trim());
			}
		}
		list = new ArrayList<>(set);
		return list;
	}

	/**
     * 返回重复的元素
     * @author suhe
     * @since 2018年10月26日13:45:21
     * */
	public static List<String> returnDuplicate(List<String> list) {
        if(list == null || list.size()<=0){
            return null;
        }
	    Integer count = 1;
		Set<String> set = new HashSet<String>();
		List<String> repeats = new ArrayList<String>();
		for (String str : list) {
			if (StringUtils.isNotBlank(str)) {
				set.add(str.trim());
				if(set.size() == count){
                    count++;
                }else {
                    repeats.add(str.trim());
                }
			}
		}
		return repeats;
	}
}