package com.zenpay.tech.utils;

import java.util.ArrayList;

import com.zenpay.tech.models.Order;
import com.zenpay.tech.models.Product;
import com.zenpay.tech.models.User;

public class RulesFunctions {

	public RulesFunctions() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Order percentage_discount(Order order) {
		
		
        String usertype = order.getCustomer().getUsertype();
        User customer = order.getCustomer();
		
		ArrayList<Product> products = order.getProducts();
		
		int total_net_payable = 0;
		//instructtions for user type employee
		if(usertype.equals("employee")) {
			
			for(Product product : products) { 
				  
	            //System.out.print(element + " ");
				
				if(product.getCategory()!="groceries") {
					
	               product.setNetamout(employee_rule(product.getUnitprice()*product.getQuantity()));
	            //
				}
				
	            total_net_payable = total_net_payable + employee_rule(product.getUnitprice()*product.getQuantity());
	         }
			
		}
		
		//instructions for user type affiliate
		if(usertype.equals("affiliate")) {
			
			for(Product product : products) { 
				
				if(product.getCategory()!="groceries") {
	            //System.out.print(element + " ");
	            product.setNetamout(affiliate_rule(product.getUnitprice()*product.getQuantity()));
	            //
				}
	            total_net_payable = total_net_payable + affiliate_rule(product.getUnitprice()*product.getQuantity());
	         }
		}
		
		//instructions for user type customer
		if(usertype.equals("customer")) {
			
			for (Product product : products) { 
				if(product.getCategory()!="groceries" && MyUtils.date_difference(customer.getRegistered_on())>=24) {
	            //System.out.print(element + " ");
	                 product.setNetamout(customer_rule(product.getUnitprice()*product.getQuantity()));
	            //
				}
	            total_net_payable = total_net_payable + customer_rule(product.getUnitprice()*product.getQuantity());
	         }
			
		}
		
		
		
		order.setNetpayableamount(total_net_payable);
		
		return order;
		
	}
	
	
	
	public static int employee_rule(int totalamount) {
		
		// "employee";
		
		int applied = totalamount - (totalamount*30)/100;
		return applied;
		
	}

	
	
    public static int affiliate_rule(int totalamount) {
		
		
    	// "affiliate";
    	
    	
    	int applied = totalamount - (totalamount*10)/100;
		return applied;
	}
    
    
    public static int customer_rule(int totalamount) {
		
    	// "customer";
    	
    	
    	int applied = totalamount - (totalamount*5)/100;
		return applied;
	}
    
    
    public static int bill_discount_rule(int totalamount) {
		
    	// for all users 
    	int quotient = 0;
    	
    	if(totalamount >= 100) {
    		
    		quotient = totalamount/100;
    		
    	}
    	
    	
    	return totalamount - (quotient*5);
	
    
    }	

}
