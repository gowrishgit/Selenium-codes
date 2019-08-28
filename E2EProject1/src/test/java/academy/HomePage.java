package academy;

import java.io.IOException;

import org.testng.annotations.Test;

import acedemy.base;

public class HomePage extends base {
	
	@Test
	public void basePagenavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://google.ca");
		
		
	}

}
