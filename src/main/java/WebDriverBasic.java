import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ujjvalpatel/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.quit();
	}

}





//System.setProperty("webdriver.chrome.driver", "/Users/ujjvalpatel/Downloads/chromedriver 2");
//WebDriver driver=new ChromeDriver();