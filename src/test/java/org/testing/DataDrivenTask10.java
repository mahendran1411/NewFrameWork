package org.testing;
//EX:10 NOTE: Create an excel sheet with all details required for Hotel Booking .
//Create a maven project. 
//Book a hotel using above url by getting the input data  from excel sheet.
//Update the orderNo generated after hotel booking in excel sheet using DataDriven.

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTask10 {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET NEW.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.createSheet("http://www.adactin.com/HotelApp/");
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("Username");
	Row r1 = s.createRow(1);
	Cell c1 = r1.createCell(0);
	c1.setCellValue("Password");
	Row r2 = s.createRow(0);
	Cell c2 = r2.createCell(1);
	c2.setCellValue("adact543");
	Row r3 = s.createRow(1);
	Cell c3 = r3.createCell(1);
	c3.setCellValue("adact7213");
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("success");
	Row r4 = s.getRow(0);
	Cell c4 = r4.getCell(1);
	String value = c4.getStringCellValue();
	WebElement Uname = driver.findElement(By.id("username"));
	Uname.sendKeys(value);
	Row r5 = s.getRow(1);
	Cell c5 = r5.getCell(1);
	String value2 = c5.getStringCellValue();
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys(value2);
	for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
		Row r6= s.getRow(i);
		for (int j = 0; j < r6.getPhysicalNumberOfCells(); j++) {
			Cell c6 = r6.getCell(j);
			int cellType = c6.getCellType();
			if (cellType==1) {
				String Value = c6.getStringCellValue();
				if (Value.contains("adact543")) {
					c6.setCellValue("adact4357");
					FileOutputStream fout1 = new FileOutputStream(f);
					w.write(fout1);
					System.out.println("Updated");
				}
			}
		}
	}
}
}
