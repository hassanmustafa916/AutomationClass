package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
	WebDriver driver;
@FindBy(name = "customerName") WebElement YourFieldsName;
@FindBy(name = "email")WebElement Name;
@FindBy(name="password")WebElement Password;
@FindBy(name = "passwordCheck") WebElement Psswd;
@FindBy(id="continue") WebElement CreateAmazonAccount;
public Create(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void CustomerFieldCharacters(String name) {
	YourFieldsName.sendKeys(name);
	
}
public void Email(String email) {
	Name.sendKeys(email);
}
public void Psswd(String psswd) {
	Password.sendKeys(psswd);
}
public void Renterthepassword(String ent) {
	Psswd.sendKeys(ent);
}
public void Createbuttonclick() {
	CreateAmazonAccount.click();
}
}
