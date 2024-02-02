package org.utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
//1. FACE BOOK LOG IN
@FindBy(id="email")
private WebElement txtUser;

@FindBy(id="pass")
private WebElement txtpass;
@FindBy(name="login")
private WebElement btnLogin;
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtpass() {
	return txtpass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}
//2. RED BUS LOG IN
@FindBy(xpath=("//span[text()='Account']"))
private WebElement txtUser0;
@FindBy(xpath=("//span[text()='Login/ Sign Up']"))
private WebElement txtUser1;//btnLogin
@FindBy (xpath=("//iframe[@class='modalIframe']"))
private WebElement Redbusiframe;
@FindBy(xpath="//input[@type='number']")
private WebElement txtpass1;
@FindBy(id="recaptcha-anchor")
private WebElement btnLogin1;
public WebElement getTxtUser0() {
	return txtUser0;
}
public WebElement getTxtUser1() {
	return txtUser1;
}
public WebElement getTxtpass1() {
	return txtpass1;
}
public WebElement getBtnLogin1() {
	return btnLogin1;
}

public WebElement getRedbusiframe() {
	return Redbusiframe;
}
//3. https://demoqa.com/register Login
@FindBy(id="firstname")
private WebElement demfirstname;
@FindBy(id="lastname")
private WebElement demolastname;
@FindBy(id="userName")
private WebElement demousername;
@FindBy(id="password")
private WebElement demopassword;
@FindBy(xpath=("//div[@class='recaptcha-checkbox-border']"))
private WebElement democaptcha;
@FindBy(id="register")
private WebElement demoregister;
public WebElement getDemfirstname() {
	return demfirstname;
}
public WebElement getDemolastname() {
	return demolastname;
}
public WebElement getDemousername() {
	return demousername;
}
public WebElement getDemopassword() {
	return demopassword;
}
public WebElement getDemocaptcha() {
	return democaptcha;
}
public WebElement getDemoregister() {
	return demoregister;
}
//4. Flipkart Login
@FindBy(xpath=("(//input[@type='text'])[2]"))
private WebElement flipkartphno;
@FindBy(xpath=("//button[text()='Request OTP']"))
private WebElement flipkartOTP;
public WebElement getFlipkartphno() {
	return flipkartphno;
}
public WebElement getFlipkartOTP() {
	return flipkartOTP;
}
//5. Adactin Hotel  Login
@FindBy(id="username")
private WebElement Adactinusername;
@FindBy(id="password")
private WebElement Adactinpassword;
@FindBy(id="login")
private WebElement Adactinlogin;
@FindBy(xpath=("//b[text()='Invalid Login details or Your Password might have expired. ']"))
private WebElement Adactininvalidlogin;
public WebElement getAdactinusername() {
	return Adactinusername;
}
public WebElement getAdactinpassword() {
	return Adactinpassword;
}
public WebElement getAdactinlogin() {
	return Adactinlogin;
}
public WebElement getAdactininvalidlogin() {
	return Adactininvalidlogin;
}
// 6.  http://www.greenstechnologys.com/ [POM]
@FindBy(xpath="//p[contains(text(),'All Rights Reserved')]")
private WebElement textReserved;

@FindBy(xpath="//button[@class='close']")
private WebElement btnClose;

@FindBy(xpath="//h1[contains(text(),'No 1 Software')]")
private WebElement textNo1;

@FindBy(xpath="//a[contains(text(),'Certifications')]")
private WebElement certifications;

@FindBy(xpath="//a[text()='COURSES']")
private WebElement courses;

@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")
private WebElement seleniumCourse;

@FindBy(xpath="//h2[contains(text(),'Selenium Training in Chennai')]")
private WebElement seleniumHeading;

@FindBy(xpath="//a[contains(text(),'TESTIMONIALS')]")
private WebElement testimonials;

@FindBy(xpath="//span[@class='testimonial-content']")
private WebElement testimonialsContent;

@FindBy(xpath="//div[contains(text(),'This entire credit goes to Greens Technology team')]")
private WebElement lastTestimonialMsg;

@FindBy(xpath="(//a[text()='Contact Us'])[1]")
private WebElement contactUs;	

@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
private WebElement mainBranches;

@FindBy(xpath="//p[contains(text(),'Copyright ')]")
private WebElement copyRight;

public WebElement getCopyRight() {
	return copyRight;
}

public WebElement getMainBranches() {
	return mainBranches;
}

public WebElement getContactUs() {
	return contactUs;
}

public WebElement getLastTestimonialMsg() {
	return lastTestimonialMsg;
}

@FindBy(xpath="//a[text()='CAREERS']")
private WebElement careers;

@FindBy(xpath="(//div[@class='testimonial-section'])[1]")
private WebElement testimonialOne;


@FindBy(xpath="//a[text()='Java Training ']")
private WebElement javaTraining;

@FindBy(xpath="//a[contains(text(),'Core')]")
private WebElement coreJava;

@FindBy(xpath="//h2[contains(text(),'Anitha')]")
private WebElement anithaReview;


@FindBy(xpath="//footer[@class='footer']")
private WebElement goToFooter;


