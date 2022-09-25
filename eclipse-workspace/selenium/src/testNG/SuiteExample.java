package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void open() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openGoogle() {

		driver.get("http:\\www.google.co.in");
	}
	@Test 
	public void openYahoo() {

		driver.get("http:\\www.yahoo.com");
	}
	@Test
	public void openBing() {

		driver.get("http:\\www.bing.com");
	}
	@AfterSuite	
	public void close() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime = startTime-endTime;
		System.out.println(totalTime);
	}
}


