package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class guru1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a=new Actions(driver);
//		a.moveToElement(rightClick).contextClick().build().perform();
//		a.sendKeys(Keys.DOWN).build().perform();
//		a.sendKeys(Keys.DOWN).build().perform();
//		a.sendKeys(Keys.DOWN).build().perform();
		
		a.moveToElement(doubleClick).doubleClick().build().perform();
	}

}
