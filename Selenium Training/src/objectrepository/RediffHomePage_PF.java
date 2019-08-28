package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage_PF {
	WebDriver driver;
	public RediffHomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//input[@id='srchword']")
	WebElement searchtext;
	
	@FindBy (className="newsrchbtn")
	WebElement searchbutton;
	
		public WebElement searchtext() {
		return searchtext;
	}

	public WebElement searchbutton() {
		return searchbutton;
	}

	
}
