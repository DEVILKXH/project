package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Gifts;
import com.project.inner.base.controller.BaseController;
import com.project.service.GiftsService;

@Controller
@RequestMapping(value = "/a/gifts")
public class GiftsRest extends BaseController<Gifts, GiftsService>{

	@RequestMapping(value = "")
	public String index(){
		return "gifts/index";
	}
}
