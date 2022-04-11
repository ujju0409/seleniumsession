package Day10BrowserWindowHandle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowHandle
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String parentid=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.ca/");
		String childid=driver.getTitle();
		System.out.println(childid);
		//driver.close();
		driver.switchTo().window(parentid);
		System.out.println(driver.switchTo().window(parentid));
		//driver.close();
		
		

	}

}
