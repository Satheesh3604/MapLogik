package com.adm.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		TestNGWebLogin.userName(driver).sendKeys("8807726575");
		TestNGWebLogin.password(driver).sendKeys("3604");
		TestNGWebLogin.login(driver).click();
		Thread.sleep(4000);
		TestNGWebLogin.mobile(driver).click();
//		Thread.sleep(4000);
		driver.navigate().back();
//		Thread.sleep(4000);
		TestNGWebLogin.mobile(driver).click();
		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
		driver.navigate().back();
		TestNGWebLogin.home(driver).click();
		System.out.println(driver.getTitle());

	}

}
