package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multidata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("./src/test/resources/rikeshhh.xlsx");
Workbook n=WorkbookFactory.create(f);
 int l=n.getSheet("Sheet3").getPhysicalNumberOfRows();

int k = n.getSheet("sheet3").getRow(0).getPhysicalNumberOfCells();
for(int i=0;i<l;i++) {
	for(int s=0;s<k;s++) {
		DataFormatter h=new DataFormatter();
		System.out.println(h.formatCellValue(n.getSheet("Sheet3").getRow(i).getCell(s)));
	}
}
	}
}