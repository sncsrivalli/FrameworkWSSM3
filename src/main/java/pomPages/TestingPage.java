package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//Declaration
	@FindBy(xpath ="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="java")
	private WebElement javaImage;
	@FindBy(id="cartArea")
	private WebElement cartArea;
	@FindBy(xpath="//ul[@class='list-socialicons']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public WebElement getJavaImage() {
		return javaImage;
	}
	
	public WebElement getCartArea() {
		return cartArea;
	}
	
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	
	public void clickFacebookIcon() {
		facebookIcon.click();
	}

}
