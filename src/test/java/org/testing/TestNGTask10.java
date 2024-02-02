package org.testing;
//EX:10 Write a test method for entering email and password  based on groups and
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

public class TestNGTask10 extends BaseClass {
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
			loadUrl("https://www.facebook.com/");
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
			fill(l.getTxtUser(), "kumar81");
			fill(l.getTxtpass(), "kumar@123");
			btnClick(l.getBtnLogin());
		}
		@Test(groups="sanity", enabled=true) //Invalid UserName and Invalid Password
		public void Test2() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getTxtUser(), "kannan");
			fill(l.getTxtpass(), "kannan@123");
			btnClick(l.getBtnLogin());
		}
		
		@Test(groups="smoke") //Invalid UserName and Invalid Password
		public void Test3() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getTxtUser(), getData(1,0));
			fill(l.getTxtpass(), getData(1,1));
			btnClick(l.getBtnLogin());
		}
}
