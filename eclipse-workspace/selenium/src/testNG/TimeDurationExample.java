package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeDurationExample {
	@Test
	public void openGoogle() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.co.in");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime = startTime-endTime;
		System.out.println(totalTime);
	}
	@Test 
	public void openYahoo() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.yahoo.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime = startTime-endTime;
		System.out.println(totalTime);
	}
	@Test
	public void openBing() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.bing.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime = startTime-endTime;
		System.out.println(totalTime);
	}

}
