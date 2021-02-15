package day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//Mouse --> Actions used both mouse and keyboard
		Actions ac = new Actions(driver);
		WebElement best_Seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		ac.contextClick(best_Seller).perform();
		Thread.sleep(3000);

	//Robot --> Robot mainly used Keyboard
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.contextClick(mobiles).perform();
		Thread.sleep(3000);
		 
		Robot rt1 = new Robot();
		rt1.keyPress(KeyEvent.VK_DOWN);
		rt1.keyRelease(KeyEvent.VK_DOWN);
		rt1.keyPress(KeyEvent.VK_ENTER);
		rt1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
			
		WebElement today = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(today).perform();
		Thread.sleep(3000);
		
		Robot rt3 = new Robot();
		rt3.keyPress(KeyEvent.VK_DOWN);
		rt3.keyRelease(KeyEvent.VK_DOWN);
		rt3.keyPress(KeyEvent.VK_ENTER);
		rt3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement sign = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		ac.contextClick(sign).perform();
		Thread.sleep(3000);
		
		Robot rt4 = new Robot();
		rt4.keyPress(KeyEvent.VK_DOWN);
		rt4.keyRelease(KeyEvent.VK_DOWN);
		rt4.keyPress(KeyEvent.VK_ENTER);
		rt4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		//Windows Handle
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		String title = driver.switchTo().window(pid).getTitle();
		System.out.println(title);
		
		//Windows Handles
		Set<String> all_Id = driver.getWindowHandles();
		System.out.println(all_Id);
		for (String id : all_Id) {
		if(driver.switchTo().window(id).getTitle().equals("Amazon Sign in")) {
		driver.findElement(By.xpath("//input[@type='email']"));	
		System.out.println("abc@gmail.com");
		break; // terminate the loop
		}
		}
	}}	

	