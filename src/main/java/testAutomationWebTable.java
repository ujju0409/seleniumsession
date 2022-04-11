import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testAutomationWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText());
		for(int i=2; i<=7;i++) {
			String priceOf=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]")).getText();
			System.out.println(priceOf);
			int price= Integer.parseInt(priceOf);
			sum=sum+price;
		}
		System.out.println("total sum"+sum);
	//String 	beforexpath= "//div[1]/table/tbody/tr[";
	//	String afterXpath= "]/td[4]";
		
	Thread.sleep(5000);
		
		/*for(int i=1;i<=7;i++) {
			//String  xapth =	beforexpath+i+afterXpath;
			//.args..out.println(xapth);
			String text =driver.findElement(By.xpath("//table[@name='BookTable'//]/tbody/tr["+i+"]/td[4]")).getText();
			System.out.println(text);
			*/
			 
		//}
		
	}

}
