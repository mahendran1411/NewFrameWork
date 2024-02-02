package org.myframeworkproject;
//EX:5 Enter the Televisions and Search and print name by using POM framework.
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask5 extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement dgSearchprint = l.getDGSearchprint();
	fill(dgSearchprint, getData(4,0));
	Thread.sleep(3000);
	WebElement dgSubmitprint = l.getDGSubmitprint();
	btnClick(dgSubmitprint);
	Thread.sleep(2000);
	WebElement dGprint = l.getDGprint();
	printtest(dGprint, getData(4,0));
}
}
