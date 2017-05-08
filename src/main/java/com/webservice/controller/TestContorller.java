package com.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.webservice.dao.JdbcCorporateEventDao;

@Controller("testController")
@RequestMapping("/controller")
public class TestContorller {
	
	@Autowired
	private JdbcCorporateEventDao evenDao;
	
	@RequestMapping(value = "/test.do")
	public void test(){
		System.out.println(evenDao.getStudents());
	}

}
