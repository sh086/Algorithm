package com.module.linearity;

import com.common.codebar.LeetCodeTestService;
import com.common.context.SpringContext;
import com.common.utils.ConsoleUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * 数字类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class LeetCodeTestServiceTest extends SpringContext<LeetCodeTestService> {

    private LeetCodeTestService leetCodeTestService;

    @Before
    public void before(){
        leetCodeTestService  = getBean("leetCodeTestImpl");
    }

    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={0,0,1,1,1,2,2,3,3,4};
        int count = leetCodeTestService.removeDuplicates(target);
        ConsoleUtils.printArray(target,count);
    }

    /**
     *  买卖股票的最佳时机 II
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = leetCodeTestService.maxProfit(target);
        System.out.println(count);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void rotate() {
        int[] target ={1,2,3,4,5,6};
        int k = 4;
        leetCodeTestService.rotate(target,k);
        ConsoleUtils.printArray(target);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void containsDuplicate() {
        int[] target ={1,2,3,1};
        Boolean bool = leetCodeTestService.containsDuplicate(target);
        System.out.println(bool);
    }

    /**
     * 只出现一次的数字
     * */
    @Test
    public void singleNumber() {
        int [] target = {4,1,2,1,2};
        int result = leetCodeTestService.singleNumber(target);
        System.out.println(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersect() {
        int [] num1 = {4,7,9,7,6,7};
        int [] num2 = {5,0,0,6,1,6,2,2,4};
        int [] result = leetCodeTestService.intersect(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersectOrder() {
        int [] num1 = {1,2,2,4,4,7};
        int [] num2 = {2,2,3};
        int [] result = leetCodeTestService.intersectOrder(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * */
    @Test
    public void targetMade(){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;
        int [] result = leetCodeTestService.targetMakeUp(numbers,target);
        ConsoleUtils.printArray(result);
    }

    /**
     * 整数组成的非空数组所表示的非负整数，在该数的基础上加一
     * */
    @Test
    public void plusOne(){
        int [] numbers = {1,2,3};
        int [] result = leetCodeTestService.plusOne(numbers);
        ConsoleUtils.printArray(result);
    }

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
     * */
    @Test
    public void moveZeroes(){
        int [] numbers = {1};
        leetCodeTestService.moveZeroesOrder(numbers);
        ConsoleUtils.printArray(numbers);
    }

    /**
     * 反转字符串
     * */
    @Test
    public void reverseString(){
        String string = "A man, a plan, a canal: Panama";
        String result = leetCodeTestService.reverseString(string);
        System.out.println(result);
    }

    /**
     * 反转整数
     * */
    @Test
    public void reverse(){
        int target = 1534236469;
        System.out.println(leetCodeTestService.reverse(target));
    }

    /**
     * 验证回文字符串
     * */
    @Test
    public void isPalindrome(){
        String target = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(leetCodeTestService.isPalindrome(target));
    }
}
