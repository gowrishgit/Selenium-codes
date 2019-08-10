package TestNGPackage;

import org.testng.annotations.Test;

public class TC01_PersonalLoan {

	@Test(groups= {"Smoke"})
	public void WebloginPersonalloan() {
		// Selenium
		System.out.println("WebloginPersonalloan");
	}

	@Test
	public void MobileloginPersonalloan() {
		// Appium
		System.out.println("MobileloginPersonalloan");
	}
	
	@Test
	public void MobileloginPersonalloan1() {
		// Appium
		System.out.println("MobileloginPersonalloan");
	}

	@Test(dependsOnMethods= {"WebloginPersonalloan","MobileloginPersonalloan"})
	public void APIloginPersonalloan() {
		// Rest API automation
		System.out.println("APIloginPersonalloan");
	}

}
