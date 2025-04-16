package launchbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1_seleniumLocators {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.id("user_login")).sendKeys("jagadeesh");
	  driver.findElement(By.name("pwd")).sendKeys("jaggu123#");
	  driver.findElement(By.name("rememberme")).click();
	  driver.findElement(By.cssSelector("#wp-submit")).click();
	  driver.findElement(By.id("user_login")).sendKeys("jaggu@gmail.com");
	  driver.findElement(By.name("pwd")).sendKeys("jaggu@1234");
	  driver.findElement(By.name("rememberme")).click();
	  driver.findElement(By.cssSelector("input#wp-submit")).click();
	  driver.findElement(By.className("wp-login-lost-password")).click();
	  driver.findElement(By.cssSelector("input.input")).sendKeys("jagadeesh123@gmail.com");
	  driver.findElement(By.linkText("Log in")).click();
  }
  
  @Test
  public void flipkart() {
	  driver.get("https://www.flipkart.com");
	  List<WebElement> image = driver.findElements(By.tagName("imag"));
	  System.out.println("Total images in flipkart:"+image);
  }
  
  @Test
  public void techlearnlinks() {
	  driver.get("https://www.techlearn.in");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("Total links in techlearn :" + links);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.techlearn.in/admin");
  }

}
