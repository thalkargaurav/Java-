package com.jsp.exception_handling;

public class OverAgeLimitException extends Exception{
  @Override
  public String getMessage() {
	  return "Age limit exceeded";
  }
}
