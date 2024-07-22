package advm16;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverutil {
	/**
	 * the method is used to maximize the window
	 * @param driver
	 */
		public void maximizeTheWindow(WebDriver driver) {
			driver.manage().window().maximize();
		}

	/**
	 * this method is used to refresh the page
	 * @param driver
	 */
		public void refershThePage(WebDriver driver) {
			driver.navigate().refresh();
		}

	/**
	 * this method is used to forward  the page
	 * @param driver
	 */
		public void forwardThePage(WebDriver driver) {
			driver.navigate().forward();
		}

	/**
	 * this method is used to implicitly wait
	 * @param driver
	 */
		public void implicitlyWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

	/**
	 * this method for explicit wait elementToBeClickable
	 * @param driver
	 * @param element
	 */
		public void elementClickableWait(WebDriver driver, WebElement element) {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
	/**
	 * this method for explicit wait elementToBeSelected
	 * @param driver
	 * @param element
	 */
		public void elementToBeSelectedWait(WebDriver driver, WebElement element) {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}

	/**
	 * this method is used to switch the frame
	 * @param driver
	 * @param element
	 */
		public void switchFrame(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}

	/**
	 * this method is used for switch back the frame
	 * @param driver
	 * @param element
	 */
		public void switchBackFrame(WebDriver driver) {
			driver.switchTo().parentFrame();
		}

	/**
	 * this method is used to select the dropdown using value
	 * @param element
	 * @param value
	 */
		public void selectDropdownByValue(WebElement element, String value) {
			Select sel= new Select(element);
			sel.selectByValue(value);
		}

	/**
	 * this method is used to select the dropdown using visible text
	 * @param element
	 * @param text
	 */
		public void selectDropdownByVisibleText(WebElement element, String text) {
			Select sel= new Select(element);
			sel.selectByVisibleText(text);
		}

	/**
	 * this method is used to deselect the dropdown using value
	 * @param element
	 * @param value
	 */
		public void deSelectDropdownByValue(WebElement element, String value) {
			Select sel= new Select(element);
			sel.deselectByValue(value);
		}

	/**
	 * this method to handle alert popup-accept
	 * @param driver
	 */
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}

	/**
	 * this method to handle alert popup-dismiss
	 * @param driver
	 */
		public void dismissAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();;
		}
		public void doubleclick(WebDriver driver,WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
			
			
		}
	public void scrolldownwindow(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
	a.contextClick(element).perform();
	}
	public void scrolldown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(0,500)");
		
	}
	public void scrollup(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
		
	}
	}

