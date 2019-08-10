package TestNGPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC04_HomeLoan {

	@Test
	public void WebloginCarloan() {
		//Selenium
		System.out.println("WebloginHomeloan");
	}
	@Test
	public void MobileloginHomeloan() {
		//Appium
		System.out.println("MobileloginHomeloan");
	}
	@Test(groups= {"Smoke"})
	public void APIloginHomeloan() {
		//Rest API automation
		System.out.println("APIloginHomeloan");
	}
	@BeforeTest //This method will execute first
	public void Beforetest() {
		//Rest API automation
		System.out.println("I will execute first");
	}

}
