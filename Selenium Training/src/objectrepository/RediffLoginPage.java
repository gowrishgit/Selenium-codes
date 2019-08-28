package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	By username = By.xpath("//input[@id='login1']");
	By password = By.name("passwd");
	By gobutton = By.name("proceed");
	By home = By.linkText("Home");

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement gobutton() {
		return driver.findElement(gobutton);
	}

	public WebElement home() {
		return driver.findElement(home);
	}
}
