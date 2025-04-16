package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_6_DependsOneMethods {
	
	WebDriver driver;
	
  @Test(dependsOnMethods = "method2")
  public void method1() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("jagadeesh");
  }
  
  @Test(dependsOnMethods = "method1")
  public void method3() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("jaggu@1234");
  }
  @Test
  public void method2() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
