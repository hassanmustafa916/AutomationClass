package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtrainingcourse{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
     WebElement EmailIdFields=driver.findElement(By.id("email"));
     EmailIdFields.sendKeys("train@gmail.com");
     WebElement Password=driver.findElement(By.name("pass"));
     Password.sendKeys("traunungsn");
    // WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
     WebElement Forgot=driver.findElement(By.partialLinkText("Forgot"));
     Forgot.click();
     Thread.sleep(6000);
    // WebElement Cancel= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div/div/div/div/a"));
     
     
     
     WebElement title=driver.findElement(By.xpath("//div[text()='Please enter your email or phone number to search for your account.']"));
    String tx=title.getText();
    System.out.println(tx);
    Thread.sleep(6000);
     
     WebElement Cancel=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
     Cancel.click();
     
     /* Goto facebook.com enter your id and password 
      * click on forgot password link
      * Enter your email in the field 
      * Click on  search button
      */
    }
}
