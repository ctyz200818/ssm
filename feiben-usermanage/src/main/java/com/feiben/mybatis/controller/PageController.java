package com.feiben.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("page")
@Controller
public class PageController {

	@RequestMapping(value = "{pageName}", method = RequestMethod.GET)
	// 把路径中的变量作为参数，如下面中的users
	public String toPage(@PathVariable("pageName") String pageName) {
		return pageName;
	}
}
