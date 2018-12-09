package com.project.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.entity.Coupon;
import com.project.entity.Gifts;
import com.project.inner.util.ExcelUtil;
import com.project.service.CouponService;
import com.project.service.GiftsService;

@Controller
@RequestMapping(value = "/a/admin")
public class AdminRest {

	@Autowired
	private HttpServletResponse response;
	
	@Autowired
	private CouponService couponService;
	
	@Autowired
	private GiftsService giftsService;
	
	@RequestMapping(value = "")
	public String index(){
		return "admin/index";
	}
	
	@RequestMapping(value = "/exportGifts.do")
	public void exportGifts() throws Exception{
		List<Gifts> gifts = giftsService.selectAll();
		XSSFWorkbook wb = ExcelUtil.getWorkBook(gifts, Gifts.class);
		response.setContentType("application/force-download");
		response.setHeader("Content-Disposition", "attachment;filename=\"" + java.net.URLEncoder.encode("礼品领取", "UTF-8") + ".xlsx" + "\" ");
		wb.write(response.getOutputStream());
	}
	
	@RequestMapping(value = "/exportCoupon.do")
	public void exportCoupon() throws Exception{
		List<Coupon> coupons = couponService.getCoupouAllList();
		XSSFWorkbook wb = ExcelUtil.getWorkBook(coupons, Coupon.class);
		response.setContentType("application/force-download");
		response.setHeader("Content-Disposition", "attachment;filename=\"" + java.net.URLEncoder.encode("整点抽", "UTF-8") + ".xlsx" + "\" ");
		wb.write(response.getOutputStream());
	}
}
