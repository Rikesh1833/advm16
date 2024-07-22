package projectt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sss {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


		
				// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./src/test/resources/vtiger.properties");
		Properties l=new Properties();
		l.load(f);
		String k = l.getProperty("url");
		String i = l.getProperty("username");
		String m = l.getProperty("password");
		WebDriver n=new ChromeDriver();
		n.get(k);
		n.findElement(By.name("user_name")).sendKeys(i);
		n.findElement(By.name("user_password")).sendKeys(m);
		n.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		n.findElement(By.linkText("Organizations")).click();
		Thread.sleep(3000);
		n.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Random j=new Random();
		int y = j.nextInt(100);
		FileInputStream fil=new  FileInputStream("./src/test/resources/vrig.xlsx");
		Workbook wb=WorkbookFactory.create(fil);
		String b = wb.getSheet("Sheet1").getRow(0).getCell(0).toString()+y;
		n.findElement(By.name("accountname")).sendKeys(b);
		n.findElement(By.id("phone")).sendKeys("9543267755");
		WebElement a = n.findElement(By.name("industry"));
		Select s=new Select(a);
		s.selectByValue("Healthcare");
		n.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		n.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		n.findElement(By.linkText("Sign Out")).click();
		n.close();	
			}

}
