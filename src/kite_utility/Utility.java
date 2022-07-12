package kite_utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility
{
    //excel
	//screen shot
	//closing
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\APMpom.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	    String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
}
