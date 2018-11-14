package com.module.leetcode.maintest;

import com.module.leetcode.explore.services.ArrayService;
import com.common.context.SpringContext;
import com.common.utils.ConsoleUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * 数组类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class ExploreArrayTest extends SpringContext<ArrayService> {

    private ArrayService arrayService;

    @Before
    public void before(){
        arrayService  = getBean("arrayServiceImpl");
    }

    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={0,0,1,1,1,2,2,3,3,4};
        int count = arrayService.removeDuplicates(target);
        ConsoleUtils.printArray(target,count);
    }

    /**
     *  买卖股票的最佳时机 II
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = arrayService.maxProfit(target);
        System.out.println(count);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void rotateArray() {
        int[] target ={1,2,3,4,5,6};
        int k = 4;
        arrayService.rotate(target,k);
        ConsoleUtils.printArray(target);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void containsDuplicate() {
        int[] target ={1,2,3,1};
        Boolean bool = arrayService.containsDuplicate(target);
        System.out.println(bool);
    }

    /**
     * 只出现一次的数字
     * */
    @Test
    public void singleNumber() {
        int [] target = {4,1,2,1,2};
        int result = arrayService.singleNumber(target);
        System.out.println(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersect() {
        int [] num1 = {4,7,9,7,6,7};
        int [] num2 = {5,0,0,6,1,6,2,2,4};
        int [] result = arrayService.intersect(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersectOrder() {
        int [] num1 = {1,2,2,4,4,7};
        int [] num2 = {2,2,3};
        int [] result = arrayService.intersectOrder(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * */
    @Test
    public void targetMade(){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;
        int [] result = arrayService.targetMakeUp(numbers,target);
        ConsoleUtils.printArray(result);
    }

    /**
     * 原地旋转图像
     * */
    @Test
    public void rotate(){
        int [][] numbers = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        arrayService.rotate(numbers);
        ConsoleUtils.printArray(numbers);
    }

    /**
     * 整数组成的非空数组所表示的非负整数，在该数的基础上加一
     * */
    @Test
    public void plusOne(){
        int [] numbers = {1,2,3};
        int [] result = arrayService.plusOne(numbers);
        ConsoleUtils.printArray(result);
    }

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
     * */
    @Test
    public void moveZeroes(){
        int [] numbers = {1};
        arrayService.moveZeroesOrder(numbers);
        ConsoleUtils.printArray(numbers);
    }
}
