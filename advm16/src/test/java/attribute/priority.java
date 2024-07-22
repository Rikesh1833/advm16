package attribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
@Test(priority = -1)
public void login() {
	Reporter.log("use login done", true);
	
}
@Test(priority = 0)
public void addcart() {
	Reporter.log("add to cart", true);
}
@Test
public void logout() {
	Reporter.log("user has logout", true);
}
}
