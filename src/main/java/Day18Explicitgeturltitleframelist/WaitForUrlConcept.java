package Day18Explicitgeturltitleframelist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlConcept {
 static WebDriver driver;
 
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			 
			 
			 driver.get("https://www.amazon.ca/");
			 driver.findElement(By.xpath("(//a[contains(text(),'New Releases')])[1]")).click();
			  // System.out.println(driver.getTitle());
			 
			 
			 
//			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			 if(wait.until(ExpectedConditions.urlContains("nav_cs_newreleases"))) {
//				 String title = driver.getCurrentUrl();
//				 System.out.println(title);
//			 }
//			 //Amazon.ca Hot New Releases: The bestselling new & future releases on Amazon
//		     
//			 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			 if( wait1.until(ExpectedConditions.urlToBe("https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases"))) {
//				 System.out.println(driver.getTitle());
//			 }
			 
		   
			 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			if( wait2.until(ExpectedConditions.titleContains("Amazon.ca Hot New Releases"))) {
				System.out.println(driver.getTitle());
			}
			 
			 
		
	}

}
