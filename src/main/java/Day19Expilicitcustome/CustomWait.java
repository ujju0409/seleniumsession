package Day19Expilicitcustome;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		By email  = By.name("email11");
		
		
		retryingElement(email, 10).sendKeys("ujjval");
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator,int TimeOut) {
		WebElement element = null;
		int attempts = 0;
		while (attempts<TimeOut) {
			try {
				element = getElement(locator);
				break;
			}catch(NoSuchElementException e) {
				System.out.println("element is not found in many ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts++;
		
			
			}
		if(element==null) {
			try {
				throw new Exception("ELEMENT NOT FOUND ");
				
			}catch(Exception e ){
				System.out.println("element is not found ");
			}
		}
			
		return element ;
		}
	}


