package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CommonFunctions {
	public static WebDriverWait wait=null;
	public static WebDriver driver=null; 
	public static Properties properties=null;
	public static ExtentReports extentReports;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentTest extentTest;
	

	public static Properties loadProperties() throws IOException{
		FileInputStream file = new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(file);
		return properties;
	}
	public static Properties loadPropertiess() throws IOException{
		FileInputStream file = new FileInputStream("admin.properties");
		properties=new Properties();
		properties.load(file);
		return properties;
	}
	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperties();
		String Browser= properties.getProperty("browser");
		String Location= properties.getProperty("location");
		String url= properties.getProperty("url");

		extentReports = new ExtentReports(); 
		sparkReporter = new ExtentSparkReporter("ExtentReports.html");
		extentReports.attachReporter(sparkReporter);


		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					Location);
			driver = new ChromeDriver();		
		}else if(Browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gacko.driver",
					Location);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
//		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}



	@AfterSuite
	public void teardwon() {
				driver.quit();
		extentReports.flush();
	}
}
