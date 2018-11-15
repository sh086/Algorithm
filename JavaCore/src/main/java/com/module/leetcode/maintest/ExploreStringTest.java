package com.module.leetcode.maintest;

import com.common.context.SpringContext;
import com.module.leetcode.explore.services.StringService;
import org.junit.Before;
import org.junit.Test;

/**
 * 字符串类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class ExploreStringTest extends SpringContext<StringService> {

    private StringService stringService;

    @Before
    public void before(){
        stringService  = getBean("stringServiceImpl");
    }

    /**
     * 反转字符串
     * */
    @Test
    public void reverseString(){
        String string = "A man, a plan, a canal: Panama";
        String result = stringService.reverseString(string);
        System.out.println(result);
    }

    /**
     * 反转整数
     * */
    @Test
    public void reverse(){
        int target = 1534236469;
        System.out.println(stringService.reverse(target));
    }

    /**
     * 字符串中的第一个唯一字符
     * */
    @Test
    public void firstUniqChar(){
        String string = "loveleetcode";
        System.out.println(stringService.firstUniqChar(string));
    }

    /**
     * 有效的字母异位词
     * */
    @Test
    public void isAnagram(){
        String s = "anagram", t = "nagaram";
        System.out.println(stringService.isAnagram(s,t));
    }

    /**
     * 验证回文字符串
     * */
    @Test
    public void isPalindrome(){
        String target = " apG0i4maAs::sA0m4i0Gp0";
        System.out.println(stringService.isPalindrome(target));
    }

    /**
     * 字符串转整数
     * */
    @Test
    public void myAtoi(){
        String target = "-91283472332";
        System.out.println(stringService.myAtoi(target));
    }
}
