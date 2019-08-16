package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdownFOR_WHILE_Loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000l);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); // Adding 5 adult passengers
			Thread.sleep(1000l);
		}

		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncChd")).click(); // adding 4 child
			Thread.sleep(1000l);
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
