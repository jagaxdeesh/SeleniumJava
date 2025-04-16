package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_7_TimeOutFeature {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("jagadeesh");
	  driver.findElement(By.xpath("//*[@name=\"pwd\"]")).sendKeys("jaagu@1234");
	  driver.findElement(By.name("rememberme")).click();
	  driver.findElement(By.xpath("//input[@id=\"wp-submit\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"wp-login-lost-password\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("jaggu@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  driver.findElement(By.xpath("//a[@class=\"wp-login-log-in\"]")).click();
	  Thread.sleep(3000);
	  }
  
  @Test(timeOut = 7000)
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("jagadeesh");
	  driver.findElement(By.xpath("//*[@name=\"pwd\"]")).sendKeys("jaagu@1234");
	  driver.findElement(By.name("rememberme")).click();
	  driver.findElement(By.xpath("//input[@id=\"wp-submit\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"wp-login-lost-password\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("jaggu@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  driver.findElement(By.xpath("//a[@class=\"wp-login-log-in\"]")).click(); 
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
