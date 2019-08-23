package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carloan {
	@AfterTest	
	public void AfterTestCarloan() {
		// TODO Auto-generated method stub
		System.out.println("AfterTestCarloan");
	}
	@Test
	public void Weblogincarloan() {
		// TODO Auto-generated method stub
		System.out.println("Weblogincarloan");
	}
	
	@Test	
	public void Mobilelogincarloan() {
		// TODO Auto-generated method stub
		System.out.println("Mobilelogincarloan");
	}
	@Test	
	public void APIlogincarloan() {
		// TODO Auto-generated method stub
		System.out.println("APIlogincarloan");
	}
	@BeforeTest	
	public void BeforeTestCarloan() {
		// TODO Auto-generated method stub
		System.out.println("BeforeTestCarloan");
	}
	
}
