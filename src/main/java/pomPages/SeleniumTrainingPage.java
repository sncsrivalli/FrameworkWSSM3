package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {

	//Declaration
	@FindBy(xpath = "//h1[text()='Selenium Training']")
	private WebElement pageHeader;
	
	@FindBy(id = "add")
	private WebElement plusButton;
	
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void doubleClickPlusButton(WebDriverUtility web) {
		web.doubleClickOnElement(plusButton);
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
}
