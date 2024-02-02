package org.utilities;
//BASSCLASS METHODS FOR SELENIUM AND FRAMEWORK
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
//1
public static void launchEdge() {
	WebDriverManager.edgedriver().setup();
    driver= new EdgeDriver();
}
//2
public static void winMax() {
	driver.manage().window().maximize();
}
//3
public static void loadUrl(String siteName) {
	driver.get(siteName);
}
//4
public static void printTitle() {
	System.out.println(driver.getTitle());
}
//5
public static void printCurrentUrl() {
	System.out.println(driver.getCurrentUrl());
}
//6
public static void closeEdge() {
	driver.close();
}
//7
public static void fill(WebElement ele, String Value) {
ele.sendKeys(Value);
}
//8
public static void btnClick(WebElement ele) {
	ele.click();
}
//9
public static void quitWeb() {
	driver.quit();

}
//10
public static void taketest(WebElement ele, int value) {
	
	System.out.println(ele.getText());
}
//11
public static void printtest(WebElement ele, String value) {
	
	System.out.println(ele.getAttribute(value));
}
//12
public static void commandmove(WebElement target) {
	Actions a= new Actions(driver);
	a.moveToElement(target).perform();
}
//13
public static void commandmove1(WebElement target) {
	Actions a= new Actions(driver);
	a.moveToElement(target).click().perform();
}
//14
public static void commandmove2(WebElement target) {
	Actions a= new Actions(driver);
	a.moveToElement(target).click().build().perform();
}
//15
public static void commandDragandDrop(WebElement src,WebElement des) {
	Actions a= new Actions(driver);
	a.dragAndDrop(src, des).perform();
}
//16
public static void Actionsendkeys(WebElement e1, String value) {
	Actions a= new Actions(driver);
	a.sendKeys(e1,value).perform();
}
//17
public static void Actionclick() {
	Actions a= new Actions(driver);
	a.click().perform();
}
//18
public static void Actionclick1(WebElement ele) {
	Actions a= new Actions(driver);
	a.click(ele);
}
//19
public static void clickdoubleclick(WebElement e1) {
	Actions a= new Actions(driver);
	a.doubleClick(e1).perform();
}
//20
public static void clickcontextclick(WebElement e1) {
	Actions a= new Actions(driver);
	a.contextClick(e1).perform();
}
//21
public static void alldeselect(WebElement ele) {
	Select s= new Select(ele);
	s.deselectAll();
}
//22
public static void isDisplayedWebElement(WebElement ele) {
	System.out.println(ele.isDisplayed());
}
//23
public static void isSelectedWebElement(WebElement ele) {
	System.out.println(ele.isSelected());
}
//24
public static void isEnabledWebElement(WebElement ele) {
    System.out.println(ele.isEnabled());
}
//25
public static void sendkeysWebElement(WebElement ele, String value) {
	ele.sendKeys("value");
}
//26
public static void submit(WebElement ele) {
	ele.submit();
}
//27
public static void refreshNavigate() {
	driver.navigate().refresh();
}
//28
public static void forwordNavigate() {
	driver.navigate().forward();
}
//29
public static void backNavigate() {
	driver.navigate().back();
}
//30
public static void launchChrome() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
}
//31
public static void launchFirefox() {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
}
//32
static JavascriptExecutor jse = (JavascriptExecutor) driver;
public static void fillWithJS(WebElement ele,String value){
	jse.executeScript("arguments[0].setAttribute('value','Mahendren')",ele);
}
//33
public static void returnWithJS(WebElement ele,String value){
	jse.executeScript("return arguments[0].getAttribute('value')",ele);
}
//34
public static void clickWithJS(WebElement ele){
	jse.executeScript("arguments[0].click()",ele);
}
////35 [already]
//public static void printText(WebElement ele){
//	String text=ele.getText();
//	System.out.println("Text Value : "+text);
//}
////36 [already]
//public static void printAttValue(WebElement ele){
//	String attValue=ele.getAttribute("value");
//	System.out.println("Attribute Value : "+attValue);
//}
//37
public static void sendCapsValue(WebElement ele, String value){
	Actions a = new Actions(driver);
	a.keyDown(ele,Keys.SHIFT).sendKeys(value).keyUp(Keys.SHIFT).build().perform();
}		
//38
public static void doubleAndRightClick(WebElement ele){
	Actions a = new Actions(driver);
	a.doubleClick(ele).contextClick(ele).build().perform();
}
//39
public static void rightClickAndPerform(WebElement ele, int position){
	Actions a = new Actions(driver);
	a.doubleClick(ele).contextClick(ele).build().perform();
 try
 {
	 Robot r = new Robot();
	 for(int i=1;i<=position;i++)
	 {
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
	 }
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
 }
 catch(AWTException e)
 {
	 e.printStackTrace();
 }
}	
//40

