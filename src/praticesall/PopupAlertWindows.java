package praticesall;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class  PopupAlertWindows {
	WebDriver driver;
	
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
	  Thread.sleep(2000);
	  //driver.switchTo().alert().accept();
	  Alert a = driver.switchTo().alert();
	  a.accept();
	  driver.quit();
  }
  
  @Test
	public void alertsendtextok() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
	  Thread.sleep(2000);
//	  driver.switchTo().alert().sendKeys("Jagadeesh");
//	  Thread.sleep(3000);
//	  driver.switchTo().alert().accept();
	  
	  Alert a = driver.switchTo().alert();
	  a.sendKeys("jaagu");
	  a.accept();
	  
	  driver.quit();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
