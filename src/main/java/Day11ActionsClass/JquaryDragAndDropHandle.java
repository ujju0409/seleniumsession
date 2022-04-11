package Day11ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquaryDragAndDropHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement elementdrag= driver.findElement(By.id("draggable"));
		WebElement elementdrop=driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		
	//act.clickAndHold(elementdrag).perform();
	//act.moveToElement(elementdrop).release().perform();
	act.
	clickAndHold(elementdrag).
	moveToElement(elementdrop).
	release()
	.perform();
		
		//act.dragAndDrop(elementdrag, elementdrop).perform();
		
		
		
		
		
		
		
		

	}

}
