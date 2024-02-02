package org.myframeworkproject;
//EX:1 Find the Total number of Rows and Total number of cells in excel sheet.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OwnProjectDataDrivenTask1 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\MY FRAME WORK  PROJECT EXCEL.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Search Box");
	int rows = s.getPhysicalNumberOfRows();
	System.out.println("Total Number of Rows: "+rows);
	Row ro = s.getRow(0);
	int cells = ro.getPhysicalNumberOfCells();
	System.out.println("Total Number of Cells: "+cells);
}
}
