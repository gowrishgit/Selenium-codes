package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Globalparameter {
	public WebDriver driver = null;

	@Test
	public void Login() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Selenium Training\\Selenium workspace\\Selenium Training\\src\\testng\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}

}