public WebElement getGoToFooter() {
	return goToFooter;
}

@FindBy(xpath="//h6[text()='Greens Technology ']")
private List<WebElement> contactList;


public List<WebElement> getContactList() {
	return contactList;
	
}
@FindBy(xpath="//a[contains(text(),'greenstechnologys.com')]")
private WebElement eachMailId;	


public WebElement getEachMailId() {
	return eachMailId;
}

public WebElement getTextReserved() {
	return textReserved;
}

public WebElement getTextNo1() {
	return textNo1;
}

public WebElement getCertifications() {
	return certifications;
}

public WebElement getCourses() {
	return courses;
}

public WebElement getSeleniumCourse() {
	return seleniumCourse;
}

public WebElement getSeleniumHeading() {
	return seleniumHeading;
}

public WebElement getTestimonials() {
	return testimonials;
}

public WebElement getCareers() {
	return careers;
}

public WebElement getTestimonialOne() {
	return testimonialOne;
}

public WebElement getJavaTraining() {
	return javaTraining;
}

public WebElement getCoreJava() {
	return coreJava;
}

public WebElement getAnithaReview() {
	return anithaReview;
}



public WebElement getBtnClose() {
	return btnClose;
}


public WebElement getTestimonialsContent() {
	return testimonialsContent;
}
// 7.SharafDG LogIn
@FindBy(name="username")
private WebElement DGusername;
@FindBy(name="password")
private WebElement DGpassword;
@FindBy(name="login")
private WebElement DGlogin;
public WebElement getDGusername() {
	return DGusername;
}
public WebElement getDGpassword() {
	return DGpassword;
}
public WebElement getDGlogin() {
	return DGlogin;
}
// 8.SharafDG Register
@FindBy(name="email")
private WebElement DGEmail;
@FindBy(name="password")
private WebElement DGREpass;
@FindBy(name="first_name")
private WebElement DGFirstName;
@FindBy(name="last_name")
private WebElement DGLastname;
@FindBy(name="account_mobile_no")
private WebElement DGMobile;
public WebElement getDGEmail() {
	return DGEmail;
}
public WebElement getDGREpass() {
	return DGREpass;
}
public WebElement getDGFirstName() {
	return DGFirstName;
}
public WebElement getDGLastname() {
	return DGLastname;
}
public WebElement getDGMobile() {
	return DGMobile;
}
// 9.SharafDG Search Box Product Name
@FindBy(id="autocomplete-0-input")
private WebElement DGSearchproduct;
@FindBy(xpath=("//button[@title='Submit']"))
private WebElement DGSubmitproduct;
public WebElement getDGSearchproduct() {
	return DGSearchproduct;
}
public WebElement getDGSubmitproduct() {
	return DGSubmitproduct;
}
// 10.SharafDG Search Box Company Name
@FindBy(id="autocomplete-0-input")
private WebElement DGSearchcompany;
@FindBy(xpath=("//button[@type='submit']"))
private WebElement DGSubmitcompany;
public WebElement getDGSearchcompany() {
	return DGSearchcompany;
}
public WebElement getDGSubmitcompany() {
	return DGSubmitcompany;
}
// 11.SharafDG Search Box Product Name Print
@FindBy(id="autocomplete-0-input")
private WebElement DGSearchprint;
@FindBy(xpath=("//button[@class='aa-SubmitButton']"))
private WebElement DGSubmitprint;
@FindBy(xpath=("(//h4[@class='name'])[1]"))
private WebElement DGprint;
public WebElement getDGSearchprint() {
	return DGSearchprint;
}
public WebElement getDGSubmitprint() {
	return DGSubmitprint;
}
public WebElement getDGprint() {
	return DGprint;
}
// 12.SharafDG warranty Login
@FindBy(xpath=("//input[@placeholder='Enter Phone Number']"))
private WebElement DGWarranty;
@FindBy(xpath=("(//button[@type='button'])[4]"))
private WebElement DGOtp;
public WebElement getDGWarranty() {
	return DGWarranty;
}
public WebElement getDGOtp() {
	return DGOtp;
}
// 13.SharafDG Selected Brands Product
@FindBy(xpath=("//a[text()='BRANDS']"))
private WebElement DGSelectBrand;
@FindBy(xpath=("//img[@alt='Dell']"))
private WebElement DGSelectProductname;
public WebElement getDGSelectBrand() {
	return DGSelectBrand;
}
public WebElement getDGSelectProductname() {
	return DGSelectProductname;
}
// 14.https://mail.google.com/
@FindBy(name="identifier")
private WebElement EmailId;
@FindBy(xpath=("//span[text()='Next']"))
private WebElement Emailidnext;
@FindBy(name="password")
private WebElement Emailpass;
@FindBy(xpath=("//span[text()='Next']"))
private WebElement Emailpassnext;
public WebElement getEmailId() {
	return EmailId;
}
public WebElement getEmailidnext() {
	return Emailidnext;
}
public WebElement getEmailpass() {
	return Emailpass;
}
public WebElement getEmailpassnext() {
	return Emailpassnext;
}

}
