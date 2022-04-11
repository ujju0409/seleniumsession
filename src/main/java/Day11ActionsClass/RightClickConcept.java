package Day11ActionsClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();
        act.contextClick().perform();
        
        List<WebElement>rightclickoption=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
        int totalcount=rightclickoption.size();
        System.out.println(totalcount);
        for(int i =1;i<totalcount;i++) {
        	String list=rightclickoption.get(i).getText();
       	System.out.println(list);
       	if(list.contains("Copy")) {
       		rightclickoption.get(i).click();
       		break;
       		
       	}
       }
//        for(WebElement e:rightclickoption) {
//        	System.out.println(e.getText());
//        	if(e.getText().equals("Copy")) {
//        		e.click();
//        		break;
//        	}
//        
//        	
//        	
//        }
	}

}
