package ddt;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class WriteSingleData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet= book.createSheet("flipkartlinks");
			XSSFRow row=sheet.createRow(0);
			XSSFCell cel=row.createCell(0);
			cel.setCellValue("Admin");
			XSSFCell cel1=row.createCell(1);
			cel1.setCellValue("Admin@123");
		FileOutputStream fis=new FileOutputStream("./Excel/Writingdata.xlsx");
		book.write(fis);
		book.close();
		fis.close();

	}

}
