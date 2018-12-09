package com.project.rest;

import java.util.Calendar;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entity.Gifts;
import com.project.inner.base.controller.BaseController;
import com.project.inner.vo.AjaxResult;
import com.project.service.GiftsService;

@Controller
@RequestMapping(value = "/a/gifts")
public class GiftsRest extends BaseController<Gifts, GiftsService>{

	@RequestMapping(value = "")
	public String index(){
		return "gifts/index";
	}
	
	@RequestMapping(value = "/insertSelective.do",method={RequestMethod.POST})
	@ResponseBody
	@Override
	public AjaxResult<Gifts> insertSelective(@RequestBody Gifts record){
		AjaxResult<Gifts> ajax = new AjaxResult<Gifts>();
		Gifts _gifts = new Gifts(record.getVipNo());
		Gifts gifts = service.selectOne(_gifts);
		if(gifts != null){
			ajax.setStatus("500");
			ajax.setMessage("今天已领取礼品");
			return ajax;
		}
		
		
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DATE);
		if(day != 22 && day != 23){
			ajax.setStatus("500");
			ajax.setMessage("未到活动时间");
			return ajax;
		}
		int hour = c.get(Calendar.HOUR_OF_DAY);
		if(hour >= 10 && hour <= 12){
			record.setGift("定制纸巾");
			int count = service.getCount("定制纸巾", "2018-12-" + day);
			if(day == 22){
				if(count == 800){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}else if(day == 23){
				if(count == 700){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}
		}
		else if(hour >= 14 && hour <= 15){
			record.setGift("定制购物袋");
			int count = service.getCount("定制购物袋", "2018-12-" + day);
			if(day == 22){
				if(count == 400){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}else if(day == 23){
				if(count == 400){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}
		}
		else if(hour >= 17 && hour <= 18){
			record.setGift("定制玩偶");
			int count = service.getCount("定制玩偶", "2018-12-" + day);
			if(day == 22){
				if(count == 400){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}else if(day == 23){
				if(count == 400){
					ajax.setStatus("500");
					ajax.setMessage("今天礼品已领取完");
					return ajax;
				}
			}
		}else{
			ajax.setStatus("500");
			ajax.setMessage("未到活动时间");
			return ajax;
		}
		record.setId(UUID.randomUUID().toString());
		int flag = service.insertSelective(record);
		if(flag == 0){
			ajax.setStatus("500");
			ajax.setMessage("插入失败");
		}else{
			ajax.setStatus("200");
			ajax.setMessage(record.getGift());
			ajax.setObject(service.selectByPrimaryKey(record.getId()));
		}
		return ajax;
	}
}
