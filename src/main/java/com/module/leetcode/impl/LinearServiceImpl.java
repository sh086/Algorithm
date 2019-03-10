package com.module.leetcode.impl;

import com.module.leetcode.LinearService;
import org.springframework.stereotype.Service;

/**
 * 线性题库算法 实现类
 * @author suhe
 * @since 2018年11月10日07:04:56
 * */
@Service
public class LinearServiceImpl implements LinearService {

   @Override
    public boolean isPalindrome(int x) {
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

        //当位数为偶数时，原始数字 = 反转数字
        //当位数为奇数时，可以通过 反转数字/10 去除处于中位的数字
        return x == revertedNumber || x == revertedNumber/10;
    }
}
