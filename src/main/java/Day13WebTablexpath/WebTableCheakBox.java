package Day13WebTablexpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheakBox
{
static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		selectCheakBox("Joe.Root");
		selectCheakBox("John.Smith");//John Smith
		
		//driver.close();
	}

	public static void  selectCheakBox(String name) {
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td")).click();
		
	}
	
	
	
}
