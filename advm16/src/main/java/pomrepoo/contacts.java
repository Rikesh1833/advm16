package pomrepoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contacts {
	public contacts(WebDriver driver)
	{
		
			PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
 private WebElement createcontacts;
	@FindBy(name = "lastname")
	private WebElement lastnametext;
	public WebElement getCreatecontacts() {
		return createcontacts;
	}
	public WebElement getLastnametext() {
		return lastnametext;
	}
}
