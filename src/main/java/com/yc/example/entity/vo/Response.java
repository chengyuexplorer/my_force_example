package com.yc.example.entity.vo;

import lombok.Data;

@Data
public class Response<T> {
    /**
     * 请求是否成功
     */
    private int code = 200;
    /**
     * 返回消息
     */
    private String msg;
    /**
     * 返回数据
     */
    public T data;
    /**
     * 数据总量，用于分页
     */
    private long count = 0;

    public Response(T data) {
        this.data = data;
    }

    public Response() {

    }
}
