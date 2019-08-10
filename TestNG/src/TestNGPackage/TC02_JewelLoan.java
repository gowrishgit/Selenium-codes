package TestNGPackage;

import org.testng.annotations.Test;

public class TC02_JewelLoan {

	@Test
	public void WebloginJewelloan() {
		//Selenium
		System.out.println("WebloginJewelloan");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginJewelloan() {
		//Appium
		System.out.println("MobileloginJewelloan");
	}
	@Test
	public void APIloginJewelloan() {
		//Rest API automation
		System.out.println("APIloginJewelloan");
	}

}
