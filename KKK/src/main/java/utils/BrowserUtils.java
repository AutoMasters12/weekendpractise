package utils;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static stepdefinition.Flights.*;

public class BrowserUtils {

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}

	public static void launchApp() {
		driver.manage().window().maximize();
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		
	}

}
