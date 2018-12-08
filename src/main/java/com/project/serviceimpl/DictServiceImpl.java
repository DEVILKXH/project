package com.project.serviceimpl;

import org.springframework.stereotype.Service;

import com.project.entity.Dict;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.mapper.DictMapper;
import com.project.service.DictService;

@Service
public class DictServiceImpl extends BaseServiceImpl<Dict, DictMapper> implements DictService{
}