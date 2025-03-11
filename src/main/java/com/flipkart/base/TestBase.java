package com.flipkart.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.flipkart.keywords.Keywords;

public class TestBase  {
	Keywords keyword= new Keywords();
	
	
	//@Parameters("env")
	@BeforeMethod
	public void setup()throws Exception {
		Keywords keyword= new Keywords();
		keyword.openBrowser(Config.getBrowserName());
		keyword.maximizeBrowser();
		keyword.openUrl(Config.getAppUrl("dev"));

	}
	
	@AfterMethod
	public void closeBrowser()throws Exception {
		keyword.quitAllWindows();
	}
	
}
