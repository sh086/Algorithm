package com.common.codebar.impl;

import com.common.codebar.LeetCodeTestService;
import org.springframework.stereotype.Service;

/**
 * LeetCode练习算法 实现类
 * @author suhe
 * @since 2018年11月10日08:19:00
 * */
@Service
public class LeetCodeTestImpl implements LeetCodeTestService {

    @Override
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 0){
            return 0;
        }
        int i = 0,j = 1;
        while(j < nums.length){
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        //下标从0计，长度从1计
        return i+1;
    }

    @Override
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0;i < prices.length-1;i++){
            int money = prices[i+1]-prices[i];
            if(money > 0){
                maxProfit += money;
            }
        }
        return maxProfit;
    }
}
