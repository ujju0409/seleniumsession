package Day15ReletiveLocatorJS;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele =driver.findElement(By.linkText("Saint-John,Canada"));
		
		String index =driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(index);
		
		
		
		
		
		
		
		
		
	}

}
