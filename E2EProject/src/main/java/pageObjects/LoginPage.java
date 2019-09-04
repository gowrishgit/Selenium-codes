package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user[email]")
	WebElement getEmail;
	@FindBy(name = "user[password]")
	WebElement getPassword;
	@FindBy(xpath = "//input[@name='commit']")
	WebElement getLogin;

	public WebElement getEmail() {
		return getEmail;
	}

	public WebElement getPassword() {
		return getPassword;
	}

	public WebElement getLogin() {
		return getLogin;

	}
}
