package com.project.serviceimpl;

import org.springframework.stereotype.Service;

import com.project.entity.Shop;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.mapper.ShopMapper;
import com.project.service.ShopService;

@Service
public class ShopServiceImpl extends BaseServiceImpl<Shop, ShopMapper> implements ShopService{
}