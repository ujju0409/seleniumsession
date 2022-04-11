package Day11ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.className("menulink"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("COURSES")).click();
		
		driver.close();
		

	}

}
