package org.myframeworkproject;
//EX:8 Write a test method for entering email and password  based on groups and
//execute it based on groups.
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask8 extends BaseClass{
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
			loadUrl("https://uae.sharafdg.com/");
			Date d = new Date();
			System.out.println("startTime: "+d);
		}
		@AfterMethod
		private void EndTime() {
			Date d = new Date();
			System.out.println("endTime: "+d);

		}
		@Test(groups="smoke") //Invalid UserName and Invalid Password
		public void Test1() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGusername(), "kumar81");
			fill(l.getDGpassword(), "kumar@123");
			btnClick(l.getDGlogin());
		}
		@Test(groups="sanity", enabled=true) //Invalid UserName and Invalid Password
		public void Test2() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGusername(), "kannan");
			fill(l.getDGpassword(), "kannan@123");
			btnClick(l.getDGlogin());
		}
		
		@Test(groups="smoke") //Invalid UserName and Invalid Password
		public void Test() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGusername(), getData(1,0));
			fill(l.getDGpassword(), getData(1,1));
			btnClick(l.getDGlogin());
		}

}
