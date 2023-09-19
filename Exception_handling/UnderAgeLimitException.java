package com.jsp.exception_handling;

public class UnderAgeLimitException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Age cannot be below 20";
	}

}
