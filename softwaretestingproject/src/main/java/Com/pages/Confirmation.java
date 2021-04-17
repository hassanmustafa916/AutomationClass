package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
WebDriver driver;
@FindBy(xpath = "//*[text()='Important Message!']") WebElement heading;
@FindBy(xpath = "//*[contains(text(),'To better protect')]") WebElement subtext;
@FindBy(xpath = "//*[contains(text(),'Email address already')]") WebElement headingofemail;
@FindBy(xpath = "(//*[contains(text(),'Haroon')])[1]") WebElement Haroon;
@FindBy(xpath = "//*[contains(text(),'You indicated')]") WebElement emailoftext;
public Confirmation(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement Message() {
	return heading;
}
public WebElement subtext() {
	return subtext;
}
public WebElement headingofemail() {
	return headingofemail;
}
public WebElement Haroon() {
	return Haroon;
}
public WebElement emailoftext() {
	return emailoftext;
}
}
