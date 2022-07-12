package excelSheetReading1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// create file object with extension of excel sheet
		File myfile = new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\test1.xlsx");

		// to read excel sheet use workbook factory class
		// 1. String
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(name);
		
		//2. numeric value
		 double number1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(2).getNumericCellValue();
		 System.out.println(number1);
		
		//3. char value
		String char1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		System.out.println(char1);
		
		//4.boolean value
		 boolean abc = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
		 System.out.println(abc);
	}
	


}
