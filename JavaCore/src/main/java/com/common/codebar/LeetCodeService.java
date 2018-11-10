package com.common.codebar;


/**
 * LeetCode题库算法
 * @author suhe
 * @since 2018年11月10日07:04:33
 * */
public interface LeetCodeService {

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * 方法：遍历一遍哈希表
     * 来源：LeetCode
     * 时间复杂度：O(n)、空间复杂度O(n)
     * */
    int[] targetMakeUp (int[] numbers, int target);

    /**
     * 判断字符串是否对应
     * 方法：分割字符为字符数组
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
     boolean charSymmetry (String string);

    /**
     * 判断整数是否是回文数
     * 方法：反转一半数字
     * 空间复杂度：O(log10 n))、空间复杂度：O(1)
     * */
    boolean isPalindrome(int x);

    /**
     * 反转int整数
     * 方法：
     * 时间复杂度：
     * */
    int reverse(int x);

}
