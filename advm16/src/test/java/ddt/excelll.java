package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("./src/test/resources/rikeshhh.xlsx");
//XSSFWorkbook n=new XSSFWorkbook(f);
Workbook n=WorkbookFactory.create(f);
System.out.println(n.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
System.out.println(n.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
System.out.println(n.getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue());
System.out.println("############################################################");
Cell c1 = n.getSheet("Sheet1").getRow(0).getCell(0);
Cell c2 = n.getSheet("Sheet1").getRow(1).getCell(0);
Cell c3 = n.getSheet("Sheet1").getRow(2).getCell(1);
Cell c4 = n.getSheet("Sheet1").getRow(3).getCell(2);
DataFormatter l=new DataFormatter();
System.out.println(l.formatCellValue(c3));
System.out.println(l.formatCellValue(c2));
System.out.println(l.formatCellValue(c1));
String h = l.formatCellValue(c4);
WebDriver s=new ChromeDriver();
s.get(h);

	}

}
