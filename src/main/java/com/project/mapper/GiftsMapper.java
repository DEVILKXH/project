package com.project.mapper;

import org.apache.ibatis.annotations.Param;

import com.project.entity.Gifts;
import com.project.inner.base.mapper.BaseMapper;

public interface GiftsMapper extends BaseMapper<Gifts>{

	int getCount(@Param("gifts")String gifts, @Param("createTime")String createTime);
}