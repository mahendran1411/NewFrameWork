package org.testing;
//EX:4 NOTE: Create an excel sheet with all required details for registration .
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

public class DataDrivenTask4New {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/register");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET NEW.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("https   demoqa.com register new");
	Row r = s.getRow(0);
	Cell c = r.getCell(1);
	String value = c.getStringCellValue();
	WebElement Uname = driver.findElement(By.id("firstname"));
	Uname.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement lastname = driver.findElement(By.id("lastname"));
	lastname.sendKeys(value2);
	Row r2 = s.getRow(1);
	Cell c2 = r2.getCell(2);
	String value3 = c2.getStringCellValue();
	WebElement userName = driver.findElement(By.id("userName"));
	userName.sendKeys(value3);
	Row r3 = s.getRow(1);
	Cell c3 = r3.getCell(3);
	String value4 = c3.getStringCellValue();
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys(value4);
}
}
