package org.testing;
//EX:8 Create an excel sheet with all required details for registration . 
//Register the form by getting the input data  from
//excel sheet using DataDriven and execute in maven.
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

public class DataDrivenTask8 {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/register");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("https   demoqa.com register new");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	WebElement Fname = driver.findElement(By.id("firstname"));
	Fname.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement Lname = driver.findElement(By.id("lastname"));
	Lname.sendKeys(value2);
	Row r2 = s.getRow(1);
	Cell c3 = r2.getCell(2);
	String value3 = c3.getStringCellValue();
	WebElement Uname = driver.findElement(By.id("userName"));
	Uname.sendKeys(value3);
	Row r3 = s.getRow(1);
	Cell c4 = r3.getCell(3);
	String value4 = c4.getStringCellValue();
	WebElement Password = driver.findElement(By.id("password"));
	Password.sendKeys(value4);
}
}
