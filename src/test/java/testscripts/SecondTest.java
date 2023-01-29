package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass{
	
	@Test
	public void secondTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.selectCategory(web, 1);
		soft.assertTrue(testing.getPageHeader().isDisplayed());
		WebElement javaImage = testing.getJavaImage();
		WebElement cartImage = testing.getCartArea();
		web.dragAndDropElement(javaImage, cartImage);
		web.scrollTillElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
	}

}
