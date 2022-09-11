package Sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchTextbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchTextbox.sendKeys("Amazon");
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@role='button']")).click();
		 driver.findElement(By.xpath("//span[text()='Shop Online on Amazon - Get the best deals on Amazon']")).click();
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch for girl");
		 
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 
		 
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\khads\\eclipse-workspace\\Selenium\\Screenshot");
	FileHandler.copy(source, destination);
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
