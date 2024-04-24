package SWT;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class testngpgm1 {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver ;
	
  @Test
  public void f() {
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	 
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
