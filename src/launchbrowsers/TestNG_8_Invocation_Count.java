package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_8_Invocation_Count {
	WebDriver driver;
	
	@Test(invocationCount = 5)  // to repeat test 5 times use of invocationCount
	public void f() {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("SaiUttej");
		driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//*[@id='rememberme']")).click();
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//*[@class='wp-login-lost-password']")).click();
		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("SaiUttej123@gmail.com");
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//*[@class='wp-login-log-in']")).click();
	}
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
