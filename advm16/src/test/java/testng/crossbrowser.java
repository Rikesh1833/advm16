package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import advm16.detials;
import advm16.webdriverutil;

public class crossbrowser {
	WebDriver driver;
	webdriverutil w=new webdriverutil();
	detials d=new detials();
@Parameters("browser")
@Test
public void cross(@Optional("edge") String bname) throws IOException {
	if(bname.contains("chrome"))
	{driver=new ChromeDriver();
	w.maximizeTheWindow(driver);
	driver.get(d.getDataFromPropertyFile("url"));
		}
	else if (bname.contains("edge")) {
		driver=new EdgeDriver();
		w.maximizeTheWindow(driver);
		driver.get(d.getDataFromPropertyFile("url"));
		
	}}
}
