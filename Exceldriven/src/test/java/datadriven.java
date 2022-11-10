import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		/*FileInputStream file =new FileInputStream("C://User//datatestbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("testdata");
		int rowcount = sheet.getLastRowNum();
		System.out.println("last row : "+rowcount);
		
		int colcount = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow  = sheet.getRow(i);
			for(int c=0;c<colcount;c++)
			{
				String value = currentrow.getCell(c).toString();
				System.out.print(value+" \t" );
			} 
			System.out.println();
		}*/
		FileInputStream file =new FileInputStream("C://User//datatestbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("testdata");
		int rowcount = sheet.getLastRowNum();
		System.out.println("last row : "+rowcount);
		String username ;
		int colcount = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=1;i++)
		{
			XSSFRow currentrow  = sheet.getRow(i);
			for(int c=0;c<1;c++)
			{
				String value = currentrow.getCell(c).toString();
				username = value;
				System.out.print(value+" \t" );
			} 
			System.out.println();
		}
		
		
	}

}
