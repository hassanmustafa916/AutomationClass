package Com.trainingofweekend.softwaretestingproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Time {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.amazon.com");
	      driver.manage().window().maximize();
	      
	     // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      WebDriverWait ob=new WebDriverWait(driver, 20);
	     // driver.findElement(By.id("twotabsearchtextbox")).click();
	      ob.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextboxui"))).click();
	}

}
