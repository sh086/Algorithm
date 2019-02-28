package com.module.leetcode;

import com.module.leetcode.context.LinearService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class LinearServiceTest {

    @Resource
    private LinearService linearService;

    /**
     * 回文数
     * */
    @Test
    public void isPalindrome(){
        assertTrue (linearService.isPalindrome(1));
        assertTrue (linearService.isPalindrome(11));
        assertTrue (linearService.isPalindrome(234565432));
        assertFalse (linearService.isPalindrome(1213));
    }
}