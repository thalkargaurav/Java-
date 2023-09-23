package com.jsp.abstraction;

public abstract class Whatsapp extends SocialMedia{
	
	@Override
	public void sendMessage() {
		System.out.println("Send Message available in version 1");
	}
	
	@Override
	public void recieveMessage() {
		System.out.println("Recieve Message available in version 1");
	}

}
