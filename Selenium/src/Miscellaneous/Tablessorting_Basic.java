package Miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablessorting_Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Selenium Training//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Sorting the table to asscending
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		// Getting values to arraylist from the table
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText()); // Adding values to the array list
		}

		// Copying the values from originallist to copiedlist arraylist
		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i)); // Adding copied values to the array list
		}

		// Sorting the copied arraylist
		Collections.reverse(copiedList);// Descending sort
		Collections.sort(copiedList); // Ascending by default
		

		System.out.println("********Copied List*******");
		for (int i = 0; i < copiedList.size(); i++) {

			System.out.println(copiedList.get(i));
		}

		System.out.println("********Original List********");
		for (String s : originalList) // Enhanced loop == String s=0;s<copiedList.size();s++
		{
			System.out.println(s);
		}

		// Comparing the original list and sorted copied list.
		// Adding Assertion to fail if the sort is wrong
		Assert.assertTrue(originalList.equals(copiedList));
		driver.close();

	}
}
