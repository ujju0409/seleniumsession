import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationConcept 
{
/**
 * navigate concept 
 * we use four methods in
 * @param args
 */
	public static void main(String[] args)
	{
		//setup 
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		
		
		// lunch url 
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.ca");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().to("https://www.facebook.com");
		 System.out.println(driver.getTitle());
		 
		 driver.navigate().refresh();
		 System.out.println(driver.getTitle());
		 
		 
		 driver.navigate().to("https://www.google.ca/?client=safari&channel=iphone_bm");
		 System.out.println(driver.getTitle());
		 
		 
		 driver.quit();
		 
	

	}

}
