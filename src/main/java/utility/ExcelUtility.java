package utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	// get access to workbook that is excel sheet
	//get access to sheet
	// get access to row
	//get access to column
	//get required column 
	//get data in arraylist
	/*
	 * identify test case name column  by accessing first row
	 * 
	 */
	
	
	public   ArrayList<String> getdata(String testcaseName) throws IOException
	
	{
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("src\\test\\java\\testData\\Login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for (int i=0; i<sheets; i++ )
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("testData")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				System.out.println( "sheet : " +sheet.getSheetName());
				
				Iterator<Row> rows= sheet.iterator();
				Row firstrow = rows.next();
				int k =0;
				int column = 0;
				Iterator<Cell> ce =firstrow.cellIterator();
				while (ce.hasNext())
				{
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
						column =k;
						
					}
					k++;
				}
				System.out.println(column);
				
				//once couln is identified then iterate through all column to get desired row
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Assignment1_Login"))
							{
						
						// after you go to desired row then pull the data amd put im test
						Iterator <Cell> cv = r.cellIterator();
						while(cv.hasNext()) 
						{
						a.add(cv.next().getStringCellValue());
						
						}
				}
				
			}
			
			}
		
		}
		return a;
		
	}
	
	public static void main(String args[]) throws IOException
	{
		
	}

}
