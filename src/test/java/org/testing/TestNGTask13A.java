package org.testing;
//EX:13 Open the Gmail application ,  Define the method credentials()
//which is defined as a Dataprovider using the annotation.This method
//returns array of object array.Add a method test() to your DataProviderTest
//class. This method takes two strings as input parameters. Add the annotation
//@Test(dataProvider = “Authentication”) to this method. The attribute dataProvider is
//mapped to “Authentication”.
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

public class TestNGTask13A extends BaseClass{
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
		
		@Test(dataProvider="Gmail",dataProviderClass=TestNGTask13.class)
		//Invalid UserName and Invalid Password[the input are correct or not]
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
