package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog1 {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.switchTo().frame("iframeResult");
	WebElement carDropdown=driver.findElement(By.id("cars"));
	Select s=new Select(carDropdown);
	s.selectByVisibleText("Volvo");
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	driver.close();

	}

}
