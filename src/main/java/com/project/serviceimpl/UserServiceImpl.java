package com.project.serviceimpl;

import org.springframework.stereotype.Service;

import com.project.entity.User;
import com.project.inner.base.serviceimpl.BaseServiceImpl;
import com.project.mapper.UserMapper;
import com.project.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService{
}