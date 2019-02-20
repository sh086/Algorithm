package com.module.leetcode.explore.services.impl;

import com.module.leetcode.explore.services.ArrayService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 数组类练习算法 实现类
 * @author suhe
 * @since 2018年11月10日08:19:00
 * */
@Service
public class ArrayServiceImpl implements ArrayService {

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
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }
       return new ArrayList<>(set).get(0);
    }

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> maps = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        //进栈
        for(int i = 0; i < nums1.length; i++){
            int n = maps.get(nums1[i]) == null ? 0 :maps.get(nums1[i]);
            maps.put(nums1[i],n +1);
        }
        //出栈
        for(int i = 0; i < nums2.length; i++){
            if(maps.get(nums2[i]) !=null && maps.get(nums2[i]) > 0){
                result.add(nums2[i]);
                maps.put(nums2[i],maps.get(nums2[i])-1);
            }
        }
        //转为int[]
        int[] num = new int[result.size()];
        for(int k = 0; k < result.size(); k++){
            num[k] = result.get(k);
        }
        return num;
    }

    @Override
    public int[] intersectOrder(int[] nums1, int[] nums2) {
        List<Integer> lists = new ArrayList<>();
        int n = nums1.length > nums2.length ? nums2.length : nums1.length;
        int i = 0,j = 0;
        while(i < n && j < n){
            if(nums1[i] == nums2[j]){
                lists.add(nums1[i]);
                i++;j++;
            }else if(nums1[i] > nums1[j]){
                j++;
            }else {
                i++;
            }
        }
        int[] num = new int[lists.size()];
        for(int k = 0; k < lists.size(); k++){
            num[k] = lists.get(k);
        }
        return num;
    }

    @Override
    public int[] plusOne(int[] digits) {
        //bit表示下一位到上一位的进位值
        int bit = 1;
        for(int i = digits.length-1; i >= 0 && bit!=0; i--){
            //最末尾加一
            int sum = digits[i] + bit;
            if(sum >= 10){
                digits[i] = sum % 10;
            }else {
                digits[i] = sum;
            }
            bit = sum /10;
        }
        if(bit != 0){
            int[] result = new int[digits.length+1];
            result[0] = bit;
            for (int n = 0; n < digits.length;n++){
                result[n+1] = digits[n];
            }
            digits = result;
        }
        return digits;
    }

    @Override
    public void moveZeroes(int[] nums) {
        int m =0,n=0;
        //确定倒数第一个不为0的位置
        for(int i= nums.length-1; i >= 0; i--){
            if(nums[i] != 0){
                m = i;n = i-1;
                break;
            }
        }
        while (n >= 0){
            if(nums[n] == 0){
                //交换m、n的值
                nums[n] = nums[m];
                nums[m--] = 0;
            }
            n--;
        }
    }

    @Override
    public void moveZeroesOrder(int[] nums) {
        //m: 第一个不为0的位置，默认队尾
        //n: 下一个索引下标
        int m =nums.length-1,n=nums.length;
        //确定正数第一个不为0的位置
        for(int i= 0; i < nums.length; i++){
            if(nums[i] == 0){
                m = i;n = i+1;
                break;
            }
        }
        while (n < nums.length){
            if(nums[n] != 0){
                //交换m、n的值
                nums[m++] = nums[n];
                nums[n] = 0;
            }
            n++;
        }
    }

    @Override
    public int[] targetMakeUp (int[] numbers, int target) {
        int [] targetNum = null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                targetNum = new int[]{i,map.get(temp)};
            }
            map.put(numbers[i],i);
        }
        return targetNum;
    }

    @Override
    public void rotate(int[][] matrix) {

    }
}
