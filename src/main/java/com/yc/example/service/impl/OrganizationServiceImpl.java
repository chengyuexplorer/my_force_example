package com.yc.example.service.impl;

import com.yc.example.dao.OrganizationMapper;
import com.yc.example.entity.Organization;
import com.yc.example.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    OrganizationMapper organizationMapper;
    @Override
    public List<Organization> queryAll() {
        return organizationMapper.selectAll();
    }
}
