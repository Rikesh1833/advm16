package testngg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import advm16.BaseClass;
import pomrepoo.contacts;
import pomrepoo.homepage;
import pomrepoo.organisationpage;

public class Script4_Test extends BaseClass {
@Test(groups = "contacts")
public void scrippt4() throws EncryptedDocumentException, IOException, InterruptedException {
homepage h=new homepage(driver);
h.getContacts().click();
contacts c=new contacts(driver);
c.getCreatecontacts().click();
c.getLastnametext().sendKeys(d.getDataFromExcelDF("Sheet2", 2, 0));
organisationpage o=new organisationpage(driver);
o.getSave().click();
Thread.sleep(3000);
}
}