package com.project.service;

import java.util.List;

import com.project.entity.Ticket;
import com.project.inner.base.service.BaseService;
import com.project.inner.vo.AjaxResult;

public interface TicketService extends BaseService<Ticket>{
	
	public List<Ticket> getCoupouAllList();

	public AjaxResult<Ticket> add(Ticket record);
}