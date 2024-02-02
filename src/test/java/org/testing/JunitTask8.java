package org.testing;
//EX:8 Create a project in maven and register the form by using
//POM & Junit framework and get the input data from excel sheet and
//update the generated  order no in excel.
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

public class JunitTask8 extends BaseClass{
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
			loadUrl("http://www.adactin.com/HotelApp/");
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
			fill(l.getAdactinusername(),getData(1,0));
			fill(l.getAdactinpassword(), getData(1,1));
			WebElement adactinlogin = l.getAdactinlogin();
			btnClick(adactinlogin);
//			printtest(l.getAdactininvalidlogin(),"Invalid Login details or Your Password might have expired. ");
			
		}
}
