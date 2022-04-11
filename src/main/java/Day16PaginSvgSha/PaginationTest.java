package Day16PaginSvgSha;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationTest {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		int pagecount=1;
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Bengaluru']")).size()>0) {
			selsect("Bengaluru");
            System.out.println("page number " +pagecount);
            break;
			}
			else {
				WebElement next =driver.findElement(By.id("tablepress-3_next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination over...");
					break;
				}
				next.click();
				pagecount++;
				
				
			}
		}
		
		
		
	}
	public static void selsect(String name) {
		driver.findElement(By.xpath("//td[text()='"+name+"']//preceding-sibling::td/input[@type='checkbox']")).click();
	}

}