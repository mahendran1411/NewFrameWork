package org.myframeworkproject;
//EX:2 Print all the data present  in excel sheet.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OwnProjectDataDrivenTask2 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\\\Users\\\\user\\\\eclipse-workspace\\\\NewFramework\\\\target\\\\TestData\\\\MY FRAME WORK  PROJECT EXCEL.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Search Box");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
}
}
}
}