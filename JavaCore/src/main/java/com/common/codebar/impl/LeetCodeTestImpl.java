package com.common.codebar.impl;

import com.common.codebar.LeetCodeTestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Override
    public void rotate(int[] nums, int k) {
        //若k为数组长度的倍数，则不做处理
        if(k <=0 || nums == null || k % nums.length == 0){
            return;
        }
        //取最简k值
        k = k % nums.length;
        for(int i =0; i < k ;i++){
            int temp = nums[nums.length-1];
            for(int m = nums.length -1; m > 0; m --){
                nums[m] = nums[m-1];
            }
            nums[0] = temp;
        }
    }

    @Override
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length <=0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> arrays = new ArrayList<>(set);
        return !(arrays.size() == nums.length);
    }

    @Override
    public int singleNumber(int[] nums) {

    }
}
