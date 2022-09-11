package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\khads\\eclipse-workspace\\Selenium\\Excel\\Test.xlsx");
		Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");
		String value1 = excelFile.getRow(0).getCell(0).getStringCellValue();
		String value2 = excelFile.getRow(0).getCell(1).getStringCellValue();
		String value3 = excelFile.getRow(1).getCell(0).getStringCellValue();
		String value4 = excelFile.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		
		
	}

}
