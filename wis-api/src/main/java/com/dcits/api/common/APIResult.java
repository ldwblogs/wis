package com.dcits.api.common;

import lombok.Data;


/**
 * 一些声明信息
 * Description: API通用返回结果集
 * date: 2020/9/1 17:27<br/>
 *
 * @author lidw3<br />
 * @since JDK 1.8
 */
@Data
public class APIResult<T> {
    //返回码
    private Integer code;
    //返回消息
    private String msg;
    //返回数据
    private T data;
}

