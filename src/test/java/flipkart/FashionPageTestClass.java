package flipkart;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.Fashion;

public class FashionPageTestClass extends TestBase {
	@Test
	public void validateFashion() throws InterruptedException {
		Fashion fashion= new Fashion();
		Thread.sleep(5000);
        fashion.clickOnFashion();
	}
	
	@Test
	public void validateWomenEthenic() throws InterruptedException {
		Fashion fashion= new Fashion();
		fashion.clickOnWomenEthnicProduct();
		Thread.sleep(5000);
	}
	
	@Test
	public void validateWomenSarees() throws InterruptedException {
		Fashion fashion= new Fashion();
		
		fashion.clickOnWomenSarees();
		Thread.sleep(5000);
	}

}

