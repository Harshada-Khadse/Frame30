package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		//BY ID
		WebElement nameTextbox=driver.findElement(By.id("fullname"));
		nameTextbox.sendKeys("Harshada");
		
		//By Tagname
		WebElement emailText=driver.findElement(By.tagName("input"));
		emailText.sendKeys("harshada05");
		
		//By Link
		WebElement InvestorInformation=driver.findElement(By.linkText("Investor Information"));
		InvestorInformation.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
