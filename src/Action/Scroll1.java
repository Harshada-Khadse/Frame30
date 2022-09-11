package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement contactInfoLink = driver.findElement(By.xpath("//h3[text()='Contact Info']"));
		Thread.sleep(2000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",contactInfoLink);
		
		Thread.sleep(3000);
		driver.close();
	

	}

}
