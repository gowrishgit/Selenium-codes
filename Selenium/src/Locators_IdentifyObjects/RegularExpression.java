package Locators_IdentifyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		// tagName[attribute='value'] or tagName#id tagName#classname--when we have
		// ID/classname
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // Regular Expression
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password12345");
		driver.findElement(By.xpath("//input[contains(@name,'proce')]")).click(); // Regular Expression
		driver.close();
	}

}
