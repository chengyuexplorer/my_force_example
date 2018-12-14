package com.yc.example.controller;

import com.yc.example.entity.Department;
import com.yc.example.entity.vo.Response;
import com.yc.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    public String dept(){
        return "department";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Response<Object> getAll(){
        List<Department> result = departmentService.queryAll();
        return new Response<>(result);
    }

}
