package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import advm16.detials;
import advm16.randomnu;
import advm16.webdriverutil;
import pomrepoo.homepage;
import pomrepoo.loginpage;
import pomrepoo.organisationpage;

public class script5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver n=new ChromeDriver();
detials f=new detials();
webdriverutil k=new webdriverutil();
k.maximizeTheWindow(n);
n.get(f.getDataFromPropertyFile("url"));
loginpage l=new loginpage(n);
l.getUsertextbox().sendKeys(f.getDataFromPropertyFile("username"));
l.getPasswordtext().sendKeys(f.getDataFromPropertyFile("password"));
l.getLoginbutton().click();
homepage h=new homepage(n);
h.getOrganizations().click();
organisationpage o=new organisationpage(n);
randomnu r=new randomnu();
int s = r.getRandonNumber();
o.getCreateorg().click();
o.getAccountname().sendKeys(f.getDataFromExcelFile("Sheet1", 0, 0)+s);
o.getSave().click();
Thread.sleep(3000);
h.getAccountlogout().click();
h.getSignout().click();
n.quit();

	}

}
