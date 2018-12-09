package com.project.entity;

import java.util.Date;

import com.project.inner.base.annotation.ExcelColumn;
import com.project.inner.base.annotation.ExcelTable;
import com.project.inner.base.entity.BaseEntity;

@ExcelTable(name = "礼品领取")
public class Gifts extends BaseEntity{
	
	@ExcelColumn(name = "礼品", index = 1)
    private String gift;

	@ExcelColumn(name = "会员号", index = 2)
    private String vipNo;

	@ExcelColumn(name = "时间", index = 3)
    private Date createTime;

    private String vipNew;

    private Integer vipCardNo;

    private String vipName;

    private String cardType;

    private String tel;

    private String birthday;

    private String sex;
    
    @SuppressWarnings("unused")
	private Gifts() {
	}

    public Gifts(String vipNo) {
    	this.vipNo = vipNo;
	}

	public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift == null ? null : gift.trim();
    }

    public String getVipNo() {
        return vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo == null ? null : vipNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVipNew() {
        return vipNew;
    }

    public void setVipNew(String vipNew) {
        this.vipNew = vipNew == null ? null : vipNew.trim();
    }

    public Integer getVipCardNo() {
        return vipCardNo;
    }

    public void setVipCardNo(Integer vipCardNo) {
        this.vipCardNo = vipCardNo;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName == null ? null : vipName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}