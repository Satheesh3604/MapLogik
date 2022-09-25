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

public class LiveChennaiTable {

	public static void main(String[] args) throws IOException {
		//TODAY GOLD/SILVER RATES IN CHENNAI
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// OPEN LIVE CHENNAI URL
		driver.get("https://www.livechennai.com/gold_silverrate.asp");
		// create Excel 
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Tables");
		//GoldRate Table Header
		List<WebElement> Header= driver. findElements(By.xpath("//span[@class='title-clr']"));
		int size=Header.size();
		XSSFRow firstRow= sheet.createRow(0);
		// Getting Header first row in table
		for(int head=1,c=0;head<=3; head++,c++)
		{			
			WebElement HeaderTable=driver.findElement(By.xpath("(//span[@class='title-clr'])["+ head +"]"));
			String Row1= HeaderTable.getText();
			firstRow= sheet.getRow(0);
			XSSFCell cell= firstRow.createCell(c);
			cell.setCellValue(Row1);
			System.out.print(Row1+"     ");
		}
		System.out.println(" ");
		XSSFRow secondRow= sheet.createRow(1);
		//Getting Header second Row table
		for (int head2=4,c1=1;head2<=7;head2++,c1++)
		{
			WebElement HeaderTable2=driver.findElement(By.xpath("(//span[@class='title-clr'])["+ head2 +"]"));
			String Row2= HeaderTable2.getText();
			secondRow= sheet.getRow(1);
			XSSFCell cell1= secondRow.createCell(c1);
			cell1.setCellValue(Row2);
			System.out.print("       "+  Row2 + "");
		}
		System.out.println();
		//Getting number of rows in table
		List<WebElement> rows= driver.findElements(By.xpath("//td[@width='9%']"));
		int rowsize=rows.size();
		for(int row=1,r2=2; row<=rowsize;row++,r2++)
		{
			// print 1st entire coloum print
			WebElement date=driver.findElement(By.xpath("(//td[@width='9%'])["+ row +"]"));
			String column1=date.getText();                                                         //Getting value in first column
			XSSFRow row2= sheet.createRow(r2);
			XSSFCell cell2= row2.createCell(0);
			cell2.setCellValue(column1);
			// print 2nd entire coloum print
			WebElement weight1=driver.findElement(By.xpath("(//td[@width='16%'])["+ row +"]"));
			String column2=weight1.getText();                                                       //Getting value in Second column
			XSSFRow row3= sheet.getRow(r2);
			XSSFCell cell3= row3.createCell(1);
			cell3.setCellValue(column2);
			// print 3rd entire coloum print
			WebElement weight2=driver.findElement(By.xpath("(//td[@width='12%'])["+ row +"]"));
			String column3=weight2.getText();                                                       //Getting value in Third column
			XSSFRow row4= sheet.getRow(r2);
			XSSFCell cell1= row4.createCell(2);
			cell1.setCellValue(column3);
			// print 4th entire coloum print
			WebElement weight3=driver.findElement(By.xpath("(//td[@width='22%'])["+ row+"]"));
			String column4=weight3.getText();                                                       //Getting value in fourth column
			XSSFRow row5= sheet.getRow(r2);
			XSSFCell cell5= row5.createCell(3);
			cell5.setCellValue(column4);
			// print 5th entire coloum print
			WebElement weight4=driver.findElement(By.xpath("(//td[@width='11%'])["+ row +"]"));
			String column5=weight4.getText();                                                       //Getting value in fifth column
			XSSFRow row6= sheet.getRow(r2);
			XSSFCell cell6= row6.createCell(4);
			cell6.setCellValue(column5);
			System.out.println(column1 + "  " + column2 + "  "+ column3 + "  " + column4 +"  " + column5 );
		}
		System.out.println("TODAY CHENNAI SILVER RATE");
		// silverRate Header
		List<WebElement> date = driver.findElements(By.xpath("(//td[@bordercolor='#808080'])"));
		int silver = date.size();
		XSSFRow silverhead = sheet.createRow(14);
		for(int j=1,k=0;j<=3;j++,k++)
		{
			// getting header and print
			WebElement sil = driver.findElement(By.xpath("(//td[@bordercolor='#808080'])["+j+"]"));
			String d= sil.getText();
			XSSFCell scell = silverhead.createCell(k);
			scell.setCellValue(d);
			System.out.print("      "+d);
		}
		System.out.println();
		List<WebElement> silver2 = driver.findElements(By.xpath("(//font[@color='#484848' and  contains(text(),'2022')])"));
		int hdS =silver2.size();
		//Row & Coloum find store the text one String value 
		for(int i=1,x=15;i<=hdS;i++,x++) {
			// silver first entire coloum print
			WebElement silverDate = driver.findElement(By.xpath("(//font[@color='#484848' and  contains(text(),'2022')])["+i+"]"));
			String value = silverDate.getText();
			XSSFRow silverhead4 = sheet.createRow(x);
			XSSFCell scell = silverhead4.createCell(0);
			scell.setCellValue(value);
			// silver second entire coloum print
			WebElement silverGrm1 = driver.findElement(By.xpath("(//font[@color='#484848' and text()>=55 and text()<70])["+i+"]"));
			String value1 = silverGrm1.getText();
			XSSFRow silverhead1 = sheet.getRow(x);
			XSSFCell scell1 = silverhead1.createCell(1);
			scell1.setCellValue(value1);
			// silver third entire coloum print
			WebElement silver1Kg = driver.findElement(By.xpath("(//font[@color='#484848' and text()>=55000 and text()<70000])["+i+"]"));
			String value2 = silver1Kg.getText();
			XSSFRow silverhead2 = sheet.getRow(x);
			XSSFCell scell2 = silverhead2.createCell(2);
			scell2.setCellValue(value2);
			System.out.println(value+ "|" +value1 +"|"+value2+"|");
		}	
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);		
		//Creating fileName & location
		FileOutputStream fos =new FileOutputStream("E:\\TodayGoldRate.xlsx");
		book.write(fos);
		book.close();
	}
}
