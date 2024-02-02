package org.testing;
//EX:8 Lanuch the browser in chrome and generate a report for that.
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class TestNGTask8 extends BaseClass {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void test(String name) {
		
			System.out.println("Launch Chrome");
			launchChrome();

		
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");

	}
}

