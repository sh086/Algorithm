package com.module.leetcode.context;

import com.Application;
import com.common.utils.ArrayUtils;
import com.module.leetcode.core.PrimaryServices;
import com.common.modal.ListNode;
import com.common.utils.ListUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class PrimaryServiceTest {

    @Resource
    private PrimaryServices primaryServices;


    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={0,0,1,1,1,2,2,3,3,4};
        int count = primaryServices.removeDuplicates(target);
        ArrayUtils.printArray(target,count);
    }

    /**
     *  买卖股票的最佳时机 II
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = primaryServices.maxProfit(target);
        System.out.println(count);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void rotateArray() {
        int[] target ={1,2,3,4,5,6};
        int k = 4;
        primaryServices.rotate(target,k);
        ArrayUtils.printArray(target);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void containsDuplicate() {
        int[] target ={1,2,3,1};
        Boolean bool = primaryServices.containsDuplicate(target);
        System.out.println(bool);
    }

    /**
     * 只出现一次的数字
     * */
    @Test
    public void singleNumber() {
        int [] target = {4,1,2,1,2};
        int result = primaryServices.singleNumber(target);
        System.out.println(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersect() {
        int [] num1 = {4,7,9,7,6,7};
        int [] num2 = {5,0,0,6,1,6,2,2,4};
        int [] result = primaryServices.intersect(num1,num2);
        ArrayUtils.printArray(result);
    }

    /**两个正序数组的交集 II*/
    @Test
    public void intersectOrder() {
        int [] num1 = {1,2,2,4,4,7};
        int [] num2 = {2,2,3};
        int [] result = primaryServices.intersectOrder(num1,num2);
        ArrayUtils.printArray(result);
    }

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * */
    @Test
    public void targetMade(){
        int [] numbers = {2, 7, 11, 15};
        int target = 9;
        int [] result = primaryServices.targetMakeUp(numbers,target);
        ArrayUtils.printArray(result);
    }

    /**
     * 原地旋转图像
     * */
    @Test
    public void rotate(){
        int [][] numbers = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        primaryServices.rotate(numbers);
        ArrayUtils.printArray(numbers);
    }

    /**
     * 整数组成的非空数组所表示的非负整数，在该数的基础上加一
     * */
    @Test
    public void plusOne(){
        int [] numbers = {1,2,3};
        int [] result = primaryServices.plusOne(numbers);
        ArrayUtils.printArray(result);
    }

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
     * */
    @Test
    public void moveZeroes(){
        int [] numbers = {1};
        primaryServices.moveZeroesOrder(numbers);
        ArrayUtils.printArray(numbers);
    }

    /**
     * 反转字符串
     * */
    @Test
    public void reverseString(){
        String string = "A man, a plan, a canal: Panama";
        String result = primaryServices.reverseString(string);
        System.out.println(result);
    }

    /**
     * 反转整数
     * */
    @Test
    public void reverse(){
        int target = 1534236469;
        System.out.println(primaryServices.reverse(target));
    }

    /**
     * 字符串中的第一个唯一字符
     * */
    @Test
    public void firstUniqChar(){
        String string = "loveleetcode";
        System.out.println(primaryServices.firstUniqChar(string));
    }

    /**
     * 有效的字母异位词
     * */
    @Test
    public void isAnagram(){
        String s = "anagram", t = "nagaram";
        System.out.println(primaryServices.isAnagram(s,t));
    }

    /**
     * 验证回文字符串
     * */
    @Test
    public void isPalindrome(){
        String target = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(primaryServices.isPalindrome(target));
    }

    /**
     * 字符串转整数
     * */
    @Test
    public void myAtoi(){
        String target = "-91283472332";
        System.out.println(primaryServices.myAtoi(target));
    }

    /**
     * 实现strStr()
     * */
    @Test
    public void strStr() {
        String src = "mississippi";
        String target = "issip";
        System.out.println(primaryServices.strStr(src,target));
    }


    /**
     * 报数
     * */
    @Test
    public void countAndSay() {
        int src = 5;
        System.out.println(primaryServices.countAndSay(src));
    }

    /**
     * 最长公共前缀
     * */
    @Test
    public void longestCommonPrefix() {
        String[] src =  {"aa","a"};
        System.out.println(primaryServices.longestCommonPrefix(src));
    }

    /**
     * 最长公共字符串
     * */
    @Test
    public void longestCommonString() {
        String[] src =  {"ca","a"};
        System.out.println(primaryServices.longestCommonString(src));
    }

    /**
     *  删除链表的倒数第N个节点
     * */
    @Test
    public void removeNthFromEnd() {
        ListNode head = ListUtils.changeStringToList(" [1,2]");
        ListUtils.printLinkList(primaryServices.removeNthFromEnd(head,1));
    }
}
