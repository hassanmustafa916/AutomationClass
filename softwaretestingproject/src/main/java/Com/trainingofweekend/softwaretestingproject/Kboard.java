package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kboard {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	     driver.get("https://amazon.com");
	     driver.manage().window().maximize();//
	     WebElement searchbx=driver.findElement(By.name("field-keywords"));
	     searchbx.sendKeys("Computer");
	    // searchbx.sendKeys(Keys.ENTER);
	     Actions ob=new Actions(driver);
	    // ob.sendKeys(searchbx, Keys.ENTER).perform();
	    // ob.sendKeys(Keys.chord(Keys.CONTROL.DOWN+"a")).perform();
	     ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	     Thread.sleep(6000);
	     ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	     Thread.sleep(6000);
	     searchbx.clear();
	     searchbx.click();
	     Thread.sleep(6000);
	     ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	     
	}

}
