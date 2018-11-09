package com.module.linearity;

import com.common.algorithm.manual.ArrayHelper;
import com.common.utils.ArrayUtils;
import com.common.utils.ConvertUtils;
import org.junit.Test;

import java.util.List;


public class ArrayTest {
    /**
     * 从排序数组中删除重复项
     * */
    @Test
    public void removeDuplicates(){
        int[] target = { 0,0,1,1,1,2,2,3,3,4 };
        List<Integer> asList = ConvertUtils.convertToInteger(target);
        System.out.println(ArrayHelper.removeDuplicate(asList));
    }
}
