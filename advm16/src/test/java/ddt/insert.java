package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class insert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("./src/test/resources/rikeshhh.xlsx");
Workbook w=WorkbookFactory.create(f);
w.getSheet("Sheet2").createRow(0).createCell(0).setCellValue("rikesh");
FileOutputStream n=new FileOutputStream("./src/test/resources/rikeshhh.xlsx");
w.write(n);
System.out.println("inserting is done");
	}

}
