package Day13WebTablexpath;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandles 
{
  static   WebDriver driver;
	public static void main(String[] args) 
	{
		// setup
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  
		  // lunch url
	      driver.get("https://www.cricbuzz.com/live-cricket-scorecard/40348/pak-vs-aus-1st-test-australia-tour-of-pakistan-2022");
		   
	     String wkname= getwickettakername("Shafique");
	     System.out.println(wkname);
	     
System.out.println(getScore("Khawaja"));
	      
	      
	driver.close();
    }
	
	public static String getwickettakername(String name) {
	return	driver.findElement(By.xpath("//a[contains(text(),' "+name+" ')]/parent::div/following-sibling::div")).getText();
	}
	
	
	public static List<String> getScore(String name) {
		List<String> scoreval=new ArrayList<String>();
		List<WebElement> scorelist=driver.findElements(By.xpath("//a[contains(text(),' "+name+" ')]/parent::div/following-sibling::div"));
		for(int i=0;i<scorelist.size();i++) {
			String Score=scorelist.get(i).getText();
			scoreval.add(Score);
		}
		return scoreval;
	}
	
}	  

