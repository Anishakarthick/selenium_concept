package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//simple alert
	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Alert alt = driver.switchTo().alert();
	
	
	//Get string to alt_msg
	
	String alt_Msg=driver.switchTo().alert().getText();
	System.out.println(alt_Msg);
	alt.accept();
	Thread.sleep(3000);
	
	//Prompt Alert
	
	driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
	Alert alt2=driver.switchTo().alert();
	System.out.print(alt2);
	alt2.sendKeys("Practice");
	alt2.dismiss();
	Thread.sleep(3000);
	
}
}