package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class globalSqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement image1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement image3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement image4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(image1).clickAndHold().moveToElement(dest).release().build().perform();
		a.dragAndDrop(image2, dest).build().perform();
		a.dragAndDrop(image3, dest).build().perform();
		a.dragAndDrop(image4, dest).build().perform();
	}

}
