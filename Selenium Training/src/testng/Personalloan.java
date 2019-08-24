package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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

	@Test(groups = { "Smoke" })
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

	@Test(dataProvider = "getData")
	public void APIloginPersonalloan(String username, String password) {
		// Rest API automation
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2]; // 3 rows and 2 values
		// 1st set
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPassword";
		// 2nd set
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		// 3rd set
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdPassword";

		return data;

	}

}
