package com.zenpay.tech.models;


import java.util.ArrayList;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


//@lombok.Getter
//@lombok.Setter
public class Order {

	@JsonIgnore
	String orderid = null;
	
	@JsonProperty("totalamount")
	int totalamount= 0;
	
	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}



	

	



	public int getTotalamount() {
		return totalamount;
	}

	public int getNetpayableamount() {
		return netpayableamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public void setNetpayableamount(int netpayableamount) {
		this.netpayableamount = netpayableamount;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Date getDateorderded() {
		return dateorderded;
	}

	public void setDateorderded(Date dateorderded) {
		this.dateorderded = dateorderded;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public String getPickuplocation() {
		return Pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		Pickuplocation = pickuplocation;
	}

	public String getOrderdescription() {
		return orderdescription;
	}

	public void setOrderdescription(String orderdescription) {
		this.orderdescription = orderdescription;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@JsonProperty("netpayableamount")
	int netpayableamount=0;
	
	@JsonProperty("customer")
	User customer;
	
	@JsonProperty("dateorderded")
	Date dateorderded = new Date();
	
	@JsonProperty("paymentmethod")
	String paymentmethod;
	
	@JsonProperty("Pickuplocation")
	String Pickuplocation;
	
	@JsonProperty("orderdescription")
	String orderdescription;
	
	@JsonProperty("products")
	ArrayList<Product> products ;
	
	
	


}
