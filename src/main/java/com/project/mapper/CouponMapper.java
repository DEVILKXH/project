package com.project.mapper;

import java.util.List;

import com.project.entity.Coupon;
import com.project.inner.base.mapper.BaseMapper;

public interface CouponMapper extends BaseMapper<Coupon>{
	public List<Coupon> getCoupouAllList();
}