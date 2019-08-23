package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jewelloan {
	@AfterTest
	public void AfterTestJewelloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterTestJewelloan");
	}

	@Test
	public void Webloginjewelloan() {
		// TODO Auto-generated method stub
		System.out.println("Webloginjewelloan");
	}

	@Test
	public void Mobileloginjewelloan() {
		// TODO Auto-generated method stub
		System.out.println("Mobileloginjewelloan");
	}

	@Test
	public void APIloginjewelloan() {
		// TODO Auto-generated method stub
		System.out.println("APIloginjewelloan");
	}

	@BeforeTest
	public void BeforeTestJewelloan() {
		// TODO Auto-generated method stub
		System.out.println("BeforeTest Jewelloan");
	}
}
