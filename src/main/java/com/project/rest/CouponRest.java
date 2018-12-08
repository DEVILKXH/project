package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Coupon;
import com.project.inner.base.controller.BaseController;
import com.project.service.CouponService;


@Controller
@RequestMapping(value = "/a/coupon")
public class CouponRest extends BaseController<Coupon, CouponService>{
	
	@RequestMapping(value = "")
	public String index(){
		return "coupon/index";
	}
}
