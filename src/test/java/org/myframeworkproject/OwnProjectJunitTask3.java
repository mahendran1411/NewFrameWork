package org.myframeworkproject;
//EX:3 Give the details and register the form and verify whether the
//input data's is correct or not by using Junit framework & POM framework. 
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectJunitTask3 extends BaseClass {
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
			loadUrl("https://uae.sharafdg.com/my-account/?action=register");
	        Date d = new Date();
	       System.out.println("startTime: "+d);
		}
		@After
		public void endTime() {
			Date d = new Date();
	      System.out.println("endTime: "+d);
		}
		@Test     //Valid UserName and Valid Password
		public void test1() throws IOException {
			LoginPojo l = new LoginPojo();
			fill(l.getDGEmail(),getData(1,0));
			fill(l.getDGREpass(),getData(1,1));
			fill(l.getDGFirstName(), getData(1,2));
			fill(l.getDGLastname(),getData(1,3));
			fill(l.getDGMobile(), getData(1,4));
		}
}
