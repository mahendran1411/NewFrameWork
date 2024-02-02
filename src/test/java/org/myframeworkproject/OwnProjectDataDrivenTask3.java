package org.myframeworkproject;
//EX:3 NOTE: Create an excel sheet with all required details for registration .
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

public class OwnProjectDataDrivenTask3 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://uae.sharafdg.com/my-account/?action=register");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("//button[text()='OK']"));
	button.click();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\MY FRAME WORK  PROJECT EXCEL.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("SharafDG Register NEW");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	WebElement Uname = driver.findElement(By.name("email"));
	Uname.sendKeys(value);
//	Thread.sleep(2000);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value2 = c1.getStringCellValue();
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(value2);
//	Row r1 = s.getRow(1);
//	Cell c1 = r1.getCell(1);
//	String value2 = c1.getStringCellValue();
//	WebElement lastname = driver.findElement(By.name("password"));
//	lastname.sendKeys(value2);
	Row r2 = s.getRow(1);
	Cell c2 = r2.getCell(2);
	String value3 = c2.getStringCellValue();
	WebElement userName = driver.findElement(By.id("first_name"));
	userName.sendKeys(value3);
	Row r3 = s.getRow(1);
	Cell c3 = r3.getCell(3);
	String value4 = c3.getStringCellValue();
	WebElement password2 = driver.findElement(By.id("last_name"));
	password2.sendKeys(value4);
	Thread.sleep(2000);
	Row r4 = s.getRow(1);
	Cell c4 = r4.getCell(4);
	String value5 = c4.getStringCellValue();
	WebElement password1 = driver.findElement(By.xpath("//input[@type='tel']"));
	password1.sendKeys(value5);
}
}
