package SWT;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public void login()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			driver.findElement(By.id("email")).sendKeys("ytrfyhhjg");
			driver.findElement(By.id("pass")).sendKeys("2435");
			driver.findElement(By.id("loginbutton")).click();
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}

	public static void main(String[] args) {
		Login obj=new Login();
		obj.login();
	}


	

}
