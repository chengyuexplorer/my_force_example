package com.yc.example.controller;

import com.yc.example.entity.Organization;
import com.yc.example.entity.vo.Response;
import com.yc.example.entity.vo.ZTreeNode;
import com.yc.example.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @GetMapping
    public String organization(){
        return "organization";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Response<List<ZTreeNode>> getAll(){
        List<Organization> orgList = organizationService.queryAll();
        List<ZTreeNode> nodes = new ArrayList<>();
        for (Organization org : orgList) {
            ZTreeNode node = new ZTreeNode();
            node.setId(org.getId().toString());
            node.setPId(org.getPid().toString());
            node.setName(org.getName());
            if (org.getId() == 1){
                node.setOpen(true);
            }
            nodes.add(node);
        }
        return new Response<>(nodes);
    }
}
