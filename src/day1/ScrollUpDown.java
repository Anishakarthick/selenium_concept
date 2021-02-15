package day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	WebElement down= driver.findElement(By.xpath("//a[text()='Interest-Based Ads']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", down);
	
	Actions act=new Actions(driver);
	
	WebElement up = driver.findElement(By.xpath("//a[text()='Click here to go to amazon.in']"));
	js.executeScript("arguments[0].scrollIntoView();", up);
	act.contextClick(up).perform();
	
	Robot r2=new Robot();
	r2.keyPress(KeyEvent.VK_DOWN);
	r2.keyRelease(KeyEvent.VK_DOWN);
	r2.keyPress(KeyEvent.VK_ENTER);
	r2.keyRelease(KeyEvent.VK_ENTER);
	
	js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("window.scrollBy(0,-1000)");
	
	
}
}
