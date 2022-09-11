package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paytm {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/offer/psa/form");
		Thread.sleep(3000);
		
		WebElement nameTextbox = driver.findElement(By.xpath("//input[@id='nameField']"));
		nameTextbox.sendKeys("Harshada");
		
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Gender.click();
		
		WebElement State = driver.findElement(By.xpath("//select[@id='stateField']"));
		Select s= new Select(State);
		s.selectByValue("Maharashtra");
	
		WebElement City = driver.findElement(By.xpath("//input[@id='cityField']"));
		City.sendKeys("Pune");
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		
		
		driver.close();

	}

}
