package com.common.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * 数组工具类
 * @author suhe
 * @since 2018年11月9日09:43:45
 * */
@Slf4j
public class ArrayUtils {

    /**
     * 翻转数组
     * @param nums 需要反转的数组
     * @param start 开始下标
     * @param end 结束下标
     * */
    public static void reverse(int[] nums,int start,int end){
        while(start < end){
            NumberUtils.swap(nums,start,end);
            start++;end--;
        }
    }

    /**
     * 打印一维数组
     * */
    public static void printArray(int [] nums){
        if(nums == null || nums.length <=0){
            log.info("null");
            return;
        }
        for(Integer num : nums){
            log.info("{}  ",num);
        }
    }

    /**
     * 打印n个一维数组
     * */
    public static void printArray(int [] nums,int n){
        if(nums == null || nums.length <=0){
            log.info("null");
            return;
        }
        if(n > nums.length){
            n = nums.length;
        }
        for(int i = 0; i<n;i++){
            log.info("{}  ",nums[i]);
        }
    }

    /**
     * 打印二维数组
     * */
    public static void printArray(int [][] nums){
        if(nums == null || nums.length <=0){
            log.info("null");
            return;
        }
        for(int [] num : nums){
            printArray(num);
            System.out.println();
        }
    }
}
