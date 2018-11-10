package com.common.manual;

import lombok.val;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 列表类算法 算法
 * @author suhe
 * @since 2018年11月9日09:29:25
 * */
public class ListHelper<T>{

    /**
     * 去除list集合中重复项，不保证结果有序
     * 方法：利用set集合特性
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param list 执行后，list为无序、不重复的集合
     */
    public static<T> List<T> removeDuplicate(List<T> list) {
        if(list == null || list.size()<=0){
            return null;
        }
        Set<T> set = new HashSet<>();
        for (val str : list) {
            if (str != null && StringUtils.isNotBlank(str.toString())) {
                set.add(str);
            }
        }
        list = new ArrayList<>(set);
        return list;
    }

    /**
     * 从排序数组中删除重复项,保证有序
     * 方法：双指针法
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param nums 已排序的数组
     * @return 不重复的列表长度
     **/
    public static<T> int removeDuplicatesOrder(List<T> nums) {
        if(nums == null || nums.size() <= 0){
            return 0;
        }
        int i = 0,j = 1;
        while(j < nums.size()){
            if (nums.get(i) != nums.get(j)) {
                nums.set(++i,nums.get(j));
            }
            j++;
        }
        //下标从0计，长度从1计
        return i+1;
    }

    /**
     * 返回重复的元素，不保证结果有序
     * 方法：；利用set集合特性
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param list 执行后，list为无序列表
     * @return 重复的元素
     * */
    public static <T> List<T> returnDuplicate(List<T> list) {
        if(list == null || list.size()<=0){
            return null;
        }
        Integer count = 1;
        Set<T> set = new HashSet<>();
        List<T> repeats = new ArrayList<>();
        for (T str : list) {
            if (str!=null && StringUtils.isNotBlank(str.toString())) {
                set.add(str);
                if(set.size() == count){
                    count++;
                }else {
                    repeats.add(str);
                }
            }
        }
        return repeats;
    }
}