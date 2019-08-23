package windowsandframes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplewindows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/ul[1]/li[1]/a[1]")).click();
		Actions a = new Actions(driver);
		//Composite actions or multiple actions
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"))).sendKeys(Keys.SHIFT).click().build().perform();
		System.out.println("Before Switching:" + "\n" + driver.getTitle());

		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next()); // Switching to windows
			System.out.println(driver.getTitle());
		}
				
		driver.quit();

	}

}
