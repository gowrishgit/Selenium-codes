package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Personalloan {
	
	@AfterTest
	public void AfterTestPersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterTestPersonalloan");
	}
	@AfterMethod
	public void AfterMethodPersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("I will execute after methods of BeforeTestPersonalloan");
	}
	@AfterSuite
	public void AfterSuitePersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterSuitePersonalloan");
	}

	@Test(groups= {"Smoke"})
	public void Webloginpersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("Webloginpersonalloan");
	}

	@Test
	public void Mobileloginpersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("Mobileloginpersonalloan");
	}

	@Test
	public void APIloginpersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("APIloginpersonalloan");
	}

	@BeforeTest
	public void BeforeTestPersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("BeforeTestPersonalloan");
	}
	@BeforeMethod
	public void BeforeMethodPersonalloan() {
		// TODO Auto-generated method stub
		System.out.println("I will execute before methods of BeforeTestPersonalloan");
	}
}
