package testng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Jewelloan {
	@AfterTest
	public void AfterTestJewelloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterTestJewelloan");
	}
@Parameters({"URL", "Username"})
	@Test(groups= {"Smoke"})
	public void Webloginjewelloan(String urlname,String username) {
		// TODO Auto-generated method stub
		System.out.println("Webloginjewelloan");
		System.out.println(urlname);
		System.out.println(username);
	}

	@Test
	public void Mobileloginjewelloan() {
		// TODO Auto-generated method stub
		System.out.println("Mobileloginjewelloan");
		Assert.assertTrue(false);
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
