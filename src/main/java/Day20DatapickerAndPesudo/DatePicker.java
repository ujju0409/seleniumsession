package Day20DatapickerAndPesudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
  static WebDriver driver;
  
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		 
		 
		  driver.findElement(By.id("datepicker")).click();
		  
		//  selectdate("18");
		  
	
		  selectFutureDate("March 2023", "18");
		  
	}

	public static void selectFutureDate(String Expectedmonthyear, String datenum) {
		if(Integer.parseInt(datenum)>31) {
			System.out.println("please enter valid date ");
		}
		if (Expectedmonthyear.equalsIgnoreCase("february") && Integer.parseInt(datenum)>29) {
			System.out.println("plsese enter valid date ");
		}
		
	String  actualmonthyeaar =driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actualmonthyeaar );
		
		while(!actualmonthyeaar.equals(Expectedmonthyear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actualmonthyeaar =driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			
		}
		
		selectdate(datenum);
		
		
		
		
		
	}
	
	
	
	 public static void selectdate(String datenumber) {
		driver.findElement(By.xpath("//a[text()='"+datenumber+"']")).click();
		
	 }
	
}
