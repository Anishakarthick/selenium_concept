package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver hdfc = new ChromeDriver();// UPCASTING
	hdfc.get("https://netbanking.hdfcbank.com/netbanking/");	
	hdfc.manage().window().maximize();
	
	hdfc.switchTo().frame(0);
	Thread.sleep(3000);
	
	WebElement element = hdfc.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("3424232434");
	Thread.sleep(3000);
	
	hdfc.close();
}
}
