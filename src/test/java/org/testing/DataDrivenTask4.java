package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDrivenTask4 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https   demoqa.com register");
	driver.manage().window().maximize();
//	List<String>userNameList= new ArrayList<String>();
//	List<String>passwordList= new ArrayList<String>();
//	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET.xlsx");
//	FileInputStream fin = new FileInputStream(f);
//	Workbook w = new XSSFWorkbook(fin);
//	Sheet s = w.getSheet("https   demoqa.com register");
//	Iterator<Row> rowIterator = s.iterator();
//	while(rowIterator.hasNext()) {
//		Row rowValue = rowIterator.next();
//		Iterator<Cell> columnIterator = rowValue.iterator();
//		int i=2;
//		while(columnIterator.hasNext()) {
//			if (i%2==0) {
//				userNameList.add(columnIterator.next().getStringCellValue());
//			}else {
//				passwordList.add(columnIterator.next().getStringCellValue());
//			}
//			i++;
//		}
//		System.out.println("userName List"+userNameList);
//		System.out.println("password List"+passwordList);
//		
//	}
//}
}
}

