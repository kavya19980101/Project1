package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleDataExcel {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./Excel/flipkart.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sheet= book.getSheet("Sheet1");
	int lr=sheet.getLastRowNum();
	for(int i=0;i<lr;i++)
	{		
	XSSFRow row=sheet.getRow(i);
	XSSFCell cell=row.getCell(0);
	XSSFCell cell2=row.getCell(1);
	String value=cell.getStringCellValue();
	String value1=cell2.getStringCellValue();
	System.out.println(i+" "+value+" "+value1);
	}
	book.close();
	fis.close();
	
}
}
