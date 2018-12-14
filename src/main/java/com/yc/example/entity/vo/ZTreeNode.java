package com.yc.example.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ZTreeNode {
    private String id;

    @JsonProperty
    private String pId;
    private String name;
    private Boolean open = false;
    private Boolean checked = false;
}
