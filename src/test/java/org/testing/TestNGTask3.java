package org.testing;
//EX:3 Give the details and register the form and verify whether the input are correct or not
//by using Testng framework and access the locator by using POM framework.
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNGTask3 extends BaseClass {
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
			loadUrl("https://demoqa.com/register");
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
			fill(l.getDemfirstname(),getData(1,0));
			fill(l.getDemolastname(),getData(1,1));
			fill(l.getDemousername(),getData(1,2));
			fill(l.getDemopassword(),getData(1,3));
			
		}
		
}
