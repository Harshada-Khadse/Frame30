package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru2 {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	WebElement first = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));
	WebElement second = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
	WebElement sale = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
	WebElement destAcc = driver.findElement(By.xpath("//ol[@id='bank']"));
	WebElement destAmt = driver.findElement(By.xpath("//ol[@id='amt7']"));
	WebElement loanAcc = driver.findElement(By.xpath("//ol[@id='loan']"));
	WebElement loanAmt = driver.findElement(By.xpath("//ol[@id='amt8']"));
	
	Actions a=new Actions(driver);
	a.moveToElement(first).clickAndHold().moveToElement(destAmt).release().build().perform();
	a.dragAndDrop(second, loanAmt).build().perform();
	a.dragAndDrop(bank, destAcc).build().perform();
	a.dragAndDrop(sale, loanAcc).build().perform();
	
	WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
	System.out.println(perfect.getText());
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
