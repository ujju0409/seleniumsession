package Day08JqueryDropDownAndFooterListAndFeVsFes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryMultiSelectWithCaseCadeOption {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox1")).click();
		
		By choice=By.xpath("//span[contains(@class,'comboTreeItemTitle')]");
		//selectChoice(choice, "choice 2","choice 3");
		
		selectChoice(choice, "all");
		
		
		
	}
	
	public static void selectChoice(By locator, String... name) {
	List<WebElement>  selectlist = driver.findElements(locator);
	System.out.println(selectlist.size());
	
	if(!name[0].equalsIgnoreCase("all")) {
	for(WebElement e:selectlist) {
		String text= e.getText();
		System.out.println(text);
		for(int i=0; i<name.length;i++) {
			
		if(text.equals(name[i])) {
			e.click();
			break;
		}
		}
		}
		
	    }
	else
		
	    { 
		try
		{
		for(WebElement e:selectlist)
		{
		e.click();
		}
		}
		catch(ElementNotInteractableException e) 
		{
			System.out.println("all selected");
		}
	    }
		
	    
}
	

}
