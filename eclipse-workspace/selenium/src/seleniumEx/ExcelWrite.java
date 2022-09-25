package seleniumEx;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("satheesh");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("0,0");
		sheet.getRow(0).createCell(1).setCellValue("0,1");
		sheet.getRow(0).createCell(2).setCellValue("0,2");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("1,0");
		sheet.getRow(1).createCell(1).setCellValue("1,1");
		sheet.getRow(1).createCell(2).setCellValue("1,2");
		FileOutputStream file = new FileOutputStream("E:\\ExcelWriteTest.xlsx");
		workbook.write(file);
		workbook.close();
	}

}
