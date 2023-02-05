package Bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileData {
	public static void main(String args []) throws IOException
	{
//		File f=new File("src\\Bank\\ExcelfileDemo.xlsx");
//		FileInputStream fis=new FileInputStream(f);
//		or
		FileInputStream fis=new FileInputStream(new File("src\\Bank\\ExcelfileDemo.xlsx"));
		
		XSSFWorkbook WS=new XSSFWorkbook(fis);
		XSSFSheet sh=WS.getSheet("Sheet1");
		
	//	String data=sh.getRow(0).getCell(0).getStringCellValue();
	//	System.out.println(data);
		
		System.out.println(sh.getLastRowNum());
		
		for(int r=0 ; r<=sh.getLastRowNum();r++) {
			
			for(int c=0; c<sh.getRow(0).getLastCellNum();c++) {
				
				System.out.print(sh.getRow(r).getCell(c).getStringCellValue()+ " ");
			}
			System.out.println();
		}
	}

}
