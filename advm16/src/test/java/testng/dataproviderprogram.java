package testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderprogram {
@DataProvider
public String[][] testdata(){
	String[][] data =new String[2][2];
	data[0][0]="piyush";
data[0][1]="A+";
data[1][0]="suyash";
data[1][1]="b+";
return data;
}
@Test(dataProvider = "testdata")
public void detials(String name, String bloodgroup)
{
	Reporter.log(name, true);
	Reporter.log(bloodgroup, true);
}
}
