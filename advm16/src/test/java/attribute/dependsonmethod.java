package attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
@Test(priority = 1)
public void login() {
	int i=1/0;
	Reporter.log("login is created", true);
}
@Test(dependsOnMethods = "login",priority = 2)
public void addcart() {
	Reporter.log("addcart", true);
}
@Test(dependsOnMethods = "login",priority = 3)
public void logout() {
	Reporter.log("logout", true);
}
}
