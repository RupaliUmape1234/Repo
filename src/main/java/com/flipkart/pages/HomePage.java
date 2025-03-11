package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.keywords.Keywords;

public class HomePage {
	
	//WebElements
	@FindBy(xpath ="//input[@class=\"Pke_EE\"]")
	public WebElement searchComponent;
	
	/*
	 * PageFactory class is used to initlise the page class and by using PageFactory.initElemnts method inthis method pass WebDriver instnce that getDriver and
	 * which page are call that Page class ka object 
	 */
	public HomePage() {
		PageFactory.initElements(Keywords.getDriver(), this);
	}
	//Actions
	
	public void enterProductTosearch(CharSequence... productName) {
		searchComponent.sendKeys(productName);

	}

}
