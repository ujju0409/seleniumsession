package TestngDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoOpenCartTest extends BaseTest{

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Yatin5431@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);
		
	}
	
	@Test
	public void titleTest() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
		
		//Thread.sleep(2000);
	}
	@Test
	public void serchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	
	@Test
	public void changePassword() {
	WebElement link=	driver.findElement(By.xpath("//a[text()='Change your password']"));
	Assert.assertTrue(link.isEnabled());
	}
	
	@Test
	public void orderHistory() {
		driver.findElement(By.xpath("//a[text()='View your order history']")).click();
		WebElement oders= driver.findElement(By.xpath("//div[@id='content']/h1"));
		String text= oders.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Order History");
	
	}
	
	@Test
	public void afflilateInformation() {
		driver.findElement(By.xpath("//a[text()='Edit your affiliate information']")).click();
		driver.findElement(By.id("input-cheque")).sendKeys("jay");
		//driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 String message=driver.findElement(By.xpath("//i[@class='fa fa-check-circle']")).getAttribute("value");
		 System.out.println(message);
		
		
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	}
	
	
	
}
