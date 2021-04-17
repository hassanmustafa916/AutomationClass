package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	     driver.get("https://amazon.com");
	     driver.manage().window().maximize();//
	  //   WebElement Srhicn=driver.findElement(By.id("nav-search-submit-buttonui"));
	     try {
	  boolean displayed=driver.findElement(By.id("nav-search-submit-button")).isDisplayed();
	  System.out.println(displayed);
	  }catch (Exception e) {
		// TODO: handle exception
		  System.out.println("Element is not displayed");
	}
	  
	}

}
