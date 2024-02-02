package org.myframeworkproject;
//EX:2 Give the details to register the SharafDG form by using POM framework.
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask2 extends BaseClass {
public static void main(String[] args) throws IOException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/my-account/?action=register");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement DgEmail = l.getDGEmail();
	fill(DgEmail, getData(1,0));
	WebElement DgrEpass = l.getDGREpass();
	fill(DgrEpass, getData(1,1));
	WebElement dgFirstName = l.getDGFirstName();
	fill(dgFirstName, getData(1,2));
	WebElement dgLastname = l.getDGLastname();
	fill(dgLastname, getData(1,3));
	WebElement dgMobile = l.getDGMobile();
	fill(dgMobile, getData(1,4));
	
}
}
