package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homeloan {
	@AfterTest
	public void AfterTesthomeloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterTesthomeloan");
	}

	@Test
	public void Webloginhomeloan() {
		// TODO Auto-generated method stub
		System.out.println("Weblogin");
	}

	@Test(groups= {"Smoke"})
	public void Mobileloginhomeloan() {
		// TODO Auto-generated method stub
		System.out.println("Mobileloginhomeloan");
	}

	@Test
	public void APIloginhomeloan() {
		// TODO Auto-generated method stub
		System.out.println("APIloginhomeloan");
	}

	@BeforeTest
	public void BeforeTesthomeloan() {
		// TODO Auto-generated method stub
		System.out.println("BeforeTesthomeloan");
	}

	@BeforeSuite
	public void BeforeSuitehomeloan() {
		// TODO Auto-generated method stub
		System.out.println("BeforeSuite");
	}
}
