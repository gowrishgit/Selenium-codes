package objectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class Loginapplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		RediffLoginPage rl = new RediffLoginPage(driver);
		rl.username().sendKeys("ABC@gmail.com");
		rl.password().sendKeys("password");
		// rl.gobutton().click();
		rl.home().click();

		RediffHomePage rh = new RediffHomePage(driver);
		rh.searchtext().sendKeys("India");
		rh.searchbutton().click();
	}

}
