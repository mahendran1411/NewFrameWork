package org.myframeworkproject;
//EX:6 Lanuch this website parallel in chrome,firefox,InternetExplorer browser.
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class OwnProjectTesrNGtask6 extends BaseClass {
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
		driver.get("https://uae.sharafdg.com/");
		driver.manage().window().maximize();
		

	}
}
