package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage_PF {
	WebDriver driver;

	public RediffLoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	/*
	 * By username = By.xpath("//input[@id='login1']"); By password =
	 * By.name("passwd"); By gobutton = By.name("proceed"); By home =
	 * By.linkText("Home");
	 */

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	@FindBy(name = "passwd")
	WebElement password;
	@FindBy(name = "proceed")
	WebElement gobutton;
	@FindBy(linkText = "Home")
	WebElement home;

	/*
	 * public WebElement username() { return driver.findElement(username); }
	 * 
	 * public WebElement password() { return driver.findElement(password); }
	 * 
	 * public WebElement gobutton() { return driver.findElement(gobutton); }
	 * 
	 * public WebElement home() { return driver.findElement(home); }
	 */

	public WebElement username() {
		return username;
	}
	public WebElement password() {
		return password;
	}
	public WebElement gobutton() {
		return gobutton;
	}
	public WebElement home() {
		return home;
	}
}
