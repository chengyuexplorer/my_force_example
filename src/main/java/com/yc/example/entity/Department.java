package com.yc.example.entity;

import lombok.Data;

@Data
public class Department {
    private Integer id;

    private Integer org;

    private Integer pid;

    private String name;

    private String code;

    private String director;

    private String shortName;

    private Integer property;

    private String phone;

    private String phoneExtension;

    private String mail;

    private String remark;

    private String fax;

    private Short status;


}