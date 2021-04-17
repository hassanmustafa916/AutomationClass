package Com.pages;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id = "nav-link-accountList") 
	WebElement Sign;
    @FindBy(xpath = "//*[text()='Sign in']") WebElement Signofbutton;
    
    
    public Home(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    public void SignHoverPointer() {
    	Actions ob=new Actions(driver);
    	ob.moveToElement(Sign).build().perform();
    }
    public void SignButtonClick() {
    	Actions ob=new Actions(driver);
    	ob.moveToElement(Signofbutton).click().build().perform();
    	
    }
    public void findlinks() {
   java.util.List<WebElement> linksid= 	driver.findElements(By.tagName("a"));
   System.out.println(linksid.size());
   for(WebElement lk:linksid) {
	   System.out.println(lk.getText());
   }
   
    }
}
