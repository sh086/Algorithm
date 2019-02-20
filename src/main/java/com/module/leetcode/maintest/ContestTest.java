package com.module.leetcode.maintest;

import com.Application;
import com.module.leetcode.contest.services.LinearService;
import com.common.context.SpringContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 数字类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ContestTest extends SpringContext {

    private LinearService leetCodeService;

    @Before
    public void before(){
        leetCodeService = (LinearService) getBean("LeetCodeServiceImpl");
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
