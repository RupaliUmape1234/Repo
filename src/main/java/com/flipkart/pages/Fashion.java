package com.flipkart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.keywords.Keywords;

public class Fashion {

	@FindBy(css="span._27h2j1")
	public WebElement Fashion;
	
	@FindBy(css="a._1BJVlg._11MZbx")
	public WebElement WomenEthenic;
	
	@FindBy(css="a._3490ry")
	public WebElement  WomenSarees;
	
	public Fashion() {
		PageFactory.initElements(Keywords.getDriver(), this);
	}
	
	public void clickOnFashion() {
		Fashion.click();
	}
	
	public void clickOnWomenEthnicProduct() throws InterruptedException {
		
		Fashion.click();
		WomenEthenic.click();
		Thread.sleep(5000);

	}
	public void clickOnWomenSarees() {
		Fashion.click();
		WomenEthenic.click();
		WomenSarees.click();

	}
	
} 
