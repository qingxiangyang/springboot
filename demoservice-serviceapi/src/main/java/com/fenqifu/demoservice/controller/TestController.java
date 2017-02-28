package com.fenqifu.demoservice.controller;

import com.fenqifu.demoservice.service.IAnnoTestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**   
 * @Title: TestController.java 
 * @Description: TODO
 * @author: yqx 
 * @date: 2017年2月24日 下午10:42:55 
 * @company: 北京鼎力创世科技有限公司
 * Copyright (c) 2011-2017 All Rights Reserved.
 */

@RestController
@RequestMapping("/test")
@Api(value = "/test", description = "测试")
public class TestController {
	@Autowired
	IAnnoTestService annoTestService ;

	@ApiOperation(value = "版本更新", notes = "app版本更新")
    @RequestMapping(value = "/hello", method = { RequestMethod.POST, RequestMethod.GET })
    public String testController(HttpServletRequest request) {
        return "hello";
    }
	
	public String AnnoTestController(){
		return annoTestService.sayHello();
	}

}
