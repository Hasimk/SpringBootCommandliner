package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.bean.CustomerBean;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception {
		CustomerBean cb=    ctx.getBean("customerBean", CustomerBean.class);		
	System.out.println(cb);
	}
	
	

}
