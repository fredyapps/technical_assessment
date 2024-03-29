package com.zenpay.tech.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zenpay.tech.models.Order;
import com.zenpay.tech.service.OrderingService;
import com.zenpay.tech.utils.MyUtils;


@RestController
public class OrderController {

	
	@Autowired
	private OrderingService orderingService;
	
	
	@PostMapping("/Orders/Create")
	public ResponseEntity<Order> ordering(@RequestBody Order order) {
		
		
		
		Order processed_order = orderingService.processOrder(order);
		
		
		return new ResponseEntity<Order>(processed_order, HttpStatus.CREATED);
		
	}
	
	

	
	
	
	
	

}
