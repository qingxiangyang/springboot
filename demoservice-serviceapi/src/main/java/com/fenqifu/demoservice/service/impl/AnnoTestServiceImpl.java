package com.fenqifu.demoservice.service.impl;

import org.springframework.stereotype.Service;

import com.fenqifu.demoservice.service.IAnnoTestService;
@Service("annoTestService")
public class AnnoTestServiceImpl implements IAnnoTestService {

	@Override
	public String sayHello() {
		return "Hello World";
	}

}
