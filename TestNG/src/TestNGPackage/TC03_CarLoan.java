package TestNGPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.AfterClass;
public class TC03_CarLoan {
	@AfterClass
	public void AfterClass() {
		// Selenium
		System.out.println("Execute After Class");
	}
	
	@BeforeClass
	public void BeforeClass() {
		// Selenium
		System.out.println("Execute Before Class");
	}

	@Test
	public void WebloginCarloan() {
		// Selenium
		System.out.println("WebloginCarloan");
	}

	@Test
	public void MobileloginCarloan() {
		// Appium
		System.out.println("MobileloginCarloan");
	}

	@Test(groups= {"Smoke"})
	public void MobileSigninCarloan() {
		// Appium
		System.out.println("MobileSigninCarloan");

	}

	@Test(timeOut=4000)
	public void MobileSignoutCarloan() {
		// Appium
		System.out.println("MobileSignoutCarloan");

	}

	@Test(enabled=false)
	public void APIloginCarloan() {
		// Rest API automation
		System.out.println("APIloginCarloan");
	}

	@Test
	public void Aftertest() {
		// Rest API automation
		System.out.println("I will execute last");
	}

	@BeforeSuite
	public void BeforeSuite() {
		//Rest API automation
		System.out.println("I will execute before suite");
	}
	@AfterSuite
	public void AfterSuite() {
		// Rest API automation
		System.out.println("I will execute after suite");
	}

	@BeforeMethod
	public void BeforeMethod() {
		// Rest API automation
		System.out.println("I will execute Before Method");
	}
	@AfterMethod
	public void AfterMethod() {
		// Rest API automation
		System.out.println("I will execute After Method");}

	
}
