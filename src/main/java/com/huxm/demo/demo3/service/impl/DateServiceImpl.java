package com.huxm.demo.demo3.service.impl;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.huxm.demo.demo3.service.DateService;

@Service
public class DateServiceImpl implements DateService {

	public Date getDate() {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("date:"+date.toString());
		return date;
	}

}
