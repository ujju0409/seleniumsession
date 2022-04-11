package Day17ImplicityAndExplicity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitwaitConcept {
 static  WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		 
		 
		 driver.get("https://www.opencart.com/index.php?route=cms/demo");
		 
		 By emilid= By.id("input-email");
		 By paasword = By.id("input-password");
		 
		 
		 
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(paasword));
		 ele.sendKeys("pass123");
		 
		 
		 //wait.until(ExpectedConditions.visibilityOf())
		 
		
		 
		
		
		
		
	}
	
	

	

}
