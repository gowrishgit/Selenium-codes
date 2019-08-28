package pageobjectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage_PF;
import objectrepository.RediffLoginPage_PF;

public class LoginapplicationPF {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		
		RediffLoginPage_PF rl = new RediffLoginPage_PF(driver);
		rl.username().sendKeys("ABC@gmail.com");
		rl.password().sendKeys("password");
		// rl.gobutton().click();
		rl.home().click();

		RediffHomePage_PF rh = new RediffHomePage_PF(driver);
		rh.searchtext().sendKeys("India");
		rh.searchbutton().click();
	}

}
