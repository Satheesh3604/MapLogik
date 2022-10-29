package pageObject_Student;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Student_AcademicInfo {
	static WebDriver driver;
	@FindBy(xpath = "//span[text()='Academic Info']")
	public static WebElement AcademicInfo;
	@FindBy(xpath = "//span[text()='Log out']")
	public static WebElement logout;	

public static void screen() throws AWTException, IOException{
    Robot robot = new Robot();
	Dimension screensize=  Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle = new Rectangle(screensize);
	BufferedImage source =robot.createScreenCapture(rectangle);
	File file = new File("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\screenShots\\img1.png");
	ImageIO.write(source,"png", file);		
}
public static void screen1() throws AWTException, IOException{
    Robot robot = new Robot();
	Dimension screensize=  Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle = new Rectangle(screensize);
	BufferedImage source =robot.createScreenCapture(rectangle);
	File file = new File("C:\\Users\\SATHISH\\eclipse-workspace\\MavenEx\\src\\test\\resources\\screenShots\\img2.png");
	ImageIO.write(source,"png", file);		
}
}