package com.common.algorithm.toolbar;

/**
 * 数组 练习算法
 * @author suhe
 * @since 2018年11月9日10:13:32
 * */

import java.util.*;

public class ArrayBar {

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * 方法：遍历一遍哈希表
     * 来源：LeetCode
     * 时间复杂度：O(n)、空间复杂度O(n)
     * */
    public static int[] targetMakeUp (int[] numbers, int target) {
        int [] targetNum = null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                targetNum = new int[]{i,map.get(temp)};
            }
            map.put(numbers[i],i);
        }
        return targetNum;
    }

    /**
    * 从排序数组中删除重复项,但不能保证有序
     * 来源：LeetCode
     * 方法：使用map索引的方法去重
     * 时间复杂度：O(n)  空间复杂度：O(1)
    **/
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(Integer number:nums){
            set.add(number);
        }
        List<Integer> numbers =  new ArrayList<>(set);
        for(int i = 0; i < numbers.size(); i++){
            nums[i] = numbers.get(i);
        }
        return numbers.size();
    }

    /**
     * 从排序数组中删除重复项,保证有序
     * 来源：LeetCode
     * 方法：双指针发
     * 时间复杂度：O(n)  空间复杂度：O(1)
     **/
    public static int removeDuplicatesOrder(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        //i:不重复的  j:遍历索引
        int i = 0,j = 1;
        while(j < nums.length){
            //若存在不重复的i递增
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        //下标从0计，长度从1计
        return i+1;
    }
}
