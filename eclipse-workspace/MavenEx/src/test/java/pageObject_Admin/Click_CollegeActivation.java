package pageObject_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Click_CollegeActivation {
	@FindBy(xpath = "//span[text()='College Activation']")
	public static WebElement CollegeActivation;
	@FindBy(xpath = "//span[text()='Add New']")
	public static WebElement AddNew_College;

}
