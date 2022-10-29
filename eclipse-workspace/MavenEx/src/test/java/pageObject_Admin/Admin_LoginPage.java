package pageObject_Admin;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_LoginPage {

	// UserName,Password,Submit Button
	@FindBy(id="login-email")
	public static WebElement admin_id;
	@FindBy(id="login-password")
	public static WebElement password;
	@FindBy(xpath = "//button[text()='Log in']" )
	public static WebElement submit;
	
	public static void UserName_Password() throws IOException {
		String fileLocation = "C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\student_ID.xlsx";
		XSSFWorkbook workBook = new XSSFWorkbook(fileLocation); 
		XSSFSheet sheet = workBook.getSheetAt(0);
		DataFormatter df = new DataFormatter();		
		String UserName= sheet.getRow(2).getCell(0).toString();		
	    XSSFCell cell=	sheet.getRow(2).getCell(1);
	    String Password= df.formatCellValue(cell);
	    admin_id.sendKeys(UserName);
	    password.sendKeys(Password);
	}
}
