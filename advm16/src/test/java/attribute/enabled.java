package attribute;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import advm16.detials;
import advm16.webdriverutil;
import pomrepoo.loginpage;

public class enabled {
@Test(enabled = false)
public void enabled() throws IOException {
	WebDriver n=new ChromeDriver();
	detials d=new detials();
	webdriverutil w=new webdriverutil();
	w.maximizeTheWindow(n);
	n.get(d.getDataFromPropertyFile("url"));
	loginpage l=new loginpage(n);
	l.getUsertextbox().sendKeys(d.getDataFromPropertyFile("username"));
	l.getPasswordtext().sendKeys(d.getDataFromPropertyFile("password"));
	l.getLoginbutton().click();
}
}
