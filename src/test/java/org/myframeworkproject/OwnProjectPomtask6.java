package org.myframeworkproject;
//EX:6 Warranty the form by using POM and data driven framework.
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask6 extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/warranty/");
	winMax();
	Thread.sleep(2000);
	LoginPojo l = new LoginPojo();
	WebElement dgWarranty = l.getDGWarranty();
	fill(dgWarranty, getData(1,0));
}
}
