package TestNGPackage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC06_DatProvider {
	@Test
	public void MobileloginPersonalloan() {
		// Appium
		System.out.println("MobileloginPersonalloan");
	}

	@Test(dataProvider="getData")
	public void APIloginPersonalloan(String username,String password) {
		// Rest API automation
		System.out.println(username);
		System.out.println(password);
	}


	@DataProvider
	public Object[][] getData()
	{
	Object[][] data=new Object[3][2];   //3 rows and 2 values
	//1st set
	data[0][0]="FirstUserName";
	data[0][1]="FirstPassword";
	//2nd set
	data[1][0]="SecondUserName";
	data[1][1]="SecondPassword";
	//3rd set
	data[2][0]="ThirdUserName";
	data[2][1]="ThirdPassword";
	
	return data;
	
	}
	

}
