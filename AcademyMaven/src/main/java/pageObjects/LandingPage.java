package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	WebElement getLogin;
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']")
	WebElement getNavigationBar;
	@FindBy(xpath = "//h2[contains(text(),'Featured Courses')]")
	WebElement getTitle;

	public WebElement getLogin() {
		return getLogin;
	}

	public WebElement getNavigationBar() {
		return getNavigationBar;
	}

	public WebElement getTitle() {
		return getTitle;
	}

}
