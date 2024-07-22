package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import advm16.webdriverutil;
import pomrepoo.homepage;
import pomrepoo.loginpage;
import pomrepoo.organisationpage;

public class multipledataprovider {
	@DataProvider
public String[][] testdata() throws IOException{
	FileInputStream f=new FileInputStream("./src/test/resources/vtig.xlsx");
Workbook n	=WorkbookFactory.create(f);
int l=n.getSheet("Sheet3").getPhysicalNumberOfRows();
int k = n.getSheet("sheet3").getRow(0).getPhysicalNumberOfCells();
String[][] data =new String[l][k];
for(int i=0;i<l;i++)
{
	for(int j=0;j<k;j++) {
		data[i][j]=n.getSheet("Sheet3").getRow(i).getCell(j).toString();
	}
}
return data;
}
@Test(dataProvider = "testdata")
public void detials(String[] testdata) throws IOException, InterruptedException {
	WebDriver n=new ChromeDriver();
	webdriverutil w=new webdriverutil();
	advm16.detials d=new advm16.detials();
w.maximizeTheWindow(n);
n.get(d.getDataFromPropertyFile("url"));
loginpage m=new loginpage(n);
m.getUsertextbox().sendKeys(d.getDataFromPropertyFile("username"));
m.getPasswordtext().sendKeys(d.getDataFromPropertyFile("password"));
m.getLoginbutton().click();
homepage h=new homepage(n);
h.getOrganizations().click();
organisationpage o=new organisationpage(n);
o.getCreateorg().click();
Thread.sleep(3000);
o.getAccountname().sendKeys(testdata[0]);
Thread.sleep(3000);
o.getPhone().sendKeys(testdata[1]);
Thread.sleep(3000);
o.getSave().click();


}

}
