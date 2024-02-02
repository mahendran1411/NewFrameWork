package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	//1.Declare the location
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\Sample Excel.xlsx");
	//2.Read the from excel sheet
	FileInputStream fin = new FileInputStream(f);
	//3.Type of Workbook
	Workbook w = new XSSFWorkbook(fin);
	//4.Get the specific sheet
	Sheet s = w.getSheet("greens");
//	//5.Get the specific row
//	Row r = s.getRow(2);
//	//6.Get the specific cell
//	Cell c = r.getCell(1);
//	System.out.println(c);
//	//7 Count the p.rows
//	int prows = s.getPhysicalNumberOfRows();
//	System.out.println(prows);
//	Row ro = s.getRow(3);
//	//8 Count of p.cells
//	int pcells = ro.getPhysicalNumberOfCells();
//	System.out.println(pcells);
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r1 = s.getRow(i);
		for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
			Cell c1 = r1.getCell(j);
//			System.out.println(c1); // Name // Locator //Mobile No //DOB //Department
			int cellType = c1.getCellType();
			if (cellType==1) {
				String value = c1.getStringCellValue();
				System.out.println(value);
			}
			else if (DateUtil.isCellDateFormatted(c1)) {
				Date value = c1.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("DD,MMMM,YYYY");
				String format = sim.format(value);
				System.out.println(format);
			} else {
            double d = c1.getNumericCellValue();
            //Convert double to long
            long l = (long)d;
            String v = String.valueOf(l);
            System.out.println(v);
			}
		}
		
	}
}
}


