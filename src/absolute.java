import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute {

	public static void main(String [] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// UPCASTING
		driver.get("https://www.green-technology.org/");
		

}
}
