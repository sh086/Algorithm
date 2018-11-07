package com.common.algorithm.manual;

/**
 * 数学类算法
 * @author suhe
 * @since 2018年11月6日12:00:48
 * */

public class MathHelper {

    /**
     * 判断整数是否是回文数
     * 方法：反转一半数字
     * 空间复杂度：O(log10 n))、空间复杂度：O(1)
     * */
    public static boolean isPalindrome(int x) {
        // 当 x < 0 时，x 不是回文数。
        // 除0外，如果数字的最后一位是 0，x 不是回文数。
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        //原始数字除以 10，然后给反转后的数字乘上 10，
        //当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        //当位数为奇数时，可以通过 反转数字/10 去除处于中位的数字。
        //当位数为偶数时，原始数字 = 反转数字
        return x == revertedNumber || x == revertedNumber/10;
    }
}