package com.module.linearity;

import com.common.algorithm.manual.NumberHelper;
import com.common.utils.ConsoleUtils;
import org.junit.Test;

/**
 * 数字类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class NumberTest {

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * */
    @Test
    public void targetMade(){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;
        int [] result = NumberHelper.targetMakeUp(numbers,target);
        ConsoleUtils.printArray(result);
    }
}
