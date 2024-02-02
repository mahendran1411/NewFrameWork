package org.myframeworkproject;
//EX:6  Enter the company and search and verify whether
//the input data is correct or not by using junit framework.
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

public class OwnProjectJunitTask6 extends BaseClass {
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
		loadUrl("https://uae.sharafdg.com/");
		Date d = new Date();
		  System.out.println("startTime: "+d);
	}
	@After
	public void endTime() {
		Date d = new Date();
	    System.out.println("endTime: "+d);
	}
	@Test  //SharafDG Search Box Company Name
	public void test1() throws IOException {
		LoginPojo l = new LoginPojo();
	fill(l.getDGSearchcompany(), getData(5,1));
	WebElement dgSubmitcompany = l.getDGSubmitcompany();
	btnClick(dgSubmitcompany);
	}
}
