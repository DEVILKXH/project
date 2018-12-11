package com.project.mapper;

import java.util.List;

import com.project.entity.Ticket;
import com.project.inner.base.mapper.BaseMapper;

public interface TicketMapper extends BaseMapper<Ticket>{
	public List<Ticket> getCoupouAllList();
}