package com.zenpay.tech.models;



import com.fasterxml.jackson.annotation.JsonProperty;

//@lombok.Getter
//@lombok.Setter
public class Product  {


	
	public String getProductid() {
		return productid;
	}


	public void setProductid(String productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}





	


	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}


	public void setNetamout(int netamout) {
		this.netamout = netamout;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	


	public int getUnitprice() {
		return unitprice;
	}


	public int getNetamout() {
		return netamout;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@JsonProperty("productid")
	String productid;
	
	@JsonProperty("productname")
	String productname;
	
	@JsonProperty("description")
	String description;
	
	@JsonProperty("unitprice")
	int unitprice;
	
	@JsonProperty("quantity")
	int quantity = 0;
	
	@JsonProperty("netamout")
	int netamout;
	
	
	@JsonProperty("category")
	String category;
	
	

}
