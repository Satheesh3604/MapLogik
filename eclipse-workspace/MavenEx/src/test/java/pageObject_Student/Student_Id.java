package pageObject_Student;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Student_Id {
	
	@FindBy(id = "login-student-id" )
	public static WebElement StudentId;
	@FindBy(xpath = "(//input[@type='text'])[2]" )
	public static WebElement mobile;
	@FindBy(xpath = "(//*[text()='Log in'])" )
	public static WebElement login;

	public static void Id_MobileNum() throws IOException {
		String fileLocation = "C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\student_ID.xlsx";
		XSSFWorkbook workBook = new XSSFWorkbook(fileLocation); 
		XSSFSheet sheet = workBook.getSheetAt(0);
		DataFormatter df = new DataFormatter();
		String id= sheet.getRow(1).getCell(0).toString();		
	    XSSFCell cell=	sheet.getRow(1).getCell(1);
	    String PhoneNum= df.formatCellValue(cell);
	    StudentId.sendKeys(id);
	    mobile.sendKeys(PhoneNum);
	    
	    
		
	}
	
}
