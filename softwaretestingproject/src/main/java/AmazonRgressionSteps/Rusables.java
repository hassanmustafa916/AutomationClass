package AmazonRgressionSteps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//add comment

public class Rusables {
	public WebDriver driver;
	String Path=  System.getProperty("user.dir");
	  @BeforeClass
	  @Parameters({"URI","Wbsites"})
	  public void browsers(String browser,String Wbsite) {
		//String Path=  System.getProperty("user.dir");
		System.out.println(Path);
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", Path+"\\Drivers\\chromedriver.exe");
			     driver=new ChromeDriver();
				 driver.get(Wbsite);
			     driver.manage().window().maximize();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", Path+"\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get(Wbsite);
			    driver.manage().window().maximize();
			}else if(browser.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", Path+"\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.get(Wbsite);
				driver.manage().window().maximize();
			}
		}

	  @AfterClass
	  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(6000);
		 //driver.close();
	  }
	  public void shots(String folder) throws IOException {
			Date dt=new Date();
			System.out.println(dt);
			String si=dt.toString().replace(" ", "_").replace(":", "_");
			System.out.println(si);
			File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(capture,new File(Path+"\\Pictures\\"+folder+"\\"+si+"Picture.png"));
		  
		}
}
