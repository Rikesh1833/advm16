package code;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import advm16.detials;
import advm16.randomnu;
import advm16.webdriverutil;

public class script2 {

	public static void main(String[] args) throws IOException, InterruptedException {
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
driver.findElement(By.linkText("Organizations")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
Thread.sleep(3000);
randomnu ja=new randomnu();
int hg = ja.getRandonNumber();
driver.findElement(By.name("accountname")).sendKeys(f.getDataFromExcelFile("Sheet1", 0, 0)+hg);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.linkText("Sign Out")).click();
	driver.quit();}
}
