package TestngDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestngDay1.BaseTest;

public class DemoCartAppTrest extends BaseTest {
	WebDriver driver;
	@Test
	public void titleTest() {
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login");
		
	}
	
	@Test
	public void urlTest() {
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.opencart.com/");
	}
	
	@Test
	public void serchTest() {
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

}
