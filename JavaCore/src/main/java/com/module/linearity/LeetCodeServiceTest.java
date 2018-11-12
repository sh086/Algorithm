package com.module.linearity;

import com.common.codebar.LeetCodeService;
import com.common.context.SpringContext;
import com.common.utils.ConsoleUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * 数字类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class LeetCodeServiceTest extends SpringContext {

    private LeetCodeService leetCodeService;

    @Before
    public void before(){
        leetCodeService = (LeetCodeService) getBean("LeetCodeServiceImpl");
    }


    /**
     * 回文数
     * */
    @Test
    public void isPalindrome(){
        int target = 22;
        System.out.println(leetCodeService.isPalindrome(target));
    }
}
