package TestngDay1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmzoneTest extends BaseTest
{

@Test(priority = 1)
public void titleTest() {
	driver.get("https://www.amazon.ca/");
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
}
@Test(priority = 2)
public void urlTest() {
	//driver.get("https://www.amazon.ca/");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url, "https://www.amazon.ca/");
}	
	
@Test(priority = 3)
public void  serchTest() {
	//driver.get("https://www.amazon.ca/");
	Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
	
}
	
	

}