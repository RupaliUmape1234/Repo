package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(css="a.wsejfv")
	public WebElement login; 
	
	public void clickOnLogin() {
		login.click();

	}
	
	

}
