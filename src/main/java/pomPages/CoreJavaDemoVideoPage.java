package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaDemoVideoPage {

	// Declaration
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement closeCookiesIcon;
	
	@FindBy(xpath = "//h1[text()='Core Java For Selenium Training']")
	private WebElement pageHeader;

	@FindBy(xpath = "//button[.='Play']")
	private WebElement playButton;

	@FindBy(xpath = "//button[.='Pause']")
	private WebElement pauseButton;

	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addToWishlistButton;

	// Initialization
	public CoreJavaDemoVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void clickPlayButton() {
		playButton.click();
	}
	
	public void clickPauseButton() {
		pauseButton.click();
	}
	
	public void clickAddToWishList() {
		addToWishlistButton.click();
	}
	
	public void clickCloseCookies() {
		closeCookiesIcon.click();
	}

}
