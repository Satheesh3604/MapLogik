package seleniumEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveChennai {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		// Today Gold Rate Per Gram in Chennai (INR)
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// CHENNAI GOLD RATE
		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		List<WebElement> gold= driver.findElements(By.xpath("//*[contains(text(),'Today Gold Rate Per Gram')]/following::table[1]/tbody/tr"));
		int table=gold.size();

		for(int i=1,r=1;i<=table;i++,r++) {
			WebElement date = driver.findElement(By.xpath("//*[contains(text(),'Today Gold Rate Per Gram')]/following::table[1]/tbody/tr["+i+"]"));
			String value = date.getText();
			XSSFRow row = sheet.createRow(r);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(value);
			System.out.println(value);
		}
		System.out.println("************************************");
		// CHENNAI SILVER RATE
		List<WebElement> silver= driver.findElements(By.xpath("//font[@color='#999999']/following::table[1]/tbody/tr"));
		int table2=silver.size();
		for(int j=1,k=14;j<=table2;j++,k++) {
			WebElement date = driver.findElement(By.xpath("//font[@color='#999999']/following::table[1]/tbody/tr["+j+"]"));
			String value2 = date.getText();
			XSSFRow row = sheet.createRow(k);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue(value2);
			System.out.println(value2);
		}
		FileOutputStream file = new FileOutputStream("E:\\LiveChennai.xlsx");
		wb.write(file);
		wb.close();
	}

}

