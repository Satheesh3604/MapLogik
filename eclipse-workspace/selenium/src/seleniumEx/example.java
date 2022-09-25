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

public class example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-schedule/upcoming-series/international");
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Schedule");
		{
			List<WebElement> Time= driver.findElements(By.xpath("//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]"));
			int A = Time.size();
//			List<WebElement> Time1= driver.findElements(By.xpath("((//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))])/../div/a)"));
//			int B = Time1.size();
//			List<WebElement> Time2= driver.findElements(By.xpath("(((//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))])/../div/a)/../div/div/a)"));
//			int C = Time2.size();
			for(int i=0;i<=A;i++) {
//				for(int j=0;j<=B;j++) {
//					for(int k=0;k<=C;k++) {
						WebElement Time4= driver.findElement(By.xpath("//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))]["+i+"]"));
						String A1 = Time4.getText();
//						WebElement Time5= driver.findElement(By.xpath("((//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))])["+i+"]/../div/a)["+j+"]"));
//						String B1 = Time5.getText();
//						WebElement Time6= driver.findElement(By.xpath("(((//div[@class='cb-lv-grn-strip text-bold' and not(contains(text(),'FRI'))])["+i+"]/../div/a)["+j+"]/../div/div/a)["+k+"]"));
//						String C1 = Time6.getText();
//						sheet.createRow(0);
//						sheet.getRow(0).createCell(0).setCellValue(A1);
//						sheet.getRow(1).createCell(0).setCellValue(B1);
//						sheet.getRow(1).createCell(1).setCellValue(C1);
//						FileOutputStream fos =new FileOutputStream("D:\\cricbuzz5.xlsx");
//						book.write(fos);
//						book.close();
						System.out.println(A1);
					}
				}

			}
//		}}
}
