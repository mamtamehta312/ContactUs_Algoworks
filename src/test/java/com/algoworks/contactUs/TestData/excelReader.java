package com.algoworks.contactUs.TestData;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	

	public static FileInputStream fis ;
	public static XSSFWorkbook wb;			
	
	
	public static int RowCount(String filePath,int sheetIndex) throws IOException
	{
	    fis = new FileInputStream(filePath);
		wb=new XSSFWorkbook(fis);
		wb.close();
		fis.close();
		return wb.getSheetAt(sheetIndex).getLastRowNum();
	}
	
	public static int CellCount(String filePath,int sheetIndex,int row ) throws IOException
	{
		wb.close();
		fis.close();
		return wb.getSheetAt(sheetIndex).getRow(row).getLastCellNum();
	}
	
	public static Object getData(String filePath,int sheetIndex,int row ,int cell) throws IOException
	{
		wb.close();
		fis.close();
		DataFormatter  df= new DataFormatter();
	    return 	df.formatCellValue(wb.getSheetAt(sheetIndex).getRow(row).getCell(cell));
		
	}
	
	

}
