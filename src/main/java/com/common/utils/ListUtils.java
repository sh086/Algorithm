package com.common.utils;

import com.common.modal.ListNode;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class ListUtils {

    /**
     * 将List字符串转换成List链表
     * @param listString [1,2,3,4,5]
     * @return 1->2->3->4->5
     * */
    public static ListNode changeStringToList(String listString){
        ListNode list = null;
        if(StringUtils.isNotBlank(listString)){
            listString = listString.replace("[","")
                    .replace("]","");
            val strList = listString.split(",");

            list = new ListNode(Integer.parseInt(strList[0].trim()));
            ListNode node = list;
            for(int i = 1; i < strList.length; i++){
                node.next = new ListNode(Integer.parseInt(strList[i]));
                node = node.next;
            }
        }
        return list;
    }

    /**
     * 打印List集合
     * */
    public static void printLinkList(ListNode node){
        StringBuilder stringBuffer = new StringBuilder("");
        while(node != null){
            stringBuffer.append(node.val).append(",");
            node = node.next;
        }
        if(stringBuffer.length() > 0){
            stringBuffer.substring(0,stringBuffer.length()-1);
        }
        log.info("{}{}{}","[",stringBuffer,"]");
    }
}
