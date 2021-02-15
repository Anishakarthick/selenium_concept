package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sendkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// UPCASTING
		driver.get(" ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		WebElement fName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fName.sendKeys("Anisha");

		WebElement pass = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		pass.sendKeys("Karthi");

		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("dfsofisfsfskfbsjf s dfsnfjsiufs dskdfsbfsiufsjufksjfgsfjsnfu");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("aniradhai@gmail.com");
		

		WebElement phone_no = driver.findElement(By.xpath("//input[@type='tel']"));
		phone_no.sendKeys("9042264437");
		

		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement element : radio) {
			if (element.isSelected()) {
				System.out.println("This is Already Selected");
			} else {
				element.click();
			}
		}
			
		List<WebElement> check_Box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement element : check_Box) {
			if (element.isSelected()) {
				System.out.println("This is already Selected");
			} else {
				element.click();
			}
		}
		
		/*
		Select s_multiple=new Select(driver.findElement(By.id("msdd")));
		s_multiple.selectByVisibleText("Arabic");
		s_multiple.selectByIndex(3);
		s_multiple.selectByIndex(4); */
		
		
		
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s=new Select(skills);
		s.selectByIndex(3);
		s.selectByIndex(4);
		
	
		
		/*List<WebElement> options = s.getOptions();
		for (WebElement element : options) {
			System.out.println(element.getText());
		}*/
		
		driver.close();
	}
}








