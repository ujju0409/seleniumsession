package Day19Expilicitcustome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRef {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		WebElement  ele= driver.findElement(By.name("email"));
		ele.sendKeys("ujjval");
		driver.navigate().refresh();
		//ele.sendKeys("jay");  //org.openqa.selenium.StaleElementReferenceException  Because of the  element id change ..
		//....to avoid this we have to write webelemnt  again ...

	    ele= driver.findElement(By.name("email"));
		ele.sendKeys("jay");
		
		
	}

}
