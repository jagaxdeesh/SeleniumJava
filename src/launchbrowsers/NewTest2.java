package launchbrowsers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  @Test
  public void facebook() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.print("afterMethod"+1);
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.print("beforeClass"+2);
  }

  @AfterClass
  public void afterClass() {
	  System.out.print("beforeClass"+2);
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.print("beforeClass"+2);
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("afterTest"+2);
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.print("beforeSuite"+2);
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.print("afterSuite("+2);
  }

}
