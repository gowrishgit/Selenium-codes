package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver Is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("validateNavigationBar testing stated");
	}

	@Test

	public void validateAppNavBar() throws IOException {

		LandingPage l = new LandingPage(driver);

		// CHECKS WHEATHER NAVIGATION BAR IS DISPLAYED
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation bar is validated");

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;
		log.info("Broswer is closing");

	}

}
