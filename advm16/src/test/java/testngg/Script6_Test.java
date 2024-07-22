package testngg;

import org.testng.annotations.Test;

import advm16.BaseClass;
import pomrepoo.campaignpage;

public class Script6_Test extends BaseClass {
@Test(groups = "campaigin")
public void scrippt6() throws InterruptedException {
	campaignpage c=new campaignpage(driver);
	c.getMoreOption().click();;
	c.getCampaignsLink().click();;
	Thread.sleep(3000);

}
}
