package com.project.serviceimpl;

import org.springframework.stereotype.Service;

import com.project.entity.Gifts;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.mapper.GiftsMapper;
import com.project.service.GiftsService;

@Service
public class GiftsServiceImpl extends BaseServiceImpl<Gifts, GiftsMapper> implements GiftsService{
}