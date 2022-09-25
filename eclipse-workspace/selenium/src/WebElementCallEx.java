import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.adm.TestNG.TestNGWebLogin;

public class WebElementCallEx {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		// new interface
		PageFactory.initElements(driver, WebLogin.class);
		
		WebLogin.userName.sendKeys("8807726575");
		WebLogin.password.sendKeys("3604");
		WebLogin.login.click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().forward();
		WebLogin.mobile.click();
		Thread.sleep(4000);
		driver.navigate().back();
		String title= driver.getTitle();
		System.out.println(title);
	}	
}
