package org.myframeworkproject;
//EX:5 Create an excel sheet for SharafDG email and password.
//Login in to SharafDG by getting the input data  from excel sheet using DataDriven and execute in maven.
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

public class OwnProjectDataDrivenTask5 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://uae.sharafdg.com/my-account/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("//button[text()='OK']"));
	button.click();
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\MY FRAME WORK  PROJECT EXCEL.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("SharafDG Login New");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	WebElement Uname = driver.findElement(By.xpath("//input[@id='username']"));
	Uname.sendKeys(value);
	Row r1 = s.getRow(1);
	Cell c1 = r1.getCell(1);
	String value1 = c1.getStringCellValue();
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(value1);
	WebElement Login = driver.findElement(By.name("login"));
	Login.click();
}
}
