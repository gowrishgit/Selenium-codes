package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).size());
		// Use find elements when retriving more than 1 value - Size method only can use here
		int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
		for (int i = 0; i < count; i++) 
		{
			System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
			String text = (driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
			if (text.equals("wine")) 
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			}
		}

	}

}
