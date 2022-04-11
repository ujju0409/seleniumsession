package Day07Selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionAssigment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(2000);
		
		List<WebElement> suggestionlist=driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
		System.out.println(suggestionlist.size());
		
		
		for(WebElement e: suggestionlist) {
		String text=	e.getText();
		System.out.println(text);
		if(text.contains("Casual Dresses > Printed ")) {
			e.click();
			break;
		}
		}
		 Thread.sleep(2000);
		 String name =driver.findElement(By.xpath("//h1[contains(text(),'Printed Dress')]")).getText();
		 System.out.println(name);
		 if(name.equals("Printed Dress")) {
			 System.out.println("TestCase Is Pass");
		 }
		 else {
			 System.out.println("test case is fail");
		 }
		 
		 //driver.close();
	}

}
