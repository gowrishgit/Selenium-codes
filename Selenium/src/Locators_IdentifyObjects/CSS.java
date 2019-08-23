package Locators_IdentifyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		// tagName[attribute='value'] or tagName#id tagName#classname--when we have ID/classname
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("password12345"); // CSS without tagname
		driver.findElement(By.cssSelector("#loginbutton")).click();  // Xpath
		driver.close();
	}

}
