package org.myframeworkproject;
//EX:4 Enter the wattenty and OTP and verify whether the input are correct or not
//by using Testng framework and access the locator by using POM framework.
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask4 extends BaseClass {
	@BeforeClass
	public static void LaunchBrowser() {
		launchEdge();
		winMax();
	}
		@AfterClass
		public static void BrowserClose() {
			closeEdge();
		}
		@BeforeMethod
		public void StartTime() {
			loadUrl("https://uae.sharafdg.com/warranty/");
			Date d = new Date();
			System.out.println("startTime: "+d);
		}
		@AfterMethod
		private void EndTime() {
			Date d = new Date();
			System.out.println("endTime: "+d);

		}
		
		@Test //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGWarranty(), getData(1,0));
			WebElement dgOtp = l.getDGOtp();
			btnClick(dgOtp);
		}
}
