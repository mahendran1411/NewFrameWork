package org.myframeworkproject;
//EX:12 Write seperate test case for each textbox and you have to re execute
//the failed test case and generate the report for that.
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedOwnProjectTestNGTask12 implements IRetryAnalyzer {
    int min=0; int max=3;
	public boolean retry(ITestResult result) {
		if (min<max) {
			min++;
			return true;
		}
		return false;
	}
	

}
