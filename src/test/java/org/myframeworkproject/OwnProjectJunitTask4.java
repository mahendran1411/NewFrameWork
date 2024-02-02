package org.myframeworkproject;
//EX:4 Enter the wattenty and OTP and verify whether the input
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

public class OwnProjectJunitTask4 extends BaseClass {
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
			loadUrl("https://uae.sharafdg.com/warranty/");
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
	      fill(l.getDGWarranty(), getData(1,0));
	      WebElement dgOtp = l.getDGOtp();
	      btnClick(dgOtp);
		}
}
