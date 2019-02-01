package com.common.response;

import lombok.Data;

/**
 * 结果返回类型
 * @author sueh
 * @since 2019年2月1日13:53:57
 * */
@Data
public class ResultModal {

    private String code;

    private Boolean result = true;

    private String message;

    private Object data;
}
