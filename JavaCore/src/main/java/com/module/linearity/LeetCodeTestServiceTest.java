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
     *  方法：只买进盈利的天数即可
     *  @a
     * */
    @Test
    public void maxProfit() {
        int[] target ={7,6,4,3,1};
        int count = leetCodeTestService.maxProfit(target);
        System.out.println(count);
    }
}
