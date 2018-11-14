package com.module.leetcode.contest.services;


/**
 * 线性题库算法
 * @author suhe
 * @since 2018年11月10日07:04:33
 * */
public interface LinearService {


    /**
     * 判断整数是否是回文数
     * 方法：反转一半数字
     * 空间复杂度：O(log10 n))、空间复杂度：O(1)
     * */
    boolean isPalindrome(int x);

}
