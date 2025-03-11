package com.flipkart.error;

public class InvalidBrowserError  extends Error{
 
	String browserName;
	public InvalidBrowserError(String browserName) {
		this.browserName=browserName;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid Browser Name:"+browserName;
	}
}
