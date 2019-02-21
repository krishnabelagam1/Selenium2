package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTestNG2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("837727");;
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.close();
  }
}
