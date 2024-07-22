package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
@Test
public void launch(){
	Reporter.log("rikesh");
	Reporter.log("Rikesh", true);
}
}
