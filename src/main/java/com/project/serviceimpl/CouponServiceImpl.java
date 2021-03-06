package com.project.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Coupon;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.mapper.CouponMapper;
import com.project.service.CouponService;

@Service
public class CouponServiceImpl extends BaseServiceImpl<Coupon, CouponMapper> implements CouponService{

	@Override
	public List<Coupon> getCoupouAllList() {
		return mapper.getCoupouAllList();
	}
}