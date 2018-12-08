package com.project.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entity.User;
import com.project.inner.vo.AjaxResult;
import com.project.service.UserService;

@Controller
public class LoginRest{

	@Autowired
	private UserService userService;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index(){
		return "gifts/index";
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public AjaxResult<User> doLogin(User user){
		return null;
	}
	
	@RequestMapping("/doLogout")
	@ResponseBody
	public String doLogout(){
		session.invalidate();
		return null;
	}
	
}
