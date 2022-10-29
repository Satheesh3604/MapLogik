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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class importMarks {
	static WebDriver driver;

//	public importMarks(WebDriver driver){
//		this.driver=driver;
//	}
	@FindBy(xpath = "//span[text()='College Activation']")
	public static WebElement College_Activation;
	@FindBy(xpath = "//input[@type='search']")
	public static WebElement search_Clg;
	@FindBy(xpath ="((//table/tbody/tr/td)[4]/a[@class='item-edit'][@title='Import Students'])")
	public static WebElement Import_Students;
	@FindBy(id =   "course_type")
	public static WebElement college_Type;
	@FindBy(id =   "course_name")
	public static WebElement course_name;
	@FindBy(id =   "import_file")
	public static WebElement import_file;
	@FindBy(id =   "submitbtn")
	public static WebElement submit;
	
	public static void action() throws AWTException {	
		Select select=new Select(college_Type);
		select.selectByValue("UG");
		Select select_course = new Select(course_name);
	   select_course.selectByVisibleText("B.E Civil Engineering");
	   
	    Actions action_mark = new Actions(driver);
		action_mark.moveToElement(import_file).click().build().perform();
//		import_file.sendKeys("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\maplogikStudentCGPA.csv");
//		StringSelection selection = new StringSelection("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\maplogikStudentCGPA.csv");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
//		Robot robot =new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL); 
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);  
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
