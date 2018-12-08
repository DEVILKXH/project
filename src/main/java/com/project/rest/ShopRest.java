package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Shop;
import com.project.inner.base.controller.BaseController;
import com.project.service.ShopService;

@Controller
@RequestMapping(value = "/a/shop")
public class ShopRest extends BaseController<Shop, ShopService>{
	
	@RequestMapping(value = "")
	public String index(){
		return "shop/index";
	}
}
