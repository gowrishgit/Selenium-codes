package TestNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC05_Parameter {
	
	@Parameters({"URL"})
	@Test
	public void WebloginJewelloan(String urlname) {
		//Selenium
		System.out.println("WebloginJewelloan");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"})
	public void MobileloginJewelloan() {
		//Appium
		System.out.println("MobileloginJewelloan");
	}
	@Parameters({"URL","USERNAME"})
	@Test
	public void APIloginJewelloan(String urlname, String username) {
		//Rest API automation
		System.out.println("APIloginJewelloan");
		System.out.println(urlname);
		System.out.println(username);
	}

}
