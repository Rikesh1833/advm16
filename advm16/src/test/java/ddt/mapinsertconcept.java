package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class mapinsertconcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream n=new FileInputStream("./src/test/resources/rikessss.xlsx");
Workbook f=WorkbookFactory.create(n);
Sheet g = f.getSheet("Sheet1");
LinkedHashMap<String, String> r=new LinkedHashMap<String, String>();
r.put("rikesh", "srivastava");
r.put("piyush", "verma");
r.put("raj","verma");
int row=0;
for(Entry<String, String>m:r.entrySet())
{
	Row l = g.createRow(row++);
	l.createCell(0).setCellValue((String)m.getKey());
	l.createCell(1).setCellValue((String)m.getValue());
	
}
	FileOutputStream t=new FileOutputStream("./src/test/resources/rikessss.xslx");
	f.write(t);
	System.out.println("data is added");
	f.close();
}
	}


