package Practice;

import org.openqa.selenium.WebDriver;

public class BrowserLaunch extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) {

		getBrowser("chromedriver");
		getUrl("https://www.google.com/");
	}
}
