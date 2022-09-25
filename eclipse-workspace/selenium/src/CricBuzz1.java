import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-schedule/upcoming-series/international");
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Schedule");
		{
			WebElement Time= driver.findElement(By.xpath("(//div[@class='cb-lv-grn-strip text-bold'])"));
			String Date =Time.getText();
			XSSFRow row= sheet.createRow(0);
			XSSFCell cell= row.createCell(0);
			cell.setCellValue(Date);
			//series
			sheet.autoSizeColumn(0);
			for (int i=1,ro=1;i<=2;i++,ro++)
			{
				WebElement series= driver.findElement(By.xpath("(//a[@class='cb-col-33 cb-col cb-mtchs-dy text-bold'])["+ i +"]"));
				String name= series.getText();
				XSSFRow row1= sheet.createRow(ro);
				XSSFCell cell1= row1.createCell(0);
				cell1.setCellValue(name);
			}
			//match
			for (int i=1,r=1;i<=2;i++,r++)
			{
				WebElement series1= driver.findElement(By.xpath("(//div[@class='cb-ovr-flo cb-col-60 cb-col cb-mtchs-dy-vnu cb-adjst-lst'])["+ i +"]"));//"));
				String name1= series1.getText();
				XSSFRow row2= sheet.getRow(r);
				XSSFCell cell2= row2.createCell(1);
				cell2.setCellValue(name1);
			}
				for (int i=1,r=1;i<=2;i++,r++)
				{
					WebElement series2= driver.findElement(By.xpath("(//div[@class='cb-col-40 cb-col cb-mtchs-dy-tm cb-adjst-lst'])["+ i +"]"));
					String name2= series2.getText();
					XSSFRow row2= sheet.getRow(r);
					XSSFCell cell3= row2.createCell(2);
					cell3.setCellValue(name2);
				}			
			FileOutputStream fos =new FileOutputStream("D:\\cricbuzz2.xlsx");
			book.write(fos);
			book.close();
		}
	}
	}

	
