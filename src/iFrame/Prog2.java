package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.switchTo().frame("globalSqa");
		
		WebElement searchBar=driver.findElement(By.xpath("//input[@id='s']"));
		searchBar.sendKeys("Harshada");
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
