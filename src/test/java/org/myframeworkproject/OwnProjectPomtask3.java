package org.myframeworkproject;
//EX:3 Enter the Refrigerators and Search by using POM framework.
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask3 extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement dgSearch = l.getDGSearchproduct();
	fill(dgSearch, getData(1,0));
	Thread.sleep(2000);
	WebElement dgSubmitproduct = l.getDGSubmitproduct();
	btnClick(dgSubmitproduct);
}
}
