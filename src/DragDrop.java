import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
		WebDriver drag=new ChromeDriver();
		drag.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(1000);
		drag.manage().window().maximize();
		WebElement single = drag.findElement(By.id("select-demo"));
		Select s=new Select(single);
		s.selectByValue("Tuesday");
		Thread.sleep(3000);
		WebElement multiselect = drag.findElement(By.id("multi-select"));
		Select s1=new Select(multiselect);
		s1.selectByVisibleText("New York");
		s1.selectByIndex(5);
		s1.selectByValue("ohio");
		Thread.sleep(1000);
		List<WebElement> all = s1.getOptions();
		
		for (WebElement x : all) {
			System.out.println(x.getText());
		}
		Thread.sleep(3000);
		WebElement btn = drag.findElement(By.id("printAll"));
		btn.click();
			}
}
