package flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.base.Locator;
import com.flipkart.base.LocatorType;
import com.flipkart.base.TestBase;
import com.flipkart.keywords.Keywords;
import com.flipkart.pages.Fashion;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;

public class TestCases extends TestBase  {
	@Test
	
	public void login() {
		Keywords keyword= new Keywords();
		keyword.enterText(Locator.serachComponent,"lipstick ",Keys.ENTER);
		//keyword.openBrowser("Chrome");
		//keyword.openUrl("https://www.flipkart.com/");
		

	}
	
	//Using Page Object Model
	@Test
	
	public void clickloginpage() {
		LoginPage loginpage= new LoginPage();
		loginpage.clickOnLogin();
	
		//Assert.assertEquals(false, null);
		
	}
	
	
	
	@Test
	
	public void serachProduct() {
	HomePage homepage= new HomePage();
	homepage.enterProductTosearch("lipStik",Keys.ENTER);
	}
	
  
	
	
	

}
