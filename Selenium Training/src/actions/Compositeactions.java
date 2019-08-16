package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Compositeactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");

		Actions a = new Actions(driver);
		//MOUSEOVER
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		// Composite actions or multiple actions enter in UPPERCASE
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Right click
		WebElement move = driver.findElement(By.xpath("//div[@class='nav-right']//div//a[2]"));
		a.moveToElement(move).contextClick().build().perform();
	}

}
