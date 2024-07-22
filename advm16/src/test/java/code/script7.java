package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import advm16.detials;
import advm16.randomnu;
import advm16.webdriverutil;
import pomrepoo.contacts;
import pomrepoo.homepage;
import pomrepoo.loginpage;
import pomrepoo.organisationpage;

public class script7 {

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
h.getContacts().click();
contacts c=new contacts(n);
c.getCreatecontacts().click();
c.getLastnametext().sendKeys(f.getDataFromExcelFile("Sheet2", 1, 0));
organisationpage o=new organisationpage(n);
o.getSave().click();
Thread.sleep(3000);
h.getAccountlogout().click();
h.getSignout().click();
n.quit();

	}

}
