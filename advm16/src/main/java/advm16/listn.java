package advm16;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listn extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("startexecution", true);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("end of excecution", true);



	}
	public void onTestFailure(ITestResult result) {
		Reporter.log("test case fail", true);
		TakesScreenshot t=(TakesScreenshot)driver;
		File source= t.getScreenshotAs(OutputType.FILE);
		File target=new File(Iconsant.screenshotpath);
		
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
