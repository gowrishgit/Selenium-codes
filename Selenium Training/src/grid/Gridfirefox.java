package grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridfirefox {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

				
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4441/wd/hub"), dc);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());


	}

}
