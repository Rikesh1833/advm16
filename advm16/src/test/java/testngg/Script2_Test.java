package testngg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import advm16.BaseClass;
import io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType;
import pomrepoo.homepage;
import pomrepoo.organisationpage;

public class Script2_Test extends BaseClass {
@Test(groups = "organisation")
public void scrippt2() throws EncryptedDocumentException, IOException, InterruptedException {
homepage h=new homepage(driver);
h.getOrganizations().click();
test.log(Status.INFO, "user clicked on organisation link");
organisationpage o=new organisationpage(driver);
o.getCreateorg().click();
test.log(Status.INFO, "user  on organisation create page link");
int ro = r.getRandonNumber();
o.getAccountname().sendKeys(d.getDataFromExcelFile("Sheet1", 0, 0)+ro);
test.log(Status.INFO, "user create org name ");
w.selectDropdownByValue(o.getIndustry(),"Machinery");
test.log(Status.INFO, "user clicked on dropdown");

Thread.sleep(3000);
o.getSave().click();
test.log(Status.INFO, "user save the organisation ");

Thread.sleep(3000);
}
}