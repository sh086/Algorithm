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
     * 反转int整数（颠倒整数）
     * 方法：求余数
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int reverse(int x);

    /**
     * 字符串中的第一个唯一字符
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * 方法：使用Map记录已经出现过的字符值次数
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int firstUniqChar(String s);

    /**
     * 有效的字母异位词
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
     * 方法：排序
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
     boolean isAnagram(String s, String t);

    /**
     * 字符串转整数 (atoi)
     * 方法：获取有效字符串
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int myAtoi(String str);

    /**
     * 验证回文字符
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 方法：分割字符为字符数组
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    boolean isPalindrome(String string);

    /**
     * 实现strStr()
     * 在 A 字符串中找出 B 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     * 方法：使用双指针发进行比较
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    int strStr(String haystack, String needle);

    /**
     * 实现strStr()
     * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
     * 方法：
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    String countAndSay(int n);
}
