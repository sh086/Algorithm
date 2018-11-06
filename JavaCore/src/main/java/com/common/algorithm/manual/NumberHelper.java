package com.common.algorithm.manual;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询数字是否存在类算法
 * @author sueh
 * @since 2018年11月6日10:32:02
 * */

public class NumberHelper {

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
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
}