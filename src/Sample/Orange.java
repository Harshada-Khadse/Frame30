package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		 List<WebElement> checkBox = driver.findElements(By.xpath("//input[@id='ohrmList_chkSelectRecord_62']"));
		 
		Thread.sleep(3000);
		driver.close();
	}
}

	


