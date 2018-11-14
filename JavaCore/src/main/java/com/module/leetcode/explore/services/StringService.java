package com.module.leetcode.explore.services;

/**
 * 字符串类练习算法
 * @author suhe
 * @since 2018年11月10日07:04:33
 * */

public interface StringService {

    /**
     * 反转字符串
     * 方法：分割字符为字符数组
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
     String reverseString(String s);

    /**
     * 反转int整数
     * 方法：求余数
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int reverse(int x);

    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 方法：分割字符为字符数组
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    boolean isPalindrome(String string);
}
