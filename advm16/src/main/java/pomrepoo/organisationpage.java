package pomrepoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationpage {
public organisationpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement createorg;
@FindBy(name = "accountname")
private WebElement accountname;
@FindBy(name = "industry")
private WebElement industry;
@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement save;
@FindBy(id = "phone")
private WebElement phone;
public WebElement getPhone() {
	return phone;
}
public WebElement getCreateorg() {
	return createorg;
}
public WebElement getAccountname() {
	return accountname;
}
public WebElement getIndustry() {
	return industry;
}
public WebElement getSave() {
	return save;
}
public WebElement getCreateeeorg() {
	return createeeorg;
}
@FindBy(xpath = "//span[text()='Creating New Organization']")
private WebElement createeeorg;
}
