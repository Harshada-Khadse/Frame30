package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://is.rediff.com/signup/register");
		WebElement fullname = driver.findElement(By.id("fullname"));
		WebElement email=driver.findElement(By.id("emailid"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement repass=driver.findElement(By.id("repass"));
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		FileInputStream file=new FileInputStream("C:\\Users\\khads\\eclipse-workspace\\Selenium\\Excel\\1details.xlsx");
		Sheet rediffsheet = WorkbookFactory.create(file).getSheet("Sheet1");
		fullname.sendKeys(rediffsheet.getRow(0).getCell(0).getStringCellValue());
		email.sendKeys(rediffsheet.getRow(0).getCell(1).getStringCellValue());
		pass.sendKeys(rediffsheet.getRow(1).getCell(0).getStringCellValue());
		repass.sendKeys(rediffsheet.getRow(1).getCell(1).getStringCellValue());
		
		
		WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='date_day']"));
		
		Select s=new Select(dayDropdown);
		s.selectByValue(rediffsheet.getRow(2).getCell(0).getStringCellValue());
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
