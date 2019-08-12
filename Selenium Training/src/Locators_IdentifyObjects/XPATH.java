package Locators_IdentifyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); // Xpath
		
		driver.close();
	}

}
