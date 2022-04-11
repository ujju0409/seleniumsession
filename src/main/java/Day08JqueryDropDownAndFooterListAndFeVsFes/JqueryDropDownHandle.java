package Day08JqueryDropDownAndFooterListAndFeVsFes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
	// List<WebElement>	choicelist=driver.findElements(By.xpath("//ul/li[@class='ComboTreeItemChlid']/span"));
	 //System.out.println(choicelist.size());
	   
	 By choice=By.xpath("//span[@class='comboTreeItemTitle']");
	 //1  case single select 
	 //selectChoice(choice, "choice 1");
	 
	// 2 multi select by using same method 
		
	//selectChoice(choice, "choice 1","choice 2");
     selectChoice(choice, "all");
     selectChoice(choice, "all");
	}
	public static void selectChoice(By locator ,String... name) {
	 
		 List<WebElement>	choicelist=driver.findElements(locator);
		 System.out.println(choicelist.size());
   		
		 
		 if(!name[0].equalsIgnoreCase("all")) { 
		 for(WebElement e:choicelist) {
			 String text = e.getText();
			 System.out.println(text);
			 
			 
			 for(int i=0;i<name.length;i++) {
				 if(text.equals(name[i])) {
					 e.click();
					 break;
				 }
				 
			 }
			
			 }
			 }
		 else {
			 try {
			 for(WebElement e:choicelist) {
				 e.click();
			 } 
			 }catch(ElementNotInteractableException e){
				 System.out.println("all choice is over");
			 }
		 }
		 }
		 
		
	}


