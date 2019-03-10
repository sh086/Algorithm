package com.common.utils;

public class NumberUtils {

    /**
     * 交换数组中的两个元素
     * */
    public static void swap(int [] nums,int index1,int index2){
        nums[index1] = nums[index1] + nums[index2];
        nums[index2] = nums[index1] - nums[index2];
        nums[index1] = nums[index1] - nums[index2];
    }
}
