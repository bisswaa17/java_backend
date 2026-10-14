package com.kodewala.constructors.practice;

public class EcomProduct {
	
	String productId ;
	String productName;
	double price;
	int stockAvl ;
	
	static String platfromName = "flipkart";
	
	public EcomProduct(String _productId, String _productName,double _price,int _stock) 
	{
		// TODO Auto-generated constructor stub
		this.productId = _productId;
		this.productName = _productName;
		this.price = _price;
		this.stockAvl = _stock;
		
	}
	
	public void displayProduct() {
		System.out.println("Product Id is :"+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Price is :"+price);
		System.out.println("Available :"+stockAvl);
		
	System.out.println("Delivary Partner:"+EcomProduct.platfromName);
		
	}

}
