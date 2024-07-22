package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class mapconcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream n=new FileInputStream("./src/test/resources/rikeshhh.xlsx");
Workbook f=WorkbookFactory.create(n);
Sheet g = f.getSheet("Sheet5");
int i = g.getLastRowNum();
LinkedHashMap<String, String> r=new LinkedHashMap<String, String>();
for(int k=0;k<=i;k++)
{
String key = g.getRow(k).getCell(0).toString();
String value = g.getRow(k).getCell(1).toString();
r.put(key, value);
}
for(Entry<String, String>m:r.entrySet())
{
	System.out.println(m.getKey()+":"+m.getValue());
}
	
}
	}


