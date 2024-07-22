package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import advm16.detials;
import advm16.webdriverutil;
import pomrepoo.loginpage;

public class pomcodeuse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver n=new ChromeDriver();
detials d=new detials();
webdriverutil f=new webdriverutil();
f.maximizeTheWindow(n);
n.get(d.getDataFromPropertyFile("url"));
loginpage s=new loginpage(n);
s.getUsertextbox().sendKeys(d.getDataFromPropertyFile("username"));
s.getPasswordtext().sendKeys(d.getDataFromPropertyFile("password"));
s.getLoginbutton().click();
n.quit();
	}

}