public static void copyValue(WebElement ele){
	Actions a = new Actions(driver);
	a.doubleClick(ele).perform();
 try
 {
	 Robot r = new Robot();

		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_C);
}

 catch(AWTException e)
 {
	 e.printStackTrace();
 }
}	
//41
public static void pasteValue(WebElement ele){
	Actions a = new Actions(driver);
	a.doubleClick(ele).perform();
 try
 {
	 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
}

 catch(AWTException e)
 {
	 e.printStackTrace();
 }
}				
//42
public static void scrollToValueAtTop(WebElement ele){
	jse.executeScript("arguments[0].scrollIntoView(false)", ele);
	}	
//43
public static void scrollToValueAtBottom(WebElement ele){
	jse.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
//44
public static void saveScreenShot(String desPath) throws IOException{
	TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dest = new File(desPath);
	FileUtils.copyFile(src, dest);		
	}
//45
public static void acceptAlert(){
	Alert a =driver.switchTo().alert();
	a.accept();
}
//46
public static void dismissAlert(){
	Alert a =driver.switchTo().alert();
	a.dismiss();		
}
//47
public static void sendValuesToAlert(String value){
	Alert a =driver.switchTo().alert();
	a.sendKeys(value);
	a.accept();
}	
//48
public static void getAlertText(String value){
	Alert a =driver.switchTo().alert();
	String text = a.getText();
	System.out.println("Alert Text : "+text);
}
//49
public static void dropdownSelectByValue(WebElement ele, String value){
	Select s = new Select(ele);
	s.selectByValue(value);
}
//50
public static void dropdownSelectByIndex(WebElement ele, int index){
	Select s = new Select(ele);
	s.selectByIndex(index);
}
//51
public static void dropdownSelectByVisibleText(WebElement ele, String text){
	Select s = new Select(ele);
	s.selectByVisibleText(text);
}
//52
public static void dropdownDeSelectByValue(WebElement ele, String value){
	Select s = new Select(ele);
	s.deselectByValue(value);
}
//53
public static void dropdownDeSelectByIndex(WebElement ele, int index){
	Select s = new Select(ele);
	s.deselectByIndex(index);
}
//54
public static void dropdownDeSelectByVisibleText(WebElement ele, String text){
	Select s = new Select(ele);
	s.deselectByVisibleText(text);
}
//55
public static void checkMultiSelectDropdown(WebElement ele){
	Select s = new Select(ele);
	boolean isMulti = s.isMultiple();
	System.out.println("Multi Select Drop : "+isMulti);
}
//56
public static void getDropdownOptions(WebElement ele){
	Select s = new Select(ele);
	System.out.println("Dropdown Options");
	List<WebElement> li = s.getOptions();
	for(WebElement e : li) {
	String text = e.getText();	
	System.out.println(text);
	}
}
//57
public static void getDropdownSelectedOptions(WebElement ele){
	Select s = new Select(ele);
	System.out.println("All Selected Options");
	List<WebElement> li = s.getAllSelectedOptions();
	for(WebElement e : li) {
	String text = e.getText();	
	System.out.println(text);
	}
}		
//58
public static void firstSelectedDropdownOption(WebElement ele){
	Select s = new Select(ele);
	System.out.println("First Selected Option");
	WebElement first = s.getFirstSelectedOption();
	String text = first.getText();	
	System.out.println(text);
}
//59
public static void gotoFrameByNameOrId(String nameOrId){			
	driver.switchTo().frame(nameOrId);
}
//60
public static void gotoFrameByIndex(int index){			
	driver.switchTo().frame(index);
}
//61
public static void gotoFrameByElement(WebElement ele){			
	driver.switchTo().frame(ele);
}
//62
public static void gotoParentFrame(){			
	driver.switchTo().parentFrame();
}
//63
public static void gotoMainHtml(){			
	driver.switchTo().defaultContent();
}
//64
//arugument passed can be url or title or windowsId
			public static void gotoWindow(String value){			
				driver.switchTo().window(value);
			}		
//65
			public static String getParentId(){			
				return driver.getWindowHandle();
			}
//66
			public static Set<String> getAllWindowIds(){			
				return driver.getWindowHandles();
			}
//67
			public static void gotoChildWindow(){			
				String parentId = driver.getWindowHandle();
				Set<String> allIds = driver.getWindowHandles();
				//switch to child window
				for(String eachId : allIds)
				{
					if(!parentId.equals(eachId))
						driver.switchTo().window(eachId);
				}
			}
//68
			public static void gotoParticularWindow(int index){			
				Set<String> allIds = driver.getWindowHandles();
				//switch to particular window
				int count = 1;
				for(String eachId : allIds)
				{
					if(count == index)
						driver.switchTo().window(eachId);
				}
			}
//69
			public static void gotoWindowUsingList(int index){			
				Set<String> allIds = driver.getWindowHandles();
				List<String> li = new ArrayList<String>();
				li.addAll(allIds);
				//switch to particular window
				driver.switchTo().window(li.get(index));
			}
//70
			//get number of rows in a table
			public static int getTableRowsCount(WebElement table){		
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				return rows.size();
			}
//71
			//print all rows in a table
			public static void printTableRows(WebElement table){		
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for(int i=0; i<rows.size();i++)
			{
				WebElement data = rows.get(i);
				System.out.println(data.getText());
			}
			}
//72
			//print all rows in a table
			public static void printAllTableDate(WebElement table){		
				List<WebElement> content = table.findElements(By.tagName("td"));
				
				for(WebElement text : content)
				{
					System.out.println(text.getText());
				}
			}
//73
			//get number of rows in a table
			public static int getTableCloumnsCount(WebElement table){		
				List<WebElement> headings = table.findElements(By.tagName("th"));
				return headings.size();
			}
//74
			//print all headings in a table
			public static void printTableHeadings(WebElement table){		
				List<WebElement> headings = table.findElements(By.tagName("th"));
				for(int i=0; i< headings.size();i++)
				{
					WebElement data = headings.get(i);
					System.out.println(data.getText());
	            }

			}
//75
			//print particular row data in a table
			public static void printOneTableRow(WebElement table, int rowNo){		
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for(int i=1; i<=rows.size();i++)
			{
				if(i==rowNo) {
				WebElement data = rows.get(i);
				System.out.println(data.getText());
				}
			}
			}

//76
			public static void makeWinFullScreen(){		
				driver.manage().window().fullscreen();
			}
//77
			public static void clickandHoldElement(WebElement ele){		
				Actions a = new Actions(driver);
				a.clickAndHold(ele);
			}
//78
			public static void navigateToAPage(String url){
				driver.navigate().to(url);
			}
//79
			public static void navigateToAPageandBack(String url){
				driver.navigate().to(url);
				driver.navigate().back();
			}
//80
			public static void navigateToAPageBackFwd(String url){
				driver.navigate().to(url);
				driver.navigate().back();
				driver.navigate().forward();
			}
//81
			//wait for all locators of a page to load
			public static void waitToLoadAllLocators(int sec){
				driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
			}
//82
			//wait for particular locators to load, time in seconds, interval 500 ms deafult
			//switch to frame when the title contains the value mentioned
			public static void waitUntilTitleContains(int sec, String title, String frameId){
				WebDriverWait w = new WebDriverWait(driver, sec);
				w.until(ExpectedConditions.titleContains(title));
				driver.switchTo().frame(frameId);
			}			
//83
			//wait for particular locators to load, time in seconds, interval 500 ms deafult
			//switch to frame when the frame is available
			public static void waitUntilFrameIsAvaible(int sec, String title, String frameId){
				WebDriverWait w = new WebDriverWait(driver, sec);
				w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(frameId)));
				driver.switchTo().frame(frameId);
			}
