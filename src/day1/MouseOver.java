package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver place_Order = new ChromeDriver();// UPCASTING
	place_Order.get("http://automationpractice.com/index.php");
	place_Order.manage().window().maximize();
	place_Order.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	place_Order.findElement(By.xpath("//a[@class='login']")).click();
	place_Order.findElement(By.xpath("//input[@id='email']")).sendKeys("aniradhai@gmail.com");
	place_Order.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Anisha@0110");
	place_Order.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	place_Order.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	
	WebElement women = place_Order.findElement(By.xpath("//a[text()='Women']"));
	Actions ac = new Actions(place_Order);
	ac.moveToElement(women).perform();
	Thread.sleep(3000);
	
	WebElement t_Shirts = place_Order.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
	ac.moveToElement(t_Shirts).perform();
	ac.click(t_Shirts).perform();
	
	WebElement add_cart = place_Order.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
	JavascriptExecutor js=(JavascriptExecutor) place_Order;
	js.executeScript("arguments[0].click();", add_cart);
	Thread.sleep(2000);
	
	place_Order.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	place_Order.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	place_Order.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	place_Order.findElement(By.xpath("//div[@id='uniform-cgv']")).click();
	place_Order.findElement(By.xpath("//button[@name='processCarrier']")).click();
	place_Order.findElement(By.xpath("//a[@class='cheque']")).click();
	place_Order.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
}
}
