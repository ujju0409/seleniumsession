package Day18Explicitgeturltitleframelist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementTobeClick {
  static WebDriver driver;
  
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			 
			 
			 driver.get("https://www.amazon.ca/");
		
		//By amzonesice	=By.linkText("Amazon Science");
			 // by locator 
//		
//		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(amzonesice)).click();
//		System.out.println(driver.getTitle());
//		
		// By WebElement ....
		
		WebElement cash = driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[2]"));
		//cash.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.elementToBeClickable(cash));
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
