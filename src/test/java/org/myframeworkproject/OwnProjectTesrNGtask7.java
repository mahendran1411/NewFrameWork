package org.myframeworkproject;
//EX:7 Write test method for enter username and password and
//execute parallel in chrome,firefox,Edge browser.
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask7 extends BaseClass{
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
		driver.get("https://uae.sharafdg.com/my-account/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Test() throws IOException {
		LoginPojo l = new LoginPojo();
		fill(l.getDGusername(), getData(1,0));
		fill(l.getDGpassword(), getData(1,1));
		btnClick(l.getDGlogin());
		System.out.println("success");

	}

}
