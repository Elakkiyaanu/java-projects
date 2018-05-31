package com.basic;

public class Admin1 {
	public static void main(String []args) {
		Invoice invoice1=new Invoice();
		invoice1.setQuantity(5);
		invoice1.setPrice(100);
		invoice1.setPartDescription("bolt");
		System.out.println(invoice1.getQuantity());
		double a=invoice1.getInvoiceAmount();
		System.out.println(invoice1.getInvoiceAmount());
	}

}
