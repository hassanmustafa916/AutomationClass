package Com.trainingofweekend.softwaretestingproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class browsers {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test execution started");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test execution stopped");
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
     driver.get("https://amazon.com");
     driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

  @Test
  public void Gift_Cards() {
	  driver.findElement(By.linkText("Gift Cards")).click();
  }
}
