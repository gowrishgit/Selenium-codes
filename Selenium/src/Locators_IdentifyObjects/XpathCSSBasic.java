package Locators_IdentifyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCSSBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=ca");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.id("password")).sendKeys("password12345");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.cssSelector("#rememberUn")).click(); // CSS Locator
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText()); // Grab any text
		driver.close();
	}

}
