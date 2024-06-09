import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\tastdata\\data.xlsx");
		
		XSSFWorkbook  workbook=new XSSFWorkbook(file);  
		
		XSSFSheet sheet=workbook.getSheet("Sheet2");  //workbook.getSheetAt(0)
		//reading specific row & Cell data
				/*XSSFRow row=sheet.getRow(1);
				XSSFCell cell=row.getCell(0);
				System.out.println(cell.toString());
				*/
		
		
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of rows in excel:"+ totalRows); //5
		System.out.println("number of cells in excel:"+ totalCells); //4
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"       ");
			}
			System.out.println();
		
		}
		
		
		workbook.close();
		file.close();
		
	}
}
