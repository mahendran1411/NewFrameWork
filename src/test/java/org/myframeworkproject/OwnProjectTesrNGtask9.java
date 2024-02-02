package org.myframeworkproject;
//EX:9 Write seperate test case for each textbox based on groups and
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

public class OwnProjectTesrNGtask9 extends BaseClass{
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
		@Test(groups="smoke") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test1() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGFirstName(),"Kannan");
			fill(l.getDGLastname(),"G");
			fill(l.getDGEmail(),"Kannan@123");
			fill(l.getDGREpass(),"Kannan236");
			fill(l.getDGMobile(), "9563216345");
			
		}
		
		@Test(groups="sanity") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test2() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGEmail(), getData(1,0));
			fill(l.getDGREpass(), getData(1,1));
			fill(l.getDGFirstName(), getData(1,2));
			fill(l.getDGLastname(),getData(1,3));
			fill(l.getDGMobile(), getData(1,4));
			System.out.println("success");
		}
		@Test(groups="smoke") //Invalid UserName and Invalid Password[the input are correct or not]
		public void Test3() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGFirstName(),"Malar");
			fill(l.getDGLastname(),"D");
			fill(l.getDGEmail(),"Malar@123");
			fill(l.getDGREpass(),"Malar784");
			fill(l.getDGMobile(), "9983561286");
			
		}
}
