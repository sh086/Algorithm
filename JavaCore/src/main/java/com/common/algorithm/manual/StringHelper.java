package com.common.algorithm.manual;

import org.junit.platform.commons.util.StringUtils;

/**
 * 字符串类算法
 * @author suhe
 * @since 2018年11月7日13:58:49
 * */
public class StringHelper {

    /**
     * 判断字符串是否对应
     * 方法：分割字符为字符数组
     * 空间复杂度：O(n)、空间复杂度：O(n)
     * */
    public static boolean charSymmetry (String string) {
        if(StringUtils.isBlank(string)){
            return false;
        }
        byte[] digest = string.getBytes();
        if (digest.length >= 1) {
            for (int i = 0, j = digest.length-1; i <= j; i++, j--) {
                if (digest[i] != digest[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
