package com.jsp.abstraction;

public class SocialMediaDriver {
	
	public static void main(String[] args) {
		Whatsapp2 whatsapp2=new Whatsapp2();
		whatsapp2.sendMessage();
		whatsapp2.recieveMessage();
		whatsapp2.uploadPhoto();
	}

}
