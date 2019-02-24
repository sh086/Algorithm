package com.module.leetcode.context;

import com.common.utils.ConsoleUtils;
import com.module.leetcode.core.PrimaryServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PrimaryServiceTest {

    @Resource
    private PrimaryServices primaryAlgorithm;


    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={0,0,1,1,1,2,2,3,3,4};
        int count = primaryAlgorithm.removeDuplicates(target);
        ConsoleUtils.printArray(target,count);
    }

    /**
     *  买卖股票的最佳时机 II
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = primaryAlgorithm.maxProfit(target);
        System.out.println(count);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void rotateArray() {
        int[] target ={1,2,3,4,5,6};
        int k = 4;
        primaryAlgorithm.rotate(target,k);
        ConsoleUtils.printArray(target);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void containsDuplicate() {
        int[] target ={1,2,3,1};
        Boolean bool = primaryAlgorithm.containsDuplicate(target);
        System.out.println(bool);
    }

    /**
     * 只出现一次的数字
     * */
    @Test
    public void singleNumber() {
        int [] target = {4,1,2,1,2};
        int result = primaryAlgorithm.singleNumber(target);
        System.out.println(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersect() {
        int [] num1 = {4,7,9,7,6,7};
        int [] num2 = {5,0,0,6,1,6,2,2,4};
        int [] result = primaryAlgorithm.intersect(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersectOrder() {
        int [] num1 = {1,2,2,4,4,7};
        int [] num2 = {2,2,3};
        int [] result = primaryAlgorithm.intersectOrder(num1,num2);
        ConsoleUtils.printArray(result);
    }

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * */
    @Test
    public void targetMade(){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;
        int [] result = primaryAlgorithm.targetMakeUp(numbers,target);
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
        primaryAlgorithm.rotate(numbers);
        ConsoleUtils.printArray(numbers);
    }

    /**
     * 整数组成的非空数组所表示的非负整数，在该数的基础上加一
     * */
    @Test
    public void plusOne(){
        int [] numbers = {1,2,3};
        int [] result = primaryAlgorithm.plusOne(numbers);
        ConsoleUtils.printArray(result);
    }

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
     * */
    @Test
    public void moveZeroes(){
        int [] numbers = {1};
        primaryAlgorithm.moveZeroesOrder(numbers);
        ConsoleUtils.printArray(numbers);
    }

    /**
     * 反转字符串
     * */
    @Test
    public void reverseString(){
        String string = "A man, a plan, a canal: Panama";
        String result = primaryAlgorithm.reverseString(string);
        System.out.println(result);
    }

    /**
     * 反转整数
     * */
    @Test
    public void reverse(){
        int target = 1534236469;
        System.out.println(primaryAlgorithm.reverse(target));
    }

    /**
     * 字符串中的第一个唯一字符
     * */
    @Test
    public void firstUniqChar(){
        String string = "loveleetcode";
        System.out.println(primaryAlgorithm.firstUniqChar(string));
    }

    /**
     * 有效的字母异位词
     * */
    @Test
    public void isAnagram(){
        String s = "anagram", t = "nagaram";
        System.out.println(primaryAlgorithm.isAnagram(s,t));
    }

    /**
     * 验证回文字符串
     * */
    @Test
    public void isPalindrome(){
        String target = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(primaryAlgorithm.isPalindrome(target));
    }

    /**
     * 字符串转整数
     * */
    @Test
    public void myAtoi(){
        String target = "-91283472332";
        System.out.println(primaryAlgorithm.myAtoi(target));
    }

    /**
     * 实现strStr()
     * */
    @Test
    public void strStr() {
        String src = "mississippi";
        String target = "issip";
        System.out.println(primaryAlgorithm.strStr(src,target));
    }


    /**
     * 报数
     * */
    @Test
    public void countAndSay() {
        int src = 5;
        System.out.println(primaryAlgorithm.countAndSay(src));
    }

    /**
     * 最长公共前缀
     * */
    @Test
    public void longestCommonPrefix() {
        String[] src =  {"aa","a"};
        System.out.println(primaryAlgorithm.longestCommonPrefix(src));
    }

    /**
     * 最长公共字符串
     * */
    @Test
    public void longestCommonString() {
        String[] src =  {"ca","a"};
        System.out.println(primaryAlgorithm.longestCommonString(src));
    }
}
