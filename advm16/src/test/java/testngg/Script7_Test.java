package testngg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import advm16.BaseClass;
import pomrepoo.campaignpage;
import pomrepoo.organisationpage;

public class Script7_Test extends BaseClass {
@Test(groups = "campaigin")
public void scrippt7() throws InterruptedException, EncryptedDocumentException, IOException {
	campaignpage c=new campaignpage(driver);
	c.getMoreOption().click();;
	c.getCampaignsLink().click();;
	Thread.sleep(3000);
c.getCreateCampaings().click();
c.getCampaingsName().sendKeys(d.getDataFromExcelFile("Sheet1", 2, 0));
organisationpage o=new organisationpage(driver);
o.getSave().click();
}
}
