package Locators_IdentifyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		driver.findElement(By.id("email")).sendKeys("gowrish@gmail.com"); //ID locator
		driver.findElement(By.name("pass")).sendKeys("password"); //Name locator
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.className("inputtext")).sendKeys("Password");
		driver.close();// Will close current browser
		
	}

}
