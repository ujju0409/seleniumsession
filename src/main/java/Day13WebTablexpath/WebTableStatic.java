package Day13WebTablexpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableStatic {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		
		
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=3;j++) {
			String text = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(text+"  ");
			}
			System.out.println();
		}
		
		
	}

}
