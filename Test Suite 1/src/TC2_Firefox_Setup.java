import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2_Firefox_Setup {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Training\\Driver\\gecko.exe)");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
