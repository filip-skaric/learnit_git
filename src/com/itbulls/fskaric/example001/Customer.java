package com.itbulls.fskaric.example001;

public class Customer {

	private static int cartCounter;
	
	private int id;
	private int userId;
	
	static {
		System.out.println("Cart.class is uploaded into JVM");
	}
	
	{
		cartCounter++;
		userId = 1; 
		//tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
		//discount = new Discount(DEFAULT_DISCOUNT_NAME, DEAFULT_DISCOUNT_RATE);
	}
}
