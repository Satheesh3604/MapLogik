import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebLogin {
	// inspect the page view id only mention
//	@FindBy
//	public static WebElement id(name);
	@FindBy(xpath = "//*[@class='_2IX_2- VJZDxU']")
	public static WebElement userName;
	@FindBy(xpath = "//*[@class='_2IX_2- _3mctLh VJZDxU']" )
	public static WebElement password;
	@FindBy(xpath = "(//*[text()='Login'])[3]")
	public static WebElement login;
	@FindBy(xpath = "(//*[contains(text(),'Mobiles')])[2]")
	public static WebElement mobile;
	//*********another way****************** 
//	public static WebElement userName(WebDriver driver){
//		return driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));		
//	}
//	public static WebElement password(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
//	}
//	public static WebElement login(WebDriver driver) {
//		return driver.findElement(By.xpath("(//*[text()='Login'])[3]"));
//	}
//	public static WebElement mobile(WebDriver driver) {
//		return driver.findElement(By.xpath("(//*[contains(text(),'Mobiles')])[2]"));
//	}

}
