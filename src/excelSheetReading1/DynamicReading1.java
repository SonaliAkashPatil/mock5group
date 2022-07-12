package excelSheetReading1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicReading1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\dynamic1.xlsx");     
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		mysheet.getLastRowNum();     //will give me total number of row count
		
		int TNoRow = mysheet.getLastRowNum();
		System.out.println("Total no.of row's are  "+TNoRow);  //row count start from 0 automatically
		
		// to start cell count start from 0 we change 
		  
		  short TNoCell = mysheet.getRow(TNoRow).getLastCellNum();
		  int CellCount = TNoCell-1;
		  int RowCount = TNoRow;
		  System.out.println("Total no. of Cell's are  "+TNoCell);  //row count start from 1
		 
		  for(int x=0; x<=RowCount; x++)   //outer loop for Row size
		  {
			  for(int y=0; y<=CellCount; y++)   //inner loop for Cell size
			  {
				 Cell CellValue = mysheet.getRow(x).getCell(y) ;
				 CellType dataType = CellValue.getCellType();
				 
				 if(dataType==CellType.STRING)
				 {
					 String value = CellValue.getStringCellValue();
					 System.out.print(value +"  ");
				 }
				 else if(dataType==CellType.NUMERIC)
				 {
					 double numeric = CellValue.getNumericCellValue();
					 System.out.print(numeric +"  ");
				 }
				 
				 else if(dataType==CellType.BOOLEAN)
				 {
					boolean value = CellValue.getBooleanCellValue();
					System.out.print(value +"  ");
				 }
				 
				 else if(dataType==CellType.BLANK)
				 {
					 System.out.print(" ");
					
				 }      
			  }
			  System.out.println(); 
		  }
	}

	
		
	}


