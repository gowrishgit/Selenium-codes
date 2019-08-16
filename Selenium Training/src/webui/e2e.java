package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//To select From
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click(); //Parent child xpath
		Thread.sleep(2000l);
		
		//TO Select TO
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'])")).click(); // When we have two same value and want to use value of second index
		
		//To CLick Current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//To validate if return date is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
		System.out.println("The Calender is Disabled");
		Assert.assertTrue(true);
		}
		else
		Assert.assertTrue(false);
		
		//To add 5 adult and 4 child passengers
		Thread.sleep(2000l);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000l);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); // Adding 5 adult passengers
			Thread.sleep(1000l);
		}

		int i = 1;
		Thread.sleep(1000l);
		while (i < 5) {
			driver.findElement(By.id("hrefIncChd")).click(); // adding 4 child
			Thread.sleep(1000l);
			i++;
		}
		Thread.sleep(1000l);
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//To Select USD from dropdown
		Select s= new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByVisibleText("USD");
		
		//To Select the checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//driver.close();
	}
}
