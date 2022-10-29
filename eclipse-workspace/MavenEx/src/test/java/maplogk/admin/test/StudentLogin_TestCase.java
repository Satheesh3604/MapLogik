package maplogk.admin.test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import commonFunctions.CommonFunctions;
import pageObject_Admin.Admin_LogOut;
import pageObject_Admin.Admin_LoginPage;
import pageObject_Admin.Click_CollegeActivation;
import pageObject_Admin.College_AddDetails;
import pageObject_Admin.importMarks;
import pageObject_Admin.semesterUpload;
import pageObject_Student.Student_AcademicInfo;
import pageObject_Student.Student_Id;
import pageObject_Student.student_OTP;

public class StudentLogin_TestCase extends CommonFunctions {
	// STUDENT PAGE TEST
	public void StudentProperties() throws IOException {
		CommonFunctions.loadProperties();
		String url= properties.getProperty("url");
		driver.get(url);		
	}		
	public void studentPage() throws IOException {	
		PageFactory.initElements(driver,Student_Id.class);	
		Student_Id.Id_MobileNum();
		Student_Id.login.click();
	}
	public void otpEnter() throws IOException {
		PageFactory.initElements(driver,student_OTP.class);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// get OTP print Excel
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Otp_Date");
		String passOtp=wait.until(ExpectedConditions.elementToBeClickable(student_OTP.otp)).getText();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("OTP");
		sheet.getRow(0).createCell(1).setCellValue("DATE & TIME");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(passOtp);
		FileOutputStream file = new FileOutputStream("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\ExcelWriteTest.xlsx");
		wait.until(ExpectedConditions.elementToBeClickable(student_OTP.enterOtp)).sendKeys(passOtp);
		//date and time
		DateFormat dateformate=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dates=new Date();		
		String print=dateformate.format(dates);
		System.out.println(print); 

		sheet.getRow(1).createCell(1).setCellValue(print);
		student_OTP.submit.click();
		workbook.write(file);
		workbook.close();
	}
	public void academicInfo() throws IOException {
		PageFactory.initElements(driver,Student_AcademicInfo.class);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Student_AcademicInfo.AcademicInfo)).click();
		//		wait.until(ExpectedConditions.elementToBeClickable(Student_AcademicInfo.logout)).click();
	}

	public void screenShot() throws AWTException, IOException {
		PageFactory.initElements(driver,Student_AcademicInfo.class);
		Student_AcademicInfo.screen();
		wait.until(ExpectedConditions.elementToBeClickable(Student_AcademicInfo.logout)).click();
	}
	public void screenShotUpdate() throws AWTException, IOException {
		PageFactory.initElements(driver,Student_AcademicInfo.class);
		Student_AcademicInfo.screen1();
		wait.until(ExpectedConditions.elementToBeClickable(Student_AcademicInfo.logout)).click();
	}
	// ADMIN PAGE TEST
	public void adminProperties() throws IOException {
		CommonFunctions.loadPropertiess();
		String urls= properties.getProperty("urls");
		driver.get(urls);
	}
	public void userName() throws IOException {
		PageFactory.initElements(driver,Admin_LoginPage.class);
		Admin_LoginPage.UserName_Password();
		Admin_LoginPage.submit.click();
	}
	public void addNewCollege() { 	
		PageFactory.initElements( driver,Click_CollegeActivation.class);
		Click_CollegeActivation.CollegeActivation.click();
		Click_CollegeActivation.AddNew_College.click();	
	}
	public void collegeDetailsFill() throws AWTException {
		PageFactory.initElements( driver,College_AddDetails.class);
		College_AddDetails.CollegeName.sendKeys(properties.getProperty("CollegeName"));
		College_AddDetails.college_logo();
//		College_AddDetails.college_logo.sendKeys(properties.getProperty("college_logo"));
		College_AddDetails.Address.sendKeys(properties.getProperty("Address"));
		College_AddDetails.location.sendKeys(properties.getProperty("location"));
		College_AddDetails.Affliation.sendKeys(properties.getProperty("Affliation"));
		College_AddDetails.Affliated_To.sendKeys(properties.getProperty("Affliated_To"));
		College_AddDetails.college_type.sendKeys(properties.getProperty("college_type"));
		College_AddDetails.Courses.click();
		College_AddDetails.Contact_Person.sendKeys(properties.getProperty("Contact_Person"));
		College_AddDetails.Contact_Number.sendKeys(properties.getProperty("Contact_Number"));
		College_AddDetails.Contact_Email.sendKeys(properties.getProperty("Contact_Email"));
		College_AddDetails.Contact_Placement.sendKeys(properties.getProperty("Contact_Placement"));
		College_AddDetails.Placement_PhoneNumber.sendKeys(properties.getProperty("Placement_PhoneNumber"));
		College_AddDetails.Placement_Email.sendKeys(properties.getProperty("Placement_Email"));
		College_AddDetails.Submit();
		College_AddDetails.Action_Delete();   	
	}
	public void SearchCollege() {
		PageFactory.initElements( driver,importMarks.class);
		importMarks.search_Clg.sendKeys("Kumaraguru Engineering College");
	}
	public void SemUpload() throws AWTException {
		PageFactory.initElements( driver,semesterUpload.class);
		Actions actions =new Actions(driver);	
		semesterUpload.Import_Marks.click();
		semesterUpload.select();		
		actions.moveToElement(semesterUpload.File_mark).click().build().perform();
		semesterUpload.File_mark.sendKeys("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\maplogikStudentCGPA.csv");
		semesterUpload.importSem();
		semesterUpload.submit.click();   	
	}
	public void logOut() {
		PageFactory.initElements( driver,Admin_LogOut.class);
		Admin_LogOut.Logout.click();
	}
	
	public static void screenShots() throws AWTException, IOException{
	    Robot robot = new Robot();
		Dimension screensize=  Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage source =robot.createScreenCapture(rectangle);
		File file = new File("maplogik.png");
		ImageIO.write(source,"png", file);	
		extentTest.addScreenCaptureFromPath("maplogik.png");
	}
	
	@Test(priority = 0)
	public void StudentPageFirst() throws IOException, AWTException {
		extentTest=extentReports.createTest("Verify StudentPage First ScreenShot");
		StudentProperties();
		screenShots();
		extentTest.log(Status.INFO,"Set Students PropertyFile");
		studentPage();
		extentTest.log(Status.INFO,"Login Student id");
		otpEnter();
		extentTest.log(Status.INFO,"generats OTP Write ExcelSheet");
		academicInfo();
		extentTest.log(Status.INFO,"Student academicInformation verify");
		screenShot();
		extentTest.log(Status.INFO,"verify AcademicInformation Take ScreenShot");
		
	}
	@Test(priority = 1)
	public void AdminPage() throws AWTException, InterruptedException, IOException {
		extentTest=extentReports.createTest("Verify AdminPage Delete (and) Import Marks");
		adminProperties();	
		extentTest.log(Status.INFO,"Set Admin PropertyFile");
		userName();
		extentTest.log(Status.INFO,"Get UserName And Password");
		addNewCollege();
		extentTest.log(Status.INFO,"Click AddNew College");
		collegeDetailsFill();
		extentTest.log(Status.INFO,"Fill Add New College Details");
		extentTest.log(Status.INFO,"Verify To Delete The College");
		SearchCollege();
		extentTest.log(Status.INFO,"Search College student matching same ID's");
		SemUpload();
		extentTest.log(Status.INFO,"Upload The Marks");
		logOut();
		extentTest.log(Status.INFO,"LogOut The AdminBrowser");
	
	}
	@Test(priority = 2)
	public void StudentPageSecond() throws IOException, AWTException {
		extentTest=extentReports.createTest("Verify StudentPage Second ScreenShot");
		StudentProperties();
		extentTest.log(Status.INFO,"Set Students PropertyFile");
		studentPage();
		extentTest.log(Status.INFO,"Login Student id");
		otpEnter();
		extentTest.log(Status.INFO,"generats OTP ReWrite ExcelSheet");
		academicInfo();
		extentTest.log(Status.INFO,"Student academicInformation verify");
		screenShotUpdate();
		extentTest.log(Status.INFO,"After Uploading The Mark In AcademicInformation Take ScreenShot");
	
	}

}











