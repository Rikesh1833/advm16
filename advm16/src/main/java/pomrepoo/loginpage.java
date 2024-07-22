package pomrepoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
public loginpage( WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUsertextbox() {
	return usertextbox;
}
public WebElement getPasswordtext() {
	return passwordtext;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
@FindBy(name="user_name")
private WebElement usertextbox;
@FindBy(name="user_password")
private WebElement passwordtext;
@FindBy(id ="submitButton")
private WebElement loginbutton;
@FindBy(xpath = "//div[text()='Powered by vtiger CRM - 5.4.0']")
private WebElement text;
public WebElement getText() {
	return text;
}

}