//84
			//wait for particular locators to load, time in seconds, interval 500 ms deafult
			//switch to frame when the frame is available
			public static void waitUntilElementIsClickable(int sec, String elementId){
					WebDriverWait w = new WebDriverWait(driver, sec);
					w.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
					WebElement button = driver.findElement(By.id(elementId));
					button.click();
			}
//85
			//wait for particular locators to load, time in milliseconds or macrosends,interval-user given
			//switch to frame when the title contains the value mentioned
			public static void waitWithIntervalMentioned(int millisec, int interval,String title, String frameId){
				FluentWait<WebDriver> f = new FluentWait<WebDriver> (driver)
						.withTimeout(millisec, TimeUnit.SECONDS).pollingEvery(interval, TimeUnit.MILLISECONDS)
						.ignoring(Throwable.class);
				f.until(ExpectedConditions.titleContains(title));
				driver.switchTo().frame(frameId);		
			}		
//86
public static String getData(int rowNumber, int cellNumber) throws IOException {
	//1.Declare the location
	File f = new File("C:\\Users\\user\\eclipse-workspace\\NewFramework\\target\\TestData\\FRAME WORK TASK EXCEL SHEET NEW.xlsx");
	//2.Read the data from excel sheet
	FileInputStream fin = new FileInputStream(f);
	//3.Type of workbook
	Workbook w = new XSSFWorkbook(fin);
	//4.get the specific sheet
	Sheet s = w.getSheet("Facebook Login");
	Row row = s.getRow(rowNumber);
	Cell cell = row.getCell(cellNumber);
	int cellType = cell.getCellType();
	String value="";
	if (cellType==1) {
		value = cell.getStringCellValue();
	}else if (DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
		value = sim.format(d);
	} else {
         double d = cell.getNumericCellValue();
         // Convert double to long
         long l = (long)d;
         value = String.valueOf(l);
	}
	return value;
	
}
//87
public static void writeData(String filePath, String sheetName,int rowNo, int cellNo, String error) throws IOException{
	File f = new File(filePath);
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet(sheetName);
	Row r  = s.getRow(rowNo);
	Cell c = r.createCell(cellNo);
	c.setCellValue(error);
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
}
//88
public static void setClipboardData(String string) {
	//StringSelection is a class that can be used for copy and paste operations.
	   StringSelection stringSelection = new StringSelection(string);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
//89
public static void uploadFile(String fileLocation) {
    try {
    	//Setting clipboard with file location
        setClipboardData(fileLocation);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    } catch (Exception exp) {
    	exp.printStackTrace();
    }
}
//90
public static void copyAndPasteValue(WebElement copyEle, WebElement pasteEle,WebDriver driver1){
	
	Actions a = new Actions(driver1);
		a.doubleClick(copyEle).perform();
		try
			{
				Robot r = new Robot();

				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_C);
			}

		catch(AWTException e)
		{
				e.printStackTrace();
		}

		a.doubleClick(pasteEle).perform();
		try
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}

		catch(AWTException e)
		{
			e.printStackTrace();
		}
}
//91
public static void moveToElementAndPrint(WebElement ele){
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	String text=ele.getText();
	System.out.println("Text Value : "+text);
	

////92
//buttonClick(a.getBookNowBtn());
//
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//scrollToValueAtBottom(a.getOrderNo());
//String orderNum =a.getOrderNo().getAttribute("value");
//System.out.println("Order No: "+orderNum);
}
}


