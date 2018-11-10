package com.common.codebar;

/**
 * LeetCode练习算法
 * @author suhe
 * @since 2018年11月10日07:04:33
 * */

public interface LeetCodeTestService {

    /**
     * 从排序数组中删除重复项,并保证数字有序
     * 方法：对于有序数组，可以使用双指针法去重
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param nums 已排序的数组
     * @return 不重复的列表长度
     * */
    int removeDuplicates(int[] nums);

    /**
     *  买卖股票的最佳时机 II(不能同时参与多笔交易)
     *  方法：只买进盈利的天数即可
     *  时间复杂度：O(n)  空间复杂度：O(1)
     * @param prices 给定股票第 i 天的价格
     * @return 最大利润
     * */
    int maxProfit(int[] prices);

    /***
     *  回旋平移数组
     * 方法：按照数组长度取余
     * 时间复杂度：O(n)  空间复杂度：O(1)
     */
    void rotate(int[] nums, int k);

    /**
     * 判断是否存在重复元素
     * 方法：使用set类型去重
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @return 如果任何值在数组中出现至少两次，函数返回 true
     *          如果数组中每个元素都不相同，则返回 false。
     * */
    boolean containsDuplicate(int[] nums);

    /**
     * 只出现一次的数字
     * 方法：只出现一下，则改数字
     * */
    int singleNumber(int[] nums);
}
