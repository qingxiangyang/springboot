package com.fenqifu.demoservice.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * @Title: InitData.java 
 * @Description: 测试初始化数据
 * @author: yqx 
 * @date: 2017年2月27日 下午3:32:57 
 * @company: 北京鼎力创世科技有限公司
 * Copyright (c) 2011-2017 All Rights Reserved.
 */
@Component
@Order(value=1)  //多个时定义执行顺序，可以省略不写
public class InitData implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("init Data...");
	}
	
}
