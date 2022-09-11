package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a=new Actions(driver);
		a.moveToElement(loginBtn).build().perform();
		 WebElement giftCardLink = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		 giftCardLink.click();
		
		
	}
	

}
