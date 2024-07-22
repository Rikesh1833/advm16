package attribute;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import advm16.detials;
import advm16.webdriverutil;
import pomrepoo.loginpage;

public class threadpoolsize {
@Test(invocationCount = 3, threadPoolSize = 2)
public void script1() throws IOException, InterruptedException {
	WebDriver n=new ChromeDriver();
	detials d=new detials();
	webdriverutil wb=new webdriverutil();
	n.get(d.getDataFromPropertyFile("url"));
	wb.maximizeTheWindow(n);
	loginpage l=new loginpage(n);
	l.getUsertextbox().sendKeys(d.getDataFromPropertyFile("username"));
	l.getPasswordtext().sendKeys(d.getDataFromPropertyFile("password"));
l.getLoginbutton().click();
Thread.sleep(3000);
n.quit();
}
}
