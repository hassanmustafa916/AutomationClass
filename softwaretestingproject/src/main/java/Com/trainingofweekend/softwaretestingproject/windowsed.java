package Com.trainingofweekend.softwaretestingproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowsed {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.amazon.com");
	      driver.manage().window().maximize();
	      WebElement books=driver.findElement(By.linkText("Kindle Books"));
	      String parenwindowhandle=driver.getWindowHandle();
	      System.out.println(parenwindowhandle);
	    
	      Actions ob=new Actions(driver);
	      ob.keyDown(Keys.LEFT_SHIFT).build().perform();;
	      books.click();
	      ob.keyUp(Keys.LEFT_SHIFT).build().perform();
	 Set<String> windowhandles= driver.getWindowHandles();
	 //Iterator
	 Iterator<String> iteraters=windowhandles.iterator();
	String FirstWindowHandle= iteraters.next();
	 String secondwindow=iteraters.next();
	 System.out.println(FirstWindowHandle);
	 System.out.println(secondwindow);
	      
	   driver.switchTo().window(secondwindow);   
	      //second window
	      driver.findElement(By.linkText("Amazon Charts")).click();
	      
	      
	      
	}

}
