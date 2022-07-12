package excelSheetReading1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StaticReading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	    // To read excel sheet first
		File myfile=new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\sheet2.xlsx");

	    Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row myRow = mysheet.getRow(2);
		Cell myCell = myRow.getCell(1);
		CellType myCellType = myCell.getCellType();
		System.out.println(myCellType);
		System.out.println(myCell.getStringCellValue());
		System.out.println("***************************************");
		
		// code for reading whole data from excel sheet[row 6,cell 2]
		
		Sheet mysheet2 = book.getSheet("Sheet1");
		
		for(int i=0; i<=6; i++)    //outer loop for row
		{
			for(int j=0; j<=2; j++)    //inner loop for cell
			{
				String value = mysheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
