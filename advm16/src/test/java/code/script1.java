package code;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import advm16.detials;
import advm16.webdriverutil;

public class script1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
webdriverutil n=new webdriverutil();
n.maximizeTheWindow(driver);
n.implicitlyWait(driver);
detials f=new detials();
driver.get(f.getDataFromPropertyFile("url"));
driver.findElement(By.name("user_name")).sendKeys(f.getDataFromPropertyFile("username"));
driver.findElement(By.name("user_password")).sendKeys(f.getDataFromPropertyFile("password"));
driver.findElement(By.id("submitButton")).click();

	}

}
