package iframehandels;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class HandleIFrames {
	WebDriver driver;
	
  @Test
  public void frames() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(1000);
	  
	  WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
//	  driver.switchTo().frame(obj);
//    driver.switchTo().frame(0);
      driver.switchTo().frame("iframeResult");
      
      driver.findElement(By.xpath("/html/body/button")).click();
      driver.switchTo().alert().accept();
      
      driver.switchTo().defaultContent();  // exit the frame
      
//    driver.switchTo().parentFrame();   // its move to the parent frame before frame 
  
      driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
   
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  driver = new EdgeDriver();
      driver.manage().window().maximize(); 
  }

}
