package com.su.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author suzhenghui
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3705561650678621512L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
