package Day10BrowserWindowHandle;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowItrerator {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String parentsid =driver.getWindowHandle();
		System.out.println(parentsid);
		
		 driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		
		Set<String> handler=driver.getWindowHandles();
	 //  Iterator<String> it = handler.iterator();
	   
	   
//		while(it.hasNext()) {
//		String id =	it.next();
//		driver.switchTo().window(id);
//		System.out.println(driver.getTitle());
//	
//		if (!id.equals(parentsid)) {
//			driver.close();
//		}
//		
//		
//		}
		
		for(String s:handler) {
			driver.switchTo().window(s);
			Thread.sleep(1000);
			String title=driver.getTitle();
			System.out.println(title);
          if(!title.equals("OrangeHRM"))	{
        	  driver.close();
          }		
		}
		
		
	}

}
