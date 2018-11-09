package com.module.linearity;

import com.common.algorithm.toolbar.ArrayBar;
import com.common.algorithm.toolbar.NumberBar;
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
        int [] result = ArrayBar.targetMakeUp(numbers,target);
        ConsoleUtils.printArray(result);
    }

    /**
     * 反转整数
     * */
    @Test
    public void reverse(){
        int target = 1534236469;
        System.out.println(NumberBar.reverse(target));
    }

    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={1,1,2};
        System.out.println(ArrayBar.removeDuplicatesOrder(target));
    }

    /**
     * 回文数
     * */
    @Test
    public void isPalindrome(){
        int target = 22;
        System.out.println(NumberBar.isPalindrome(target));
    }
}
