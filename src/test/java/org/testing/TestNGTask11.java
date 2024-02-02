package org.testing;
//EX:11 Write seperate test case for each textbox based on groups and
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

public class TestNGTask11 extends BaseClass {
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
		@Test(groups="smoke") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test1() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDemfirstname(),"Kannan");
			fill(l.getDemolastname(),"G");
			fill(l.getDemousername(),"Kannan@123");
			fill(l.getDemopassword(),"Kannan236");
			
		}
		
		@Test(groups="sanity") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test2() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDemfirstname(),getData(1,0));
			fill(l.getDemolastname(),getData(1,1));
			fill(l.getDemousername(),getData(1,2));
			fill(l.getDemopassword(),getData(1,3));
			
		}
		@Test(groups="smoke") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test3() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDemfirstname(),"Malar");
			fill(l.getDemolastname(),"D");
			fill(l.getDemousername(),"Malar@123");
			fill(l.getDemopassword(),"Malar784");
			
		}
		
}
