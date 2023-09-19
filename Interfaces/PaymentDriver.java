package com.jsp.interfaces;

public class PaymentDriver {
	public static void main(String[] args) {
		PhonePe pay=new PhonePe();
		pay.makePayment();
		pay.cancelPayment();
		pay.checkBalance();
		pay.printTransaction();
	}
}
