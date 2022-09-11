package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog2 {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/explicit-wait");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//	WebElement clickMe = driver.findElement(By.xpath("//button[@id='alert']"));
//	clickMe.click();
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
	
//	WebElement changeText = driver.findElement(By.xpath("//button[@id='populate-text']"));
//	changeText.click();
//	WebElement labelText = driver.findElement(By.xpath("//h2[@id='h2']"));
//	wait.until(ExpectedConditions.textToBePresentInElement(labelText, "Selenium Webdriver"));
	
	
//	WebElement displayBtn = driver.findElement(By.xpath("//button[@id='display-other-button']"));
//	displayBtn.click();
//	WebElement hiddenBtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
//	wait.until(ExpectedConditions.elementToBeClickable(hiddenBtn));
	
//	WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enable-button']"));
//	enableBtn.click();
//	WebElement Button = driver.findElement(By.xpath("//button[text()='Button']"));
//	wait.until(ExpectedConditions.elementToBeClickable(Button));
	
	
	WebElement checkboxBtn = driver.findElement(By.xpath("//button[@id='checkbox']"));
	checkboxBtn.click();
	WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkBox));
	
//	Thread.sleep(2000);
//	driver.close();
	
	

	}

}
