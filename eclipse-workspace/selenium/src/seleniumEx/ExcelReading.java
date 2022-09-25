package seleniumEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
//		File file = new File("D:\\excelfiles");
//		FileInputStream inputstream = new FileInputStream(file);
//		Workbook wb = new XSSFWorkbook(inputstream);
//		Sheet sheet = wb.getSheet("Sheet1");
//		int rowcount = sheet.getFirstRowNum()-sheet.getLastRowNum();
//		for(int i=0;i<rowcount+1;i++) {
//			Row row = sheet.getRow(i);
//			for(int j=0;j<row.getLastCellNum();j++) {
//			System.out.print(row.getCell(j).getStringCellValue()+ "| |");
//			
//			}
//			System.out.println();
//		}
String fileLocation  = "./test-data/New Microsoft Office Excel Worksheet.xlsx.xlsx";
XSSFWorkbook wb = new XSSFWorkbook(fileLocation);
XSSFSheet b= wb.getSheetAt(0);
XSSFRow row=b.getRow(1);
XSSFCell cell =row.getCell(0);
String value = cell.getStringCellValue();
System.out.println(value);
	}

}
