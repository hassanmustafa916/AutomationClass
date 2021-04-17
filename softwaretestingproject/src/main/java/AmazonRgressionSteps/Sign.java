package AmazonRgressionSteps;

import org.testng.annotations.Test;

import Com.pages.Homefacebook;

import org.testng.annotations.DataProvider;

public class Sign extends Rusables {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Homefacebook dr=new Homefacebook(driver);
	  dr.emailfield(n);
	  dr.psswdtofield(s);
	  System.out.println("This to print the value for S="+s);
	  System.out.println("This t print the value for N= "+n);
	  Thread.sleep(6000);
	  dr.login();
	  Thread.sleep(6000);
	 driver.navigate().back();
	  
  }

  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "john@gmail.com", "Silver" },
      new Object[] { "Silver@gmail.com", "leesburg" },
      new Object[] { "john@gmail.com", "Silver" },
      new Object[] { "john@gmail.com", "Silver" },
      new Object[] { "john@gmail.com", "Silver" },
      new Object[] { "john@gmail.com", "Silver" },
    };
  }
}
