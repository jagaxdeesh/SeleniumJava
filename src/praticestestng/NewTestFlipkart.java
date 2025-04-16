package praticestestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTestFlipkart {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]")).sendKeys("iphone16E");
	  driver.findElement(By.xpath("//*[@class=\"Pke_EE\"]"));
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
