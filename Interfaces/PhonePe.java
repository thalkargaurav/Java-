package com.jsp.interfaces;

public class PhonePe extends BalanceInquiry implements Payment,Transaction {

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("Payment via PhonePe");
	}

	@Override
	public void printTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Transaction via PhonePe");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance check via PhonePe");
	}
	

}
