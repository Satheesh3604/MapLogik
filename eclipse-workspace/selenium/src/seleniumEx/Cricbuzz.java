package seleniumEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-schedule/upcoming-series/international");
		XSSFWorkbook openExcel =new XSSFWorkbook();
		XSSFSheet sheet = openExcel.createSheet("Schedule");
		//Cricket Schedule
		WebElement e = driver.findElement(By.xpath("//h1[text()='Cricket Schedule']"));
		String n=e.getText();
		sheet.createRow(0);
		sheet.getRow(0).createCell(4).setCellValue(n);
		
        //TUE, AUG 30 2022
		WebElement e1 = driver.findElement(By.xpath("//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]"));
		String n1=e1.getText();
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(n1);
		
		//Asia Cup 2022
		WebElement e2 = driver.findElement(By.xpath(" //div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]/../div[@class='cb-col-100 cb-col']/a"));
		String n2=e2.getText();
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue(n2);
		
		//TBC vs TBC, Super Four, Match 3 (A1 v B1)    Dubai International Cricket Stadium, Dubai
		
		WebElement e3 = driver.findElement(By.xpath(" //div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]/../div[@class='cb-col-100 cb-col']/div/div/a" + "//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]/../div[@class='cb-col-100 cb-col']/div/div/div[@itemprop='location']"));
		String n3=e3.getText();
		sheet.createRow(2);
		sheet.getRow(2).createCell(1).setCellValue(n3);
		//
//		WebElement e4 = driver.findElement(By.xpath("//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]/../div[@class='cb-col-100 cb-col']/div/div/div[@itemprop='location']"));
//		String n4=e4.getText();
//		sheet.createRow(2);
//		sheet.getRow(2).createCell(1).setCellValue(n4);
		

		FileOutputStream storeExcel =new FileOutputStream("D:\\cricbuzz3.xlsx");
		openExcel.write(storeExcel);
		openExcel.close();
	}
}



