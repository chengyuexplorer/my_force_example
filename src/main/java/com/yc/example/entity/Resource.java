package com.yc.example.entity;

import lombok.Data;

@Data
public class Resource {
    private Integer id;

    private Integer pid;

    private Integer org;

    private String sn;

    private String type;

    private String title;

    private String url;

    private Integer sort;

    private String method;

    private String dom;

    private String remark;

}