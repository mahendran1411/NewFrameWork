package org.testing;
//EX:3 Insert one new row in the excel sheet. 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTask3 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("DATADRIVEN TASK123");
	Row r1 = s.createRow(12);
	System.out.println("Row Created Successfully");
	Cell c = r1.createCell(3);
	System.out.println("Cell Created Sucessfully");
}
}
