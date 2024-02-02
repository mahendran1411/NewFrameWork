package org.myframeworkproject;
//EX:1 NOTE: Enter the username and password and verify whether
//the input is correct or not by using Testng framework.
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask1 extends BaseClass{
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
			loadUrl("https://uae.sharafdg.com/my-account/");
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
			fill(l.getDGusername(), getData(1,0));
			fill(l.getDGpassword(), getData(1,1));
			btnClick(l.getDGlogin());
		}
		
}
