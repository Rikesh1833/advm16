package advm16;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomrepoo.homepage;
import pomrepoo.loginpage;
@Listeners(listn.class)
public class BaseClass {
	public static WebDriver driver;
	public static detials d=new detials();
	public static webdriverutil w=new webdriverutil();
	public static randomnu r=new randomnu();
	public  static ExtentSparkReporter reporter;
	public static ExtentReports reports;
    public static ExtentTest test;
	@BeforeSuite(alwaysRun = true)
public void beforesuit() {
	Reporter.log("report generation", true);
reporter =new ExtentSparkReporter(Iconsant.reportpath);
reports=new ExtentReports();
reports.attachReporter(reporter);
}
@Parameters("browser")
@BeforeClass(alwaysRun = true)
public void beforeclass(@Optional("chrome")String bname) throws IOException {
	
	if(bname.contains("chrome")) {
		driver=new ChromeDriver();
	}
	else if(bname.contains("egde")) {
		driver=new EdgeDriver();
	}
	w.maximizeTheWindow(driver);
	w.implicitlyWait(driver);
	driver.get(d.getDataFromPropertyFile("url"));
	
}
@BeforeMethod(alwaysRun = true)
public void beforemethod(Method method) throws IOException {
	test= reports.createTest(method.getName());
	loginpage lp=new loginpage(driver);
	lp.getUsertextbox().sendKeys(d.getDataFromPropertyFile("username"));
lp.getPasswordtext().sendKeys(d.getDataFromPropertyFile("password"));
lp.getLoginbutton().click();
} 
@AfterMethod(alwaysRun = true)
public void aftermethod() {
	homepage h=new homepage(driver);
	h.getAccountlogout().click();
	h.getSignout().click();
	
}
@AfterClass(alwaysRun = true)
public void afterclass() {
	driver.close();
}
@AfterSuite(alwaysRun = true)
public void aftersuite() {
	Reporter.log("report close", true);
	reports.flush();
}
}
