package com.module.leetcode.core;

/**
 * LeetCode初级算法
 * @author suhe
 * @since 2019年2月24日18:28:10
 * */
public interface PrimaryServices {

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
     *  将数组中的元素向右移动 k 个位置(旋转数组)
     * 方法：按照数组长度取余
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param k  k 是非负数
     */
    void rotate(int[] nums, int k);

    /**
     * 判断是否存在重复元素（存在重复）
     * 方法：使用set类型去重
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @return 如果任何值在数组中出现至少两次，函数返回 true
     *          如果数组中每个元素都不相同，则返回 false。
     * */
    boolean containsDuplicate(int[] nums);

    /**
     * 只出现一次的数字
     * 非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
     * 方法：只出现一下，则改数字
     * 时间复杂度：O(n)  空间复杂度：O(n)
     * @param nums 数组中必须有
     * */
    int singleNumber(int[] nums);

    /**
     * 两个未排序数组的交集 II
     * 方法：基数排序
     * 时间复杂度：O(n)  空间复杂度：O(n)
     * @param nums1 未排序数组
     * @param nums2 未排序数组
     * @return 未排序的交集数组
     * */
    int[] intersect(int[] nums1, int[] nums2);

    /**
     * 两个正序数组的交集 II
     * 方法：双指针法
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * @param nums1 正序数组
     * @param nums2 正序数组
     * @return 正序的数组
     * */
    int[] intersectOrder(int[] nums1, int[] nums2);

    /**
     * 整数组成的非空数组所表示的非负整数，在该数的基础上加一（加一）
     * 方法：只出现一下，则改数字
     * 时间复杂度：O(n)  空间复杂度：O(n)
     * */
    int[] plusOne(int[] digits);

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序（移动零）
     * 方法：双标法，从尾部开始移动非0元素（无序）
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * */
    void moveZeroes(int[] nums);

    /**
     * 将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
     * 方法：双标法，从头部开始移动非0元素（有序）
     * 时间复杂度：O(n)  空间复杂度：O(1)
     * */
    void moveZeroesOrder(int[] nums);

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数（两数之和）
     * 方法：遍历一遍哈希表
     * 时间复杂度：O(n)、空间复杂度O(n)
     * */
    int[] targetMakeUp(int[] numbers, int target);

    /**
     * 原地旋转图像
     * 方法：遍历一遍哈希表
     * 时间复杂度：O(n)、空间复杂度O(n)
     * */
    void rotate(int[][] matrix);

    /**
     * 反转字符串
     * 方法：分割字符为字符数组
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    String reverseString(String s);

    /**
     * 反转int整数（颠倒整数）
     * 方法：求余数
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int reverse(int x);

    /**
     * 字符串中的第一个唯一字符
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * 方法：使用Map记录已经出现过的字符值次数
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int firstUniqChar(String s);

    /**
     * 有效的字母异位词
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
     * 方法：排序
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    boolean isAnagram(String s, String t);

    /**
     * 字符串转整数 (atoi)
     * 方法：获取有效字符串
     * 时间复杂度：O(n)、空间复杂度O(1)
     * */
    int myAtoi(String str);

    /**
     * 验证回文字符
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * 方法：分割字符为字符数组
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    boolean isPalindrome(String string);

    /**
     * 实现strStr()
     * 在 A 字符串中找出 B 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     * 方法：使用双指针发进行比较
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    int strStr(String haystack, String needle);

    /**
     * 实现strStr()
     * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
     * 方法：递归
     * 空间复杂度：O(n)
     * */
    String countAndSay(int n);

    /**
     * 最长公共前缀
     * 查找字符串数组中的最长公共前缀
     * 方法：
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    String longestCommonPrefix(String[] strs);

    /**
     * 最长公共字符擦混
     * 查找字符串数组中的最长公共前缀
     * 方法：indexOf
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    String longestCommonString(String[] strs);
}
