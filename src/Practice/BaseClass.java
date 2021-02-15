package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chromedriver")) {
				System.setProperty("webdriver.driver.chrome",
						"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.driver.gecko",
						"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid BrowserName");
			}
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

	public static void inputToElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickToElement(WebElement element) {
		element.click();
	}

	public static void currentUrl() {
		driver.getCurrentUrl();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void getText(WebElement element) {
		element.getText();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void selectDropDown(WebElement element, String Option, String value) {
		try {
			Select s = new Select(element);
			if (Option.equals("byIndex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void actionMethod(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void robotClass() throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void frame() {
		driver.switchTo().frame(0);
	}
}
