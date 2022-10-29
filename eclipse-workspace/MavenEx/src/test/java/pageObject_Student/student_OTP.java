package pageObject_Student;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class student_OTP {

	@FindBy(id = "test_otp")
	public static WebElement otp;
	@FindBy(id = "login-otp")
	public static WebElement enterOtp;
	@FindBy(xpath = "(//*[text()='Submit'])")
	public static WebElement submit;

}