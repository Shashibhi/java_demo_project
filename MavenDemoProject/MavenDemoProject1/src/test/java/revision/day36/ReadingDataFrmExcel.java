package revision.day36;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFrmExcel {
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"//tastdata//data.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	/*	XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.toString());  */
		
		int totalrow = sheet.getLastRowNum();
		int  totalcell = sheet.getRow(1).getLastCellNum();
		
		System.out.println("total rows..:"+totalrow);
		System.out.println("total num of column..:"+totalcell);
		
		for(int r=0;r<totalrow;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
					for(int c=0;c<totalcell;c++)
					{
						XSSFCell cell= currentrow.getCell(c);
						System.out.print(cell.toString()+"        ");
					}
					System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
