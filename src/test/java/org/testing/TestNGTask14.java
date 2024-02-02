package org.testing;
//EX:14 Open Gmail application to perform LogIn which takes the two string
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

public class TestNGTask14 extends BaseClass  {
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
			loadUrl("https://mail.google.com/");
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
			fill(l.getEmailId(), s1);
			WebElement emailidnext = l.getEmailidnext();
			btnClick(emailidnext);
			fill(l.getEmailpass(), s2);
			WebElement emailpassnext = l.getEmailpassnext();
			btnClick(emailpassnext);
		}
//		@Test //Invalid UserName and Invalid Password[the input are correct or not]
//		@Parameters({"Bus","Track"})
//		public void Test2(String s1, String s2) throws IOException {
//			LoginPojo l = new LoginPojo();
//			fill(l.getEmailId(), s1);
//			WebElement emailidnext = l.getEmailidnext();
//			btnClick(emailidnext);
//			fill(l.getEmailpass(),s2);
//			WebElement emailpassnext = l.getEmailpassnext();
//			btnClick(emailpassnext);
//
//		}
}
