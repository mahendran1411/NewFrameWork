package org.myframeworkproject;
//EX:6 Create an excel sheet for SharafDG in warranty Login Mobile Number.
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

public class OwnProjectDataDrivenTask6 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://uae.sharafdg.com/warranty/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='OK']"));
		button.click();
		Thread.sleep(2000);
		File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\MY FRAME WORK  PROJECT EXCEL.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("warranty Login Page");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		WebElement Uname = driver.findElement(By.xpath("//input[@type='tel']"));
		Uname.sendKeys(value);
	}
}
