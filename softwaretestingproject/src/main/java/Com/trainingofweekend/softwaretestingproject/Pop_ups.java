package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_ups {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	     driver.get("https://www.expedia.com");
	      
	      //driver.get("https://www.demoqa.com/alerts");
	      driver.manage().window().maximize();
	    /* WebElement simpletestalert= driver.findElement(By.id("alertButton"));
	     simpletestalert.click();
	     Thread.sleep(6000);
	     driver.switchTo().alert().accept();
	     WebElement alertoftime=driver.findElement(By.id("timerAlertButton"));
	     alertoftime.click();
	     Thread.sleep(10000);
	     driver.switchTo().alert().dismiss();*/
	      driver.findElement(By.id("d1-btn")).click();
	      Thread.sleep(6000);
	      driver.findElement(By.xpath("//*[@aria-label='Apr 26, 2021.']")).click();
	}

}
