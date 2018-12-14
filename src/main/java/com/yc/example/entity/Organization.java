package com.yc.example.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Organization {
    private Integer id;

    private String region;

    private String name;

    private Integer pid;

    private Date createtime;

    private String director;

    private String telephone;

    private Integer province;

    private Integer city;

    private Integer county;

    private String address;

    private Integer status;

    private String remark;

    private String fullid;


}