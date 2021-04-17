package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	WebDriver driver;
@FindBy(linkText = "Create your Amazon account") WebElement CreateAnAccount;
public Sign(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void CreationOfAccountClick() {
	CreateAnAccount.click();
}
}
