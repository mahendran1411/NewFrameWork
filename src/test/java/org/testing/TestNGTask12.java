package org.testing;
//EX:12 Write seperate test case for each textbox and you have to re execute
//the failed test case and generate the report for that.
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class TestNGTask12 extends BaseClass{
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
		
		@Test(retryAnalyzer=FailedTestNGTask12.class) //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test1() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDemfirstname(),getData(1,0));
			fill(l.getDemolastname(),getData(1,1));
			fill(l.getDemousername(),getData(1,2));
			fill(l.getDemopassword(),getData(1,3));
			
		}
		@Test(enabled=true) //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test2() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDemfirstname(),"Kannan");
			fill(l.getDemolastname(),"G");
			fill(l.getDemousername(),"Kannan@123");
			fill(l.getDemopassword(),"Kannan236");
			
		}
}
