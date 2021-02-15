package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
	WebDriver web_Table = new ChromeDriver();// UPCASTING
	web_Table.get("https://www.w3schools.com/html/html_tables.asp");	
	web_Table.manage().window().maximize();
	
	System.out.println("-----------All Data---------------");
	List<WebElement> all_Data = web_Table.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	for (WebElement data : all_Data) {
		System.out.println(data.getText());	
	}
	
	System.out.println("---------particular Row---------------");
	List<WebElement> par_row = web_Table.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
	for (WebElement  data  : par_row) {
		System.out.println(data.getText());
	}

	System.out.println("---------particular Col---------------");
	List<WebElement> par_Col = web_Table.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	for (WebElement  data  : par_Col) {
		System.out.println(data.getText());
	}
	
	System.out.println("---------particular Data---------------");
	WebElement par_data = web_Table.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println(par_data.getText());
	
		//column counts
	System.out.println("---------particular Col---------------");
		List<WebElement> column = web_Table.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println(column.size());
		for (WebElement  data  : column) {
			System.out.println(data.getText());
		}
		//column rows
		System.out.println("---------particular rows---------------");
			List<WebElement> row = web_Table.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			System.out.println(row.size());
			for (WebElement  data  : row) {
				System.out.println(data.getText());
			}
}
}
