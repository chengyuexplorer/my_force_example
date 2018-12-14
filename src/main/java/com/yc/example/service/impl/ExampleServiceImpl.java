package com.yc.example.service.impl;

import com.yc.example.dao.ExampleMapper;
import com.yc.example.entity.Example;
import com.yc.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    ExampleMapper exampleMapper;

    @Override
    public Example queryEntityById(Integer id) {
        return exampleMapper.selectByPrimaryKey(id);
    }
}
