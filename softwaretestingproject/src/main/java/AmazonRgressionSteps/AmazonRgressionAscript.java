package AmazonRgressionSteps;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.pages.Confirmation;
import Com.pages.Create;
import Com.pages.Home;
import Com.pages.Sign;


import org.testng.annotations.BeforeClass;

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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AmazonRgressionAscript extends Rusables {
	
  @Test(priority = 1)
  public void f() throws IOException {
	  Home home=new Home(driver);
	  home.SignHoverPointer();
	  home.SignButtonClick();
	//  shots();
	  Sign sign=new Sign(driver);
	  sign.CreationOfAccountClick();
	  Create create=new Create(driver);
	  create.CustomerFieldCharacters("Haroon");
	  //This to push the changes
	  create.Email("Rsr.Niaz@gmail.com");
	 // shots();
	  create.Psswd("Haroon");
	  create.Renterthepassword("Haroon");
	  create.Createbuttonclick();
	//  shots();
	  
  }
  @Test(priority = 2,dependsOnMethods = "f")
  public void ConfirmationOfText() {
	  Confirmation confirmation=new Confirmation(driver);
		 // String heading=confirmation.Message().getText();
		 // System.out.println(heading);
		 // Assert.assertEquals(heading, "Important Message!treofr"); 
		  String emailoftext=confirmation.emailoftext().getText();
		  System.out.println(emailoftext);
		 // Assert.assertEquals(emailoftext, "You tr indicated you are a new customer, but an account already exists with the e-mail Rsr.Niaz@gmail.com");
		  SoftAssert softassert=new SoftAssert();
		  softassert.assertEquals(emailoftext, "You indicated you are a new customer, but an account already exists with the e-mail Rsr.Niaz@gmail.com");
		  System.out.println("This to print after assertion");
		  softassert.assertAll();
	  
  }
  

	
}

