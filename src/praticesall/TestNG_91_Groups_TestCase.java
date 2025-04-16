package praticesall;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_91_Groups_TestCase {
	WebDriver driver;
	
	@Test(groups="food")
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(groups="search")
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups="social")
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(groups="social")
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test(groups="bugtool")
	public void bugzilla() {
		driver.get("https://www.bugzilla.org");
	}
	@Test(groups="automation")
	public void seleniumDev() {
		driver.get("https://www.selenium.dev");
	}
	@Test(groups="bugtool")
	public void jira() {
		driver.get("https://www.jira.com");
	}
	@Test(groups="food")
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(groups={"social","email"})
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	@Test(groups="bugtool")
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
