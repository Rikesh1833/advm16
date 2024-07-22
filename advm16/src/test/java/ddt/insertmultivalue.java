package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insertmultivalue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("./src/test/resources/rikeshhh.xlsx");
Workbook n=WorkbookFactory.create(f);
WebDriver l=new ChromeDriver();
l.get("https://demowebshop.tricentis.com/");
List<WebElement> k = l.findElements(By.xpath("//a"));
for(int i=0;i<k.size();i++)
{
	n.getSheet("Sheet4").createRow(i).createCell(0);
}
	}

}
