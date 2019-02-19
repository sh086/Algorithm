package com.module.merchant.modal;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 用户模型类型
 * */
@Data
public class UserModal {

    private Long id;

    @NotBlank(message = "用户名不能为空")
    @Length(min = 2,max = 255,message = "用户名长度必须在3-255个字符")
    private String name;

    @Min(value = 18,message = "年龄必须满18岁")
    private Integer age;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱不合法")
    private String email;

    @NotBlank(message = "密码不能为空")
    private String passWord;
}
