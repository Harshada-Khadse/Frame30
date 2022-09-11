package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement searchTextbox = driver.findElement(By.xpath("//input[@name='search_query']"));
		searchTextbox.sendKeys("Tom & Jerry");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Tom & Jerry | Tom & Jerry in Full Screen | Classic Cartoon Compilation | WB Kids']")).click();;
		
		Thread.sleep(3000);
		driver.close();

	}

}
