package Day20DatapickerAndPesudo;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Day15ReletiveLocatorJS.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pesudoElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		JavascriptException js1 = (JavascriptException)driver;
	String	script= "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";		
		
		//String text = js.executeScript(script).toString;
		
		
		
		
	}

}
