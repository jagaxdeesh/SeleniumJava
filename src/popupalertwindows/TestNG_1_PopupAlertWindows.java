package popupalertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_1_PopupAlertWindows {
	WebDriver driver;
	
	@Ignore
	@Test(enabled = false)
	public void f() throws InterruptedException {

		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		
		//Alert a = driver.switchTo().alert();
		//a.accept();
		driver.switchTo().alert().dismiss();	
	}
	
	@Test
	public void method1() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("jaggumoon");
		Thread.sleep(2000);
		al.accept();
		
	}
	
	@Test
	public void method2() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
