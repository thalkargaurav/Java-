package com.jsp.interfaces;

public interface Payment {
	
	void makePayment();
	
	default void cancelPayment() {
		System.out.println("Transaction failed");
	}

}
