package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerBean {
	
	@Value("${cust.Id}")
	private int customerId;
	@Value("${cust.Name}")
	private String customerName;
	@Value("${cust.Mobile}")
	private long mobile;
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", mobile=" + mobile + "]";
	}
	
	
	

}
