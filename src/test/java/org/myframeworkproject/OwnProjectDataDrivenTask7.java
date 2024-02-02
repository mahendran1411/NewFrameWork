package org.myframeworkproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OwnProjectDataDrivenTask7 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://uae.sharafdg.com/warranty/");
	driver.manage().window().maximize();
}
}
