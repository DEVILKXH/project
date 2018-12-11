package com.project.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.entity.Ticket;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.inner.vo.AjaxResult;
import com.project.mapper.TicketMapper;
import com.project.service.TicketService;

@Service
public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketMapper> implements TicketService{

	@Override
	public List<Ticket> getCoupouAllList() {
		return mapper.getCoupouAllList();
	}

	@Override
	public AjaxResult<Ticket> add(Ticket record) {
		String coupons = record.getCouponNo();
		String []coupon = coupons.split(";");
		AjaxResult<Ticket> ajax = new AjaxResult<Ticket>();
		for(String c: coupon){
			Ticket ticket = new Ticket();
			ticket.setId(UUID.randomUUID().toString());
			ticket.setVipNo(record.getVipNo());
			ticket.setShopName(record.getShopName());
			ticket.setShopType(record.getShopType());
			ticket.setCouponNo(c);
			mapper.insert(ticket);
		}
		ajax.setStatus("200");
		ajax.setMessage("成功");
		return ajax;
	}
}