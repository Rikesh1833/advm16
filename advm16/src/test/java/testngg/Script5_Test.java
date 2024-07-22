package testngg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import advm16.BaseClass;
import pomrepoo.homepage;
import pomrepoo.organisationpage;
import pomrepoo.productpage;

public class Script5_Test extends BaseClass {
@Test(groups = "product")
public void scrippt5() throws EncryptedDocumentException, IOException, InterruptedException {
	homepage h=new homepage(driver);
	h.getProducts().click();
	productpage p=new productpage(driver);
	p.getCreateproduct().click();
int k = r.getRandonNumber();
	p.getProductname().sendKeys(d.getDataFromExcelDF("Sheet2", 4, 0)+k);
	organisationpage o=new organisationpage(driver);
	o.getSave().click();
	Thread.sleep(3000);
}
}
