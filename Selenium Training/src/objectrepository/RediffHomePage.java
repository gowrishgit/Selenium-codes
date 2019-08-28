package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	By searchtext = By.xpath("//input[@id='srchword']");
	By searchbutton = By.className("newsrchbtn");
	

	public WebElement searchtext() {
		return driver.findElement(searchtext);
	}

	public WebElement searchbutton() {
		return driver.findElement(searchbutton);
	}

	
}
