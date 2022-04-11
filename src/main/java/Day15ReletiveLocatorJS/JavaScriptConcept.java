package Day15ReletiveLocatorJS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.ca/");
	
	JavaScriptUtil js =new JavaScriptUtil(driver);
	
	WebElement  serchflied= driver.findElement(By.id("twotabsearchtextbox"));
	js.flash(serchflied);
	
	//js.generateAlert("this is ujjval alert");
	
	//js.scrollPageDown("500");
	
	//WebElement ele =driver.findElement(By.xpath("//span[contains(text(),'Spring essentials')]"));
	
	//js.scrollIntoView(ele);
	WebElement draw=driver.findElement(By.xpath("(//a[contains(text(),'New Releases')])[1]"));
	js.drawBorder(draw);
	
	}
	}