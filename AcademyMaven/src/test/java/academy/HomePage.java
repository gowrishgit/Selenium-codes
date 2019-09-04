package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver Is Intialized");
		log.info("HomePage testing stated");

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password, String text) throws IOException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		// LOGIN PAGE: ENTERING THE USERNAME AND PASSWORD
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;
		log.info("Broswer is closing");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3]; // TOTAL 2 ROW AND 3 COL

		// FIRST ROW
		data[0][0] = "restricteduser@abc.com";
		data[0][1] = "Password123456";
		data[0][2] = "Restricted User";

		// SECOND ROW
		data[1][0] = "non-restricteduser@abc.com";
		data[1][1] = "Password123456";
		data[1][2] = "Non-Restricted User";

		return data;
	}

}
