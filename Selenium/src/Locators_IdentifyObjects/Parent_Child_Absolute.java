package Locators_IdentifyObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div/input"))
				.sendKeys("Today Weather"); // XPATH Parent to child traversing when no unique attributes
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div/input")).sendKeys(Keys.ENTER);
		driver.quit();

	}

}
