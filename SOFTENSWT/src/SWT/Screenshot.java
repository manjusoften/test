package SWT;

import java.io.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public void findScreenShot()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\SWT\\Desktop\\MANJU\\abc.jpeg"));
	
			
		}
		catch(Exception exception)
		{                 
			System.out.println(exception);
		}
	}
		public static void main(String[] args)
		 {
		
		Screenshot obj=new Screenshot();
		obj.findScreenShot();
		}

}
