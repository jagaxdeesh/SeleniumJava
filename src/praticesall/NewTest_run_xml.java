package praticesall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_run_xml {
	WebDriver driver;
	
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void seleniumDev() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
    
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
