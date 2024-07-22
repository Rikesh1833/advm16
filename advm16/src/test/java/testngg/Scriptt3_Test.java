package testngg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import advm16.BaseClass;
import pomrepoo.homepage;
import pomrepoo.organisationpage;

public class Scriptt3_Test extends BaseClass {
@Test(groups = "organisation")
public void scrippt3() throws EncryptedDocumentException, IOException, InterruptedException {
homepage h=new homepage(driver);
h.getOrganizations().click();
organisationpage o=new organisationpage(driver);
o.getCreateorg().click();
int ro = r.getRandonNumber();
o.getAccountname().sendKeys(d.getDataFromExcelFile("Sheet1", 0, 0)+ro);
w.selectDropdownByValue(o.getIndustry(),"Machinery");
Thread.sleep(3000);
o.getPhone().sendKeys(d.getDataFromExcelFile("Sheet1",0, 1));
o.getSave().click();
Thread.sleep(3000);
}
}