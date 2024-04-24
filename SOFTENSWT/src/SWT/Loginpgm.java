package SWT;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");

	}

}
