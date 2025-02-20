package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./Excel/flipkart.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet("Sheet1");		
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		XSSFCell cell2=row.getCell(1);
		String value=cell.getStringCellValue();
		String value1=cell2.getStringCellValue();
		System.out.println(value+" "+value1);
		book.close();
		fis.close();
	}

}
