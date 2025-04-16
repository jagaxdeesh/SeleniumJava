package iframe;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HandleIFrames {
	WebDriver driver;
	
	
  @Test
  public void handleIframe() {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  
	  WebElement i = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(i);
	  
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();

	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
