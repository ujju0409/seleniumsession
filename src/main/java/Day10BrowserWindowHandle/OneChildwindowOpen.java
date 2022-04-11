package Day10BrowserWindowHandle;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneChildwindowOpen {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
		
		String parentsid =driver.getWindowHandle();
		System.out.println(parentsid);
		
		 driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
	Set<String> handler=driver.getWindowHandles();
	System.out.println("WINDOW ID"+handler);
	Iterator<String> it=handler.iterator();
	
		/* parents1id=it.next();
		driver.switchTo().window(parents1id);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		String Childid1=it.next();
		driver.switchTo().window(Childid1);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//driver.close();
		
		String Childid2=it.next();
		driver.switchTo().window(Childid2);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		String Childid3=it.next();
		driver.switchTo().window(Childid3);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		*/
	System.out.println("==========");
		while(it.hasNext()) {
			String id =	it.next();
			//System.out.println(id);
			driver.switchTo().window(id);
			String s1=driver.getCurrentUrl();
			System.out.println(s1);
			
		
			if(!s1.contains("twitter")) {
				//driver.switchTo().window(id);
				driver.close();
				
			}
			}
		
		}
}
