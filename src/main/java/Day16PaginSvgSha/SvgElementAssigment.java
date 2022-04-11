package Day16PaginSvgSha;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElementAssigment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
WebDriver driver = new ChromeDriver();
driver.get("https://petdiseasealerts.org/forecast-map#/");
driver.findElement(By.xpath("//*[local-name()='g'and @id='washington']")).click();
List<WebElement> area=driver.findElements(By.xpath("//*[local-name()='g'and @id='washington']//*[name()='path']"));
System.out.println(area.size());

Actions act =new Actions(driver);

for(WebElement e:area) 
{
	//System.out.println(e.getAttribute("name"));
	act.moveToElement(e).perform();
	//System.out.println(e.getText());
	
	}

  

	}

}
