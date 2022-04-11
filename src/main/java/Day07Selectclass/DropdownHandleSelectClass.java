package Day07Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandleSelectClass {
 static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement country= driver.findElement(By.id("Form_submitForm_Country"));
		Select sel =new Select(country);
		sel.selectByVisibleText("India");
		
		
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	
public static void selectbyvisabletext(By locator, String name)	{
Select sel = new Select(getElement(locator));
sel.selectByVisibleText(name);

	
}
}
