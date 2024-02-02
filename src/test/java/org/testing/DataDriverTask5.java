package org.testing;
//EX:5 Create an excel sheet with all details required for Hotel Booking . 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverTask5 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET NEW.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.createSheet("New adactin");
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("Username");
	Row r1 = s.createRow(1);
	Cell c2 = r1.createCell(0);
	c2.setCellValue("Password");
	Row r2 = s.createRow(0);
	Cell c3 = r2.createCell(1);
	c3.setCellValue("adact543");
	Row r4 = s.createRow(1);
	Cell c4 = r4.createCell(1);
	c4.setCellValue("adact7213");
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("success");
}
}
