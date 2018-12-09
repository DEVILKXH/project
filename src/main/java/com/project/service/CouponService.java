package com.project.service;

import java.util.List;

import com.project.entity.Coupon;
import com.project.inner.base.service.BaseService;

public interface CouponService extends BaseService<Coupon>{
	
	public List<Coupon> getCoupouAllList();
}