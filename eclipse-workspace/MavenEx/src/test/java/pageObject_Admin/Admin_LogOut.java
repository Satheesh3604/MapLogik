package pageObject_Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_LogOut {
	@FindBy(xpath = "//span[text()='Log out']")
	public static WebElement Logout;
	

}
