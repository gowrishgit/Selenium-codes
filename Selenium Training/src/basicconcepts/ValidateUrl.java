package basicconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // To get current url
		System.out.println(driver.getPageSource()); // get the page source
		driver.get("https://yahoo.com");
		driver.navigate().back();//page back
		driver.navigate().forward(); //page forward
		driver.navigate().refresh(); //page refresh
		driver.close();// Will close current browser
		driver.quit();// will close all the browser opened by the selenium

	}

}
