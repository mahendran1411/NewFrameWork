package org.testing;
//EX:11 Create an excel sheet with all details required for registration.
//Create a maven project. 
//Register a form in above url by getting the input data  from excel sheet.
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

public class DataDrivenTask11 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://my.naukri.com/account/register/basicdetails");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET NEW.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("my.naukri.com");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	WebElement Uname = driver.findElement(By.id("name"));
	Uname.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement Password = driver.findElement(By.id("email"));
	Password.sendKeys(value2);
	Thread.sleep(2000);
	Row r2 = s.getRow(1);
	Cell c2 = r2.getCell(2);
	String value3 = c2.getStringCellValue();
	WebElement Password1 = driver.findElement(By.id("password"));
	Password1.sendKeys(value3);
	Thread.sleep(2000);
	Row r3 = s.getRow(1);
	Cell c3 = r3.getCell(3);
	String value4 = c3.getStringCellValue();
	WebElement Password2 = driver.findElement(By.id("mobile"));
	Password2.sendKeys(value4);
}
}
