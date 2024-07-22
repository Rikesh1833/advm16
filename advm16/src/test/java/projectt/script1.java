package projectt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("./src/test/resources/vtiger.properties");
Properties s=new Properties();
s.load(f);
String k = s.getProperty("url");
String i = s.getProperty("username");
String m = s.getProperty("password");
	WebDriver n=new ChromeDriver();
	n.get(k);
	n.findElement(By.name("user_name")).sendKeys(i);
	n.findElement(By.name("user_password")).sendKeys(m);
	n.findElement(By.id("submitButton")).click();
	Thread.sleep(4000);
	n.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	n.findElement(By.linkText("Sign Out")).click();
	n.close();
	}

}
