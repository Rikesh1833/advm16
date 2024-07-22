package projectt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class script4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./src/test/resources/vtiger.properties");
		Properties l=new Properties();
		l.load(f);
		String k = l.getProperty("url");
		String i = l.getProperty("username");
		String m = l.getProperty("password");
		WebDriver n=new ChromeDriver();
		n.get(k);
		Thread.sleep(3000);
		n.findElement(By.name("user_name")).sendKeys(i);
		n.findElement(By.name("user_password")).sendKeys(m);
		n.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		n.findElement(By.linkText("Contacts")).click();
		Thread.sleep(3000);
		n.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		FileInputStream fil=new  FileInputStream("./src/test/resources/vtig.xlsx");
		Workbook wb=WorkbookFactory.create(fil);
		String b = wb.getSheet("Sheet2").getRow(0).getCell(0).toString();
		n.findElement(By.name("lastname")).sendKeys(b);
		n.findElement(By.xpath("//img[@src=\"themes/softed/images/select.gif\"]")).click();
		String v = n.getWindowHandle();
		Set<String> z = n.getWindowHandles();
	z.remove(v);
	for(String a:z) {
		n.switchTo().window(a);
		Thread.sleep(3000);
		n.findElement(By.id("search_text")).sendKeys("lakme");
		WebElement q = n.findElement(By.name("search_field"));
		Select s=new Select(q);
		s.selectByVisibleText("Organization Name");
		n.findElement(By.linkText("lakme")).click();
		
	}
	Thread.sleep(3000);
	n.switchTo().window(v);
	n.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(3000);
	n.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	n.findElement(By.linkText("Sign Out")).click();
	n.close();	
	}

}
