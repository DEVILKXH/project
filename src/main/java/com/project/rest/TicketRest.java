package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entity.Ticket;
import com.project.inner.base.controller.BaseController;
import com.project.inner.vo.AjaxResult;
import com.project.service.TicketService;


@Controller
@RequestMapping(value = "/a/ticket")
public class TicketRest extends BaseController<Ticket, TicketService>{
	
	@RequestMapping(value = "")
	public String index(){
		return "ticket/index";
	}
	
	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	public AjaxResult<Ticket> insertSelective(@RequestBody Ticket record){
		
		return service.add(record);
	}
}
