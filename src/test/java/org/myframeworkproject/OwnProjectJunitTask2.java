package org.myframeworkproject;
//EX:2 Enter the username and password and verify whether the input
//data is correct or not by using junit framework.
import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectJunitTask2 extends BaseClass{
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
		loadUrl("https://uae.sharafdg.com/my-account/");
		Date d = new Date();
		  System.out.println("startTime: "+d);
	}
	@After
	public void endTime() {
		Date d = new Date();
	    System.out.println("endTime: "+d);
	}
	@Test  //Valid UserName and Valid Password
	public void test1() throws IOException {
		LoginPojo l = new LoginPojo();
	fill(l.getDGusername(), getData(1,0));
	fill(l.getDGpassword(), getData(1,1));
	btnClick(l.getBtnLogin());
	}
}
