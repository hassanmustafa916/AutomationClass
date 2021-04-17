package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfPointer {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	     driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	     driver.manage().window().maximize();
	    // WebElement Signin=driver.findElement(By.xpath("//*[text()='Hello, Sign in']"));
	     Actions ob=new Actions(driver);
	     /*ob.moveToElement(Signin).build().perform();
	   WebElement or=driver.findElement(By.linkText("Orders"));
	   ob.moveToElement(or).click().build().perform();
	     driver.switchTo().frame(0);
	     WebElement dragables=driver.findElement(By.id("draggable"));
	     WebElement dropables=driver.findElement(By.id("droppable"));
	     ob.dragAndDrop(dragables, dropables).build().perform();
	     Thread.sleep(6000);
	     driver.switchTo().parentFrame();
	     WebElement Sizeables=driver.findElement(By.linkText("Resizable"));
	     Sizeables.click();
	     driver.switchTo().frame(0);
	     Thread.sleep(6000);	
	     WebElement Risizeds=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	     ob.dragAndDropBy(Risizeds, 343, 136).build().perform();*/
	     WebElement pictures=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
	     Thread.sleep(6000);
	     ob.contextClick(pictures).build().perform();
	}

}
