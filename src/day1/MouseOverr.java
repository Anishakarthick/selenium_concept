package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/");
	System.out.println("demoqa webpage Displayed");
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//Adding Waits
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
	//Initiate action class
	Actions act=new Actions(driver);
	
	//finding Music element
	WebElement music = driver.findElement(By.id("item-0"));
	music.click();
	
	WebElement list= driver.findElement(By.id("demo-tab-list"));
	act.moveToElement(list).perform();
	System.out.println("Done Mouse Hover on");
	
	
}
}
