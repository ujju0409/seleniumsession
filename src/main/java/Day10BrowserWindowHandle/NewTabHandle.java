package Day10BrowserWindowHandle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabHandle
{

	public static void main(String[] args)
	{
		//setup driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//lunch url
		driver.get("https://www.amazon.ca/");
		 String parentid=driver.getWindowHandle();
		 
		 
		 // new tab concept we are going to use 
		 driver.switchTo().newWindow(WindowType.TAB);//4.0
		 
		 driver.get("https://www.google.com/");
		String newtabtitle= driver.getTitle();
		System.out.println(newtabtitle);
		driver.close();
		driver.switchTo().window(parentid);
		String parenttitle=driver.getTitle();
		System.out.println(parenttitle);
		driver.close();
		
	}

}
