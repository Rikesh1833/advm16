package pomrepoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
public homepage(WebDriver driver)
{
	
		PageFactory.initElements(driver, this);

}
@FindBy(linkText = "Organizations")
private WebElement Organizations;
@FindBy(linkText = "Contacts")
private WebElement contacts;
@FindBy(linkText = "Products")
private WebElement Products;
public WebElement getOrganizations() {
	return Organizations;
}
public WebElement getContacts() {
	return contacts;
}
public WebElement getProducts() {
	return Products;
}
@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
private WebElement accountlogout;
@FindBy(linkText ="Sign Out")
private  WebElement signout;
public WebElement getAccountlogout() {
	return accountlogout;
}
public WebElement getSignout() {
	return signout;
}
@FindBy(linkText = "Campaigns")
private WebElement campaingnpage;
public WebElement getCampaingnpage() {
	return campaingnpage;
}
}
