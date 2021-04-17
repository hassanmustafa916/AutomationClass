package Com.trainingofweekend.softwaretestingproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Automa {
  @Test//5
  public void f() {
	  System.out.println("This to execute test annotaion");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This to execute before method annotaion");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("This to execute after method annotaion");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("This to execute before class annotaion");
  }

  @AfterClass//7
  public void afterClass() {
	  System.out.println("This to execute after class annotaion");
  }
  

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("This to execute before test annotaion");
  }
@Test
public void u() {
	System.out.println("This t o execute test 2 annotation .");
}
  @AfterTest//8
  public void afterTest() {
	  System.out.println("This to execute after test annotaion");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("This to execute before suite annotaion");
  }

  @AfterSuite//9
  public void afterSuite() {
  System.out.println("This to execute after suite annotaion");
  }

}
