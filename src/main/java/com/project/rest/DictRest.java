package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Dict;
import com.project.inner.base.controller.BaseController;
import com.project.service.DictService;

@Controller
@RequestMapping(value = "/a/dict")
public class DictRest extends BaseController<Dict, DictService>{

	@RequestMapping(value = "")
	public String index(){
		return "dict/index";
	}
}
