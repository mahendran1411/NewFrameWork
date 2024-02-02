package org.testing;
//EX:7 Write test method for enter username and password and
//execute parallel in chrome,firefox,InternetExplorer browser.
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNGTask7 extends BaseClass{
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void test(String name) {
		if (name.equals("edge")) {
			System.out.println("Launch Edge");
			launchEdge();
		}
		else if (name.equals("ff")) {
			System.out.println("Launch Firefox");
			launchFirefox();
		} else {
			System.out.println("Launch Chrome");
			launchChrome();

		}
		driver.get("https://www.flipkart.com/account/login");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Test() throws IOException {
		LoginPojo l = new LoginPojo();
		fill(l.getFlipkartphno(), getData(1,0));
		WebElement flipkartOTP = l.getFlipkartOTP();
		btnClick(flipkartOTP);
		System.out.println("success");

	}

}
