package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_class extends Base {
	public static String folderPath = getValue("folderpath");
	static Sheet sh;

	public static void excelconnection(String filename, String sheetname)  {

		try {
			FileInputStream fis = new FileInputStream(folderPath + filename);
			Workbook wb = Workbook.getWorkbook(fis);
			sh = wb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int rcount()
	{
		int r = sh.getRows();
		return r;
	}
	public static int ccount()
	{
		int c = sh.getColumns();
		return c;
	}
	public static String readData(int col, int row)
	{
		String str = sh.getCell(col, row).getContents();
		return str;
		
	}
	
	
	
	

}
