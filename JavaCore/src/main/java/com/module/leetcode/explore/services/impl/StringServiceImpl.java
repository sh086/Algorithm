package com.module.leetcode.explore.services.impl;

import com.module.leetcode.explore.services.StringService;
import org.springframework.stereotype.Service;

/**
 * 字符串类练习算法 实现类
 * @author suhe
 * @since 2018年11月10日08:19:00
 * */
@Service
public class StringServiceImpl implements StringService {

    @Override
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0,j = s.length()-1; i < j; i++,j--){
            //交换i、j位置
            chars[i] += chars[j];
            chars[j] =(char)(chars[i] - chars[j]);
            chars[i] =(char)(chars[i] - chars[j]);
        }
        return String.valueOf(chars);
    }

    @Override
    public int reverse(int x) {
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

    @Override
    public boolean isPalindrome(String string) {
        char[] digest = string.toCharArray();
        //去除特殊字符、转化字符大小写
        //m : 正数第一个有效值
        //n : 索引查询有效值
        int m= -1,n = 0;
        while (n < digest.length){
            boolean flag = false;
            boolean sample = (digest[n] <= 'z' && digest[n] >= 'a')
                    || (digest[n] <= '9' && digest[n] >= '0');
            if(digest[n] <= 'Z' && digest[n] >= 'A'){
                digest[n] -= 'A'-'a';   flag = true;
            }else if(sample){
                flag = true;
            }
            if(flag){
                digest[++m] = digest[n++];
            }else {
                n++;
            }
        }
        //验证字符串
        int i = 0;
        while (i <= m){
            if (digest[i++] != digest[m--]) {
                return false;
            }
        }
        return true;
    }
}
