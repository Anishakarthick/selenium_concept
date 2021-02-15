package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();// UPCASTING
	driver.get("https://www.google.com/");
	WebElement send = driver.findElement(By.name("q"));
	send.sendKeys("sdsfs");
}
}
