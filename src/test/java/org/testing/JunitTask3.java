package org.testing;
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

public class JunitTask3 extends BaseClass{
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
			loadUrl("https://demoqa.com/register");
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
			fill(l.getDemfirstname(),getData(1,0));
			fill(l.getDemolastname(),getData(1,1));
			fill(l.getDemousername(),getData(1,2));
			fill(l.getDemopassword(),getData(1,3));
			
		}
}
