package org.myframeworkproject;
//EX:7 Enter the product and search and and Product Name Print verify whether
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

public class OwnProjectJunitTask7 extends BaseClass{
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
	@Test  //SharafDG Search Box Product Name Print
	public void test1() throws IOException {
		LoginPojo l = new LoginPojo();
	fill(l.getDGSearchprint(), getData(3,1));
	WebElement dgSubmitprint = l.getDGSubmitprint();
	btnClick(dgSubmitprint);
	WebElement dGprint = l.getDGprint();
	printtest(dGprint, getData(3,1));
	}
}
