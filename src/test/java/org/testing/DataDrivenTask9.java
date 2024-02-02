package org.testing;
//EX:9 NOTE: Create an excel sheet with all details required for Hotel Booking . 
//Book a hotel using above url by getting the input data  from excel sheet.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DataDrivenTask9 {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("adactin new");
	Row r = s.getRow(0);
	Cell c = r.getCell(1);
	String value = c.getStringCellValue();
	WebElement Uname = driver.findElement(By.id("username"));
	Uname.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys(value2);
}
}
