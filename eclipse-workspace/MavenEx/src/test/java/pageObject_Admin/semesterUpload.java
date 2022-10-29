package pageObject_Admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class semesterUpload {
	static WebDriver driver;
	public semesterUpload(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath = "((//table/tbody/tr/td)[4]/a[@class='item-edit'][@title='Import Marks'])")
	public static WebElement Import_Marks;
	@FindBy(id = "course_type")
	public static WebElement course_type;
	@FindBy(id = "course_name")
	public static WebElement course_name;
	@FindBy(xpath = "//select[@name='semester']")
	public static WebElement semester;
	@FindBy(id = "import_file")
	public static WebElement File_mark;
	@FindBy(id =   "submitbtn")
	public static WebElement submit;
	
public static void select() {	
	Select select_marks = new Select(course_type);
	select_marks.selectByVisibleText("UG");	
	Select select_Name = new Select(course_name);
	select_Name.selectByVisibleText("B.E Civil Engineering");
	Select select_semester1 = new Select(semester);
	select_semester1.selectByVisibleText("Semester 1");
}	
public static void importSem() throws AWTException {
	Actions action_Semester = new Actions(driver);
	action_Semester.moveToElement(File_mark).click().build().perform();
	File_mark.sendKeys("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\maplogikStudentCGPA.csv");
	StringSelection selection = new StringSelection("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\maplogikStudentCGPA.csv");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL); 
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
