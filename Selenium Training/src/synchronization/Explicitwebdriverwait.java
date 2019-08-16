package synchronization;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwebdriverwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.ca/");

		driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
		WebElement destination = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
		destination.clear();
		destination.sendKeys("NEWYORK");
		destination.sendKeys(Keys.ENTER);		
		//Explicit Wait
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/section[1]/ol/li[1]/div/div/a")));	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/section[1]/ol/li[1]/div/div/a")).click();
				
	}

}
