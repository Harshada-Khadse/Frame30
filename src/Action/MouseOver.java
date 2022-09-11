package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		Actions a=new Actions(driver);
		a.moveToElement(aboutus).build().perform();
		
		WebElement carrerlink = driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
		carrerlink.click();
		
		
	
		
	}

}
