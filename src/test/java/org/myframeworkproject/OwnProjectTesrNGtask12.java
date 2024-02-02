package org.myframeworkproject;
//EX:12 Write seperate test case for each textbox and you have to re execute
//the failed test case and generate the report for that.
import java.io.IOException;
import java.util.Date;

import org.testing.FailedTestNGTask12;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask12 extends BaseClass{
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
			loadUrl("https://uae.sharafdg.com/my-account/?action=register");
			Date d = new Date();
			System.out.println("startTime: "+d);
		}
		@AfterMethod
		private void EndTime() {
			Date d = new Date();
			System.out.println("endTime: "+d);

		}
		
		@Test(retryAnalyzer=FailedOwnProjectTestNGTask12.class) //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGEmail(), getData(1,0));
			fill(l.getDGREpass(), getData(1,1));
			fill(l.getDGFirstName(), getData(1,2));
			fill(l.getDGLastname(),getData(1,3));
			fill(l.getDGMobile(), getData(1,4));
		}
//		@Test(enabled=true) //Invalid UserName and Invalid Password[the input are correct or not]
//		public void Test2() throws IOException {
//			LoginPojo l = new LoginPojo();
//			fill(l.getDemfirstname(),"Kannan");
//			fill(l.getDemolastname(),"G");
//			fill(l.getDemousername(),"Kannan@123");
//			fill(l.getDemopassword(),"Kannan236");
//			
//		}
}
