package Day17ImplicityAndExplicity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaitConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		//driver.manage().timeouts().implicitlyWait(null)
		
		
	}

}
