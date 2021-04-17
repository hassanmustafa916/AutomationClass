package AmazonRgressionSteps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import Comons.Utilbase;

public class listners extends Rusables implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is started");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Rusables)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(capture,new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend\\softwaretestingproject\\Pictures\\Passed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Rusables)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(capture,new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend\\softwaretestingproject\\Pictures\\Failed\\"+si+"Picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
