package org.myframeworkproject;
//EX:1 NOTE: Enter the username and password by using POM framework
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask1 extends BaseClass {
public static void main(String[] args) throws IOException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/my-account/");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement DGusername = l.getDGusername();
	fill(DGusername, getData(1,0));
	WebElement DGpassword = l.getDGpassword();
	fill(DGpassword, getData(1,1));
	WebElement DGlogin = l.getDGlogin();
	btnClick(DGlogin);
}
}