package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propppp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream n=new FileInputStream("./src/test/resources/prop.properties");
Properties p=new Properties();
p.load(n);
System.out.println(p.getProperty("url"));
System.out.println(p.getProperty("username"));
System.out.println(p.getProperty("password"));
String f = p.getProperty("url");
WebDriver g=new ChromeDriver();
g.get(f);
	}

}
