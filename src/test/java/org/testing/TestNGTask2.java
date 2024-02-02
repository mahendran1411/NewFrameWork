package org.testing;
//EX:2 Click signin and enter the email and password and verify whether
//the input are correct or not by using Testng framework.
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

public class TestNGTask2 extends BaseClass{
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
			loadUrl("https://www.redbus.in/");
			Date d = new Date();
			System.out.println("startTime: "+d);
		}
		@AfterMethod
		private void EndTime() {
			Date d = new Date();
			System.out.println("endTime: "+d);

		}
		
		@Test //Invalid UserName and Invalid Password
		public void Test() throws IOException {
			LoginPojo l = new LoginPojo();
			WebElement txtUser0 = l.getTxtUser0();
			btnClick(txtUser0);
//			Thread.sleep(2000);
			WebElement btnLogin = l.getTxtUser1();
			btnClick(btnLogin);
			gotoFrameByIndex(1);
			//gotoFrameByElement(l.getRedbusiframe());
			fill(l.getTxtpass1(),getData(1,0));
			btnClick(l.getBtnLogin1());
		}
}
