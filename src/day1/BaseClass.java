package day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid");
			}
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}

	public static WebDriver getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}

	public static void clickOnWebElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}