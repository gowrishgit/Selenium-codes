package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablessorting_Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Sorting the table to asscending
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();

		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(3)"));
		sortColumn(firstColList, "asc", "integers");
		driver.close();
	}

	public static void sortColumn(List<WebElement> firstColList, String order, String format)

	{
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText());
		}

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}

		if (format.equalsIgnoreCase("integers"))

		{

			Arrays.sort(copiedList.toArray());

			if (order.equalsIgnoreCase("desc"))

			{
				Arrays.sort(copiedList.toArray(), Collections.reverseOrder());
			}

		}

		else

		{
			// string
			Collections.sort(copiedList);
			
			if (order.equalsIgnoreCase("desc"))

			{
				Collections.reverse(copiedList);
			}

		}

		System.out.println("********Original List********");
		for (String s : originalList) // Enhanced loop == String s=0;s<copiedList.size();s++
		{
			System.out.println(s);
		}
		System.out.println("********Copied List*******");
		for (int i = 0; i < copiedList.size(); i++) {

			System.out.println(copiedList.get(i));
		}

		Assert.assertTrue(originalList.equals(copiedList));
	}
}
