package com.common.algorithm.toolbar;

/**
 * 数字 练习算法
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class NumberBar {

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

    /**
     * 反转int整数
     * 方法：
     * 时间复杂度：
     * */
    public static int reverse(int x) {
        int flag = x<0 ? -1:1;
        int number = Math.abs(x);
        Long reverse = 0L;
        while (number > 0){
            reverse = reverse * 10 +number%10;
            number /= 10;
        }
        if(reverse > Integer.MAX_VALUE){
            return 0;
        }
        return reverse.intValue()*flag;
    }
}