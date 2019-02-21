package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
  @Test
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a")).click();
		WebElement features = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(features).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[2]/a")).click();
		System.out.println("Clicked successfully");
		driver.close();

	}

}
