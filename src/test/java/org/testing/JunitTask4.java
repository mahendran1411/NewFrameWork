package org.testing;
//EX:4 Enter the email and password and verify whether the input
//data is correct or not by using junit framework & POM framework.
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class JunitTask4 extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		launchEdge();
		winMax();
	}
		@AfterClass
		public static void browserClose() {
			closeEdge();
		}
		@Before
		public void startTime() {
			loadUrl("https://www.flipkart.com/account/login");
	        Date d = new Date();
	       System.out.println("startTime: "+d);
		}
		@After
		public void endTime() {
			Date d = new Date();
	      System.out.println("endTime: "+d);
		}
		@Test     //Invalid UserName and Invalid Password
		public void test1() throws IOException {
			LoginPojo l = new LoginPojo();
	       fill(l.getFlipkartphno(),getData(1,0));
	       WebElement flipkartOTP = l.getFlipkartOTP();
             btnClick(flipkartOTP);
		}
}
