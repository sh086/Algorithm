package com.common.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * 控制台工具
 * @author sueh
 * @since 2018年11月6日09:53:22
 * */

@Slf4j
public class ConsoleUtils {

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