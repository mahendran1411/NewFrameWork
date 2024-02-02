package org.myframeworkproject;
//EX:7 Enter the BRANDS and DELL Laptop using mouse move command by using POM framework.
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class OwnProjectPomtask7 extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	launchEdge();
	loadUrl("https://uae.sharafdg.com/");
	winMax();
	LoginPojo l = new LoginPojo();
	WebElement dgSelectBrand = l.getDGSelectBrand();
	commandmove1(dgSelectBrand);
	Thread.sleep(2000);
	WebElement dgSelectProductname = l.getDGSelectProductname();
	commandmove1(dgSelectProductname);
}
}
