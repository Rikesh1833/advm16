package testngg;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


import advm16.BaseClass;
import pomrepoo.homepage;
import pomrepoo.organisationpage;

public class Script_Test extends BaseClass {
@Test(groups = "organisation")
public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
homepage h=new homepage(driver);
h.getOrganizations().click();

assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "not dissplayed");
organisationpage o=new organisationpage(driver);
o.getCreateorg().click();
assertEquals(o.getCreateeeorg().isDisplayed(),true, "not created org page");
int ro = r.getRandonNumber();
String f = d.getDataFromExcelFile("Sheet1", 0, 0)+ro;
o.getAccountname().sendKeys(d.getDataFromExcelFile("Sheet1", 0, 0)+ro);
assertEquals(o.getAccountname().getAttribute("value"), f, "data is not matching");
o.getSave().click();
assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "not dissplayed");
Thread.sleep(3000);

}
}