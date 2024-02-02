package org.myframeworkproject;
//EX:11 Open the SharafDG[Login] application ,  Define the method credentials()
//which is defined as a Dataprovider using the annotation.This method
//returns array of object array.Add a method test() to your DataProviderTest
//class. This method takes two strings as input parameters. Add the annotation
//@Test(dataProvider = “Authentication”) to this method. The attribute dataProvider is
//mapped to “Authentication”.
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.utilities.BaseClass;

public class OwnProjectTesrNGtask11A extends BaseClass{
	@DataProvider(name="Login")
	public Object[][] loginData() throws IOException{
		return new Object[][] {
			{getData(1,0),getData(1,1)},
			
		};
	}
}
