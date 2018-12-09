package com.project.service;

import com.project.entity.Gifts;
import com.project.inner.base.service.BaseService;

public interface GiftsService extends BaseService<Gifts>{

	int getCount(String gifts, String createTime);
}