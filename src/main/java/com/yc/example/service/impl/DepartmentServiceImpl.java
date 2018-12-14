package com.yc.example.service.impl;

import com.yc.example.dao.DepartmentMapper;
import com.yc.example.entity.Department;
import com.yc.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryAll() {
        return departmentMapper.selectAll();
    }
}
