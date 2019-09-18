package net.yangwenxin.frame.model;

import lombok.Data;

/**
 * 客户
 *
 * @author yangwenxin
 * @Date 2019-9-18 14:59
 */
@Data
public class Customer {

    private Long id;

    private String name;

    private String contact;

    private String telephone;

    private String email;

    private String remark;
}
