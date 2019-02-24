package com.module.leetcode;

import com.module.leetcode.service.ContextService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LinearServiceTest {

    @Resource
    private ContextService linearService;

    /**
     * 回文数
     * */
    @Test
    public void isPalindrome(){
        int target = 22;
        System.out.println(linearService.isPalindrome(target));
    }
}