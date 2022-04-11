import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		//co.addArguments("--incognito");
		//co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.ca/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
