package org.testing;
//EX:7 Create an excel sheet for facebook email and password.
//Create a project in maven.
//Login in to facebook by getting the input data from excel sheet.
//Update the successful login or error message generated after login in excel sheet using DataDriven.
import java.io.File;
import java.io.FileInputStream;
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

public class DateDrivenTask7 {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("Facebook Login");
	Row r = s.getRow(0);
	Cell c = r.getCell(1);
	String value = c.getStringCellValue();
	WebElement Pnumber = driver.findElement(By.id("email"));
	Pnumber.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement Password = driver.findElement(By.id("pass"));
	Password.sendKeys(value2);
}
}
