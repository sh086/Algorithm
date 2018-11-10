package com.module.linearity;

import com.common.codebar.LeetCodeTestService;
import com.common.context.SpringContext;
import com.common.utils.ConsoleUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * 数字类算法  测试类
 * @author suhe
 * @since 2018年11月6日10:32:02
 * */

public class LeetCodeTestServiceTest extends SpringContext<LeetCodeTestService> {

    private LeetCodeTestService leetCodeTestService;

    @Before
    public void before(){
        leetCodeTestService  = getBean("leetCodeTestImpl");
    }

    /**
     *  从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target ={0,0,1,1,1,2,2,3,3,4};
        int count = leetCodeTestService.removeDuplicates(target);
        ConsoleUtils.printArray(target,count);
    }

    /**
     *  买卖股票的最佳时机 II
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = leetCodeTestService.maxProfit(target);
        System.out.println(count);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void rotate() {
        int[] target ={1,2,3,4,5,6};
        int k = 4;
        leetCodeTestService.rotate(target,k);
        ConsoleUtils.printArray(target);
    }

    /**
     *  旋转数组
     * */
    @Test
    public void containsDuplicate() {
        int[] target ={1,2,3,1};
        Boolean bool = leetCodeTestService.containsDuplicate(target);
        System.out.println(bool);
    }
}
