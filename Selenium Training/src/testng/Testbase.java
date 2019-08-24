package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Testbase {
	

	@Test
	public static void Login() throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Selenium Training\\Selenium workspace\\Selenium Training\\src\\testng\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Training\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Training\\Driver\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

}
