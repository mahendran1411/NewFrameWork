package org.testing;
//EX:3 http://www.greenstechnologys.com/
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class BrowserLaunch extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException{

	launchEdge();
	loadUrl("http://www.greenstechnologys.com/");
	winMax();
	printTitle();
	printCurrentUrl();
	Thread.sleep(3000);
	
	LoginPojo l = new LoginPojo();
	btnClick(l.getBtnClose());

    scrollToValueAtBottom(l.getTextReserved());
    scrollToValueAtBottom(l.getTextNo1());
    Thread.sleep(2000);
    btnClick(l.getCertifications());
    taketest(l.getTestimonialsContent(), 0);
    btnClick(l.getSeleniumCourse());
    taketest(l.getSeleniumHeading(), 0);
    Thread.sleep(2000);
	
    commandmove(l.getCourses());
    commandmove(l.getJavaTraining());
    commandmove2(l.getCoreJava());
	moveToElementAndPrint(l.getAnithaReview());
    
   btnClick(l.getCareers());
   scrollToValueAtBottom(l.getGoToFooter());
   
   
  /* List contactList =driver.findElements(By.xpath("//h6[text()='Greens Technology ']"));
   
   for (int i=1;i<=contactList.size();i++)
   {
	   WebElement mailId = driver.findElement(By.xpath("//a[contains(text(),'greenstechnologys.com')]"));
	   System.out.println(driver.findElement(By.xpath("(//h6[text()='Greens Technology '])["+i+"]")).getText() +"Mail Id : "+mailId.getText());
   }*/
   
   for (int i=1;i<=l.getContactList().size();i++)
   {
	   WebElement mailId = l.getEachMailId();
	   System.out.println(driver.findElement(By.xpath("(//h6[text()='Greens Technology '])["+i+"]")).getText() +"  Mail Id : "+mailId.getText());
   }
 
   backNavigate();
   btnClick(l.getTestimonials());
   moveToElementAndPrint(l.getLastTestimonialMsg());
   
   btnClick(l.getContactUs());
   taketest(l.getMainBranches(), 0);
   moveToElementAndPrint(l.getCopyRight());
	
}
}
