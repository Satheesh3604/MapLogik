package pageObject_Admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class College_AddDetails {
	static WebDriver driver;
	public College_AddDetails(WebDriver driver){
		this.driver=driver;
	}	 
	@FindBy( id = "course_name" )
	public static WebElement CollegeName;
	@FindBy(id="logo")
	public static WebElement college_logo;
	@FindBy(id="address")
	public static WebElement Address;
	@FindBy(xpath = "//select[@name='location']")
	public static WebElement location;
	@FindBy(xpath = "//select[@name='affliation']")
	public static WebElement Affliation;
	@FindBy(xpath = "//select[@name='affliated_to']")
	public static WebElement Affliated_To;
	@FindBy(xpath = "//select[@name='college_type']")
	public static WebElement college_type;
	@FindBy(xpath = "//div[@class='btn-group buttons'][1]")
	public static WebElement Courses;
	@FindBy( id = "cnt_name" )
	public static WebElement Contact_Person;
	@FindBy( id = "cnt_number" )
	public static WebElement Contact_Number;
	@FindBy( id = "cnt_email" )
	public static WebElement Contact_Email;
	@FindBy( id = "cnt_name_plc" )
	public static WebElement Contact_Placement;
	@FindBy( id = "cnt_number_plc" )
	public static WebElement Placement_PhoneNumber;
	@FindBy( id = "course_email_plc" )
	public static WebElement Placement_Email;
	@FindBy( id = "submitbtn" )
	public static WebElement Submit;

			@FindBy( xpath =  "(//table/tbody/tr/td)[4]/a[@class='item-edit dlt-college']" )
			public static WebElement Action_Delete;

	public static void college_logo() throws AWTException {
		Actions action =new Actions(driver);
		action.moveToElement(college_logo).doubleClick().perform();
		college_logo.sendKeys("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\MaplogikFile\\downloads.jpg");
		StringSelection selection = new StringSelection("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\MaplogikFile\\downloads.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
	}
	public static void Submit() {
		WebElement Submit = driver.findElement(By.id("submitbtn"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Submit);
	}	
	public static void Action_Delete(){	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td")));
		List<WebElement> delete = driver.findElements(By.xpath("//table/tbody/tr/td"));
		int size =delete.size();
		for(int i=1;i<=size;i++) {			
			WebElement image= driver.findElement(By.xpath("(//table/tbody/tr/td)["+i+"]"));	
//			String college_senario	=image.getText();
			boolean images= image.isDisplayed();
			Assert.assertTrue(images,"image is displayed");
//			System.out.println("synario is sucessfully"+college_senario);
			if(i==size) {
				//Action Of Delete The College
				WebElement Action_Delete=driver.findElement(By.xpath("(//table/tbody/tr/td)[4]/a[@class='item-edit dlt-college']"));
				Action_Delete.click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
//				System.out.println("true");
			}}}
}
