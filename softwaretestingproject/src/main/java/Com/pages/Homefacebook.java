package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homefacebook {
	public WebDriver driver;
@FindBy(name = "email") WebElement emaildidfield;
@FindBy(name="pass")WebElement psword;
@FindBy(name="login") WebElement loginbutton;
public Homefacebook(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void emailfield(String email) {
	emaildidfield.clear();
	emaildidfield.sendKeys(email);
}
public void psswdtofield(String pssword) {
	psword.sendKeys(pssword);
}
public void login() {
	loginbutton.click();
}
}
