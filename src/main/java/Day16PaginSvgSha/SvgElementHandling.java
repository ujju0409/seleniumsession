package Day16PaginSvgSha;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElementHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		
	List<WebElement> statelist=	driver.findElements(By.xpath("//*[local-name()='svg'and @id='map-svg']//*[name()='g' and @id ='states']//*[name()='g']//*[name()='path']"));
		
	System.out.println(statelist.size());
	Actions act= new Actions(driver);
	for(WebElement e:statelist) {
		act.moveToElement(e).perform();
		String statename=e.getAttribute("name");
		System.out.println(statename);
		if(statename.equals("Washington")) {
			e.click();
		}
	}
	
	}

}
