package Day17ImplicityAndExplicity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforAlertConcept {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			 
		driver.findElement(By.name("proceed")).click();
		//driver.switchTo().alert();
		
		alertaccpect(10);
		
	     
	     
	  
	}
      
	public static Alert alertPresent(int TimeOut) {
   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
	     return wait.until(ExpectedConditions.alertIsPresent());
	   
	}
	public static void alertaccpect(int TimeOut) {
		alertPresent(TimeOut).accept();
	}
	public static void alertDissmisal(int TimeOut) {
		alertPresent(TimeOut).dismiss();
	}

	
}


