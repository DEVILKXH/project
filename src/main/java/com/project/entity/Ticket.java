package com.project.entity;

import java.util.Date;

import com.project.inner.base.annotation.ExcelColumn;
import com.project.inner.base.annotation.ExcelTable;
import com.project.inner.base.entity.BaseEntity;

@ExcelTable(name = "刮刮乐表格导出")
public class Ticket extends BaseEntity{
	@ExcelColumn(name = "会员号", index = 1)
    private String vipNo;

    private String money;

	@ExcelColumn(name = "商店类型", index = 2)
    private String shopType;

	@ExcelColumn(name = "店名", index = 3)
    private String shopName;
    
    private Integer num;
	
    @ExcelColumn(name = "刮刮乐号", index = 4)
	private String couponNo;

	@ExcelColumn(name = "时间", index = 5)
    private Date createTime;
	
    public String getVipNo() {
        return vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo == null ? null : vipNo.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
    
}