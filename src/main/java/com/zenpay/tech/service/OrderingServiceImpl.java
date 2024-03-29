package com.zenpay.tech.service;



import org.springframework.stereotype.Service;

import com.zenpay.tech.models.Order;

import com.zenpay.tech.utils.*;

@Service
public class OrderingServiceImpl implements OrderingService{

	public OrderingServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public Order processOrder(Order request) {
		
		//Order anOrder = new Order();
		
		//applying percentage discount
		Order percentage_applied_order =  RulesFunctions.percentage_discount(request);
		
		
		//applying bill discount 
		int final_payable_amount =  RulesFunctions.bill_discount_rule(percentage_applied_order.getNetpayableamount());
		
		
		percentage_applied_order.setNetpayableamount(final_payable_amount);
		
		
		return percentage_applied_order;
		
		
		
		//	total_net_payable = RulesFunctions.bill_discount_rule(total_net_payable);
		
	}

}
