package pomrepoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {
	public productpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createproduct;
	public WebElement getCreateproduct() {
		return createproduct;
	}
	@FindBy(name = "productname")
	private WebElement productname;
	public WebElement getProductname() {
		return productname;
	}
}
