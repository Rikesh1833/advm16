package advm16;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class detials {
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/vtiger.properties");
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getDataFromExcelFile(String sheetname,int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/vtig.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}
	
	public String getDataFromExcelDF(String sheetname,int rowNum, int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/vtig.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Cell cell = sheet.getRow(rowNum).getCell(colNum);
		DataFormatter data= new DataFormatter();
		return data.formatCellValue(cell);
	}
	public static String getcurrentdatetime() {
		LocalDateTime date= LocalDateTime.now();
		String data = date.toString().replace(":", "-");
		return data;
	}
}

