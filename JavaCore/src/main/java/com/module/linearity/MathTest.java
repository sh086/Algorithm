package com.module.linearity;

import com.common.algorithm.manual.MathHelper;
import org.junit.Test;

/**
 * 数学类算法  测试类
 * @author suhe
 * @since 2018年11月6日13:33:09
 * */

public class MathTest {
    /**
     * 回文数
     * */
    @Test
    public void targetMade(){
        int target = 22;
        System.out.println(MathHelper.isPalindrome(target));
    }
}
