package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserLaunch extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriver driver = getBrowser("chrome");
		getUrl("https://www.google.com/");
		

	}
	
}                        