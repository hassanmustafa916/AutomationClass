package AmazonRgressionSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Com.pages.Home;
import Com.pages.Homefacebook;

public class Amazonofsign extends Rusables {
  @Test(groups = {"Functionaltesting"})
  public void f() throws InterruptedException, IOException {
	  Homefacebook dr=new Homefacebook(driver);
	  /*Properties prop=new Properties();
	  FileInputStream ds=new FileInputStream("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekend-20210410T031739Z-001\\CodingOfWeekend\\softwaretestingproject\\src\\Amazon.properties");
	  prop.load(ds);
	  String id=prop.getProperty("Email");
	  String st=prop.getProperty("Psswd");
	  System.out.println(id);
	  System.out.println(st);
	  dr.emailfield(id);
	  dr.psswdtofield(st);
	 // System.out.println("This to print the value for S="+s);
	  //System.out.println("This t print the value for N= "+n);
	  Thread.sleep(6000);
	  dr.login();
	  Thread.sleep(6000);
	// driver.navigate().back();
	  
	  //Groups:Smoke,Regression,Functional,Adhoc
	  System.out.println("This to execute functional test cases");*/
	  Home ob=new Home(driver);
	  ob.findlinks();
	  
  }
  @Test(groups = {"Regression"})
  public void Regression() {
	  System.out.println("This to execute regression group");
  }
  @Test(groups = {"Adhoc"})
  public void Adhocofexexution(){
	  System.out.println("This top execute ahoctestingmethods");
	  
  }
}
