package org.myframeworkproject;
//EX:4 Enter the Samsung and Search by using POM framework.
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask4 extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement dgSearchcompany = l.getDGSearchcompany();
	fill(dgSearchcompany, getData(2,1));
	Thread.sleep(3000);
	WebElement dgSubmitcompany = l.getDGSubmitcompany();
	btnClick(dgSubmitcompany);
}
}
