package org.testing;
//EX:2 Click signin and enter the email and password and verify
//whether the input data is correct or not by using junit framework.
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

public class JunitTask2 extends BaseClass {
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
			loadUrl("https://www.redbus.in/");
	        Date d = new Date();
	       System.out.println("startTime: "+d);
		}
		@After
		public void endTime() {
			Date d = new Date();
	      System.out.println("endTime: "+d);
		}
		@Test     //Invalid UserName and Invalid Password
		public void test1() throws IOException, InterruptedException {
			LoginPojo l = new LoginPojo();
			WebElement txtUser0 = l.getTxtUser0();
			btnClick(txtUser0);
//			Thread.sleep(2000);
			WebElement btnLogin = l.getTxtUser1();
			btnClick(btnLogin);
			gotoFrameByIndex(0);
			Thread.sleep(2000);
			fill(l.getTxtpass1(),getData(1,0));
			btnClick(l.getBtnLogin1());
			

		}
}
