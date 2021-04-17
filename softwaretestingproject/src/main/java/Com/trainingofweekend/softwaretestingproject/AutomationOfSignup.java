package Com.trainingofweekend.softwaretestingproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationOfSignup {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\CodingOfWeekend\\softwaretestingproject\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	      WebElement CreateNewAccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
	      CreateNewAccount.click();
	      Thread.sleep(6000);
	      WebElement FirstFieldName=driver.findElement(By.xpath("//*[@name='firstname']"));
	      FirstFieldName.sendKeys("John");
	      WebElement LastFieldName=driver.findElement(By.xpath("//*[@name='lastname']"));
	      LastFieldName.sendKeys("johnson");
	      WebElement Mobilenumberfields=driver.findElement(By.xpath("//*[@name='reg_email__']"));
	      Mobilenumberfields.sendKeys("7036666666");
	      WebElement PsswddieldsName=driver.findElement(By.name("reg_passwd__"));
	      PsswddieldsName.sendKeys("sterling");
	     WebElement Yeardrop= driver.findElement(By.name("birthday_year"));
	      //handle the drop down with select class
	      Select ob=new Select(Yeardrop);//constructor overloading concept
	      ob.selectByIndex(10);
	      Thread.sleep(6000);
	      ob.selectByValue("1980");
	      Thread.sleep(6000);
	      ob.selectByVisibleText("1960");
	     WebElement male= driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
	     male.click();
	}

}
