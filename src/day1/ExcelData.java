package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {

	
	@DataProvider(name="call")
	private String[][] logindata() throws BiffException, IOException {
	String[][] data = getExcelData();
	return data;
	}
	
	
	
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\ELCOT\\Desktop\\excel.xls");
				Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0); // index of the excel sheet name
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		String testData[][] = new String[rowCount - 1][columnCount]; // heading of the row is -1. username password
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				testData[i][j] = sheet.getCell(j, i).getContents();

				/*
				 * excel structure 0,0 = username to 1,0 = password 0,1 = admin1 to 1,1 =
				 * admin123 0,2=admin2 to 1,2=admin123
				 * 
				 * two dimansional array structure: 0,0 admin to o,1 admin123 1,0 admin to 1,1
				 * admin123 2,0 admin to 2,1 admin123
				 * 
				 */
			}
		}
		return testData;
	}
	
	
	@Test(dataProvider="call")
	private void loginpage(String user, String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SampleSelenium\\new Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// UPCASTING

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_d")).click();
	}
	
}
