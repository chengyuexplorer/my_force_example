package com.yc.example.dao;

import com.yc.example.entity.Example;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);
}