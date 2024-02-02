package org.testing;
//EX:6 Lanuch this website parallel in chrome,firefox,InternetExplorer browser.
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import com.beust.jcommander.Parameter;

public class TestNGTask6 extends BaseClass{
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
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");

	}
}
