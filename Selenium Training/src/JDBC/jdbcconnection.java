package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=ca");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "admin");
		Statement s = con.createStatement();
		ResultSet rs =s.executeQuery("SELECT * FROM qadbt.useraccounts");
		while(rs.next())
		{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("uname"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("password"));
		System.out.println(rs.getString("uname"));
		System.out.println(rs.getString("password"));
		}
		
		
	}

}
