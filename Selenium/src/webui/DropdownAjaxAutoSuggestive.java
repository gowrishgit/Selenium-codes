package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownAjaxAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MAA");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		driver.close();

	}

}
