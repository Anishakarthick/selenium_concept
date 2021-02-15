package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologies.in/");
	WebElement name = driver.findElement(By.name("name"));
	name.sendKeys("Anisha");
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("sfsvsuofhs,s");
	WebElement pass= driver.findElement(By.xpath("(//input[@class='wpcf7-form-control wpcf7-text'])[3]"));
	pass.sendKeys("dsfsdfsf");
	
}
}
