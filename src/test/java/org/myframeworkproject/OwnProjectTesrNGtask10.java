package org.myframeworkproject;
//EX:10 Open Sharafdg application to perform LogIn which takes the two string
//argument as Username & Password as parameter using TestNG Annotation.
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectTesrNGtask10 extends BaseClass{
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
		public void EndTime() {
			Date d = new Date();
			System.out.println("endTime: "+d);

		}
		
		@Test //Invalid UserName and Invalid Password[the input are correct or not]
		@Parameters({"Tree","Car"})
		public void Test1(String s1, String s2) throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGusername(), s1);
			fill(l.getDGpassword(), s2);
			btnClick(l.getDGlogin());
		}
//		@Test //Invalid UserName and Invalid Password[the input are correct or not]
//		@Parameters({"Bus","Track"})
//		public void Test() throws IOException {
//		LoginPojo l = new LoginPojo();
//		fill(l.getDGusername(), getData(1,0));
//		fill(l.getDGpassword(), getData(1,1));
//		btnClick(l.getDGlogin());
//	}
}
