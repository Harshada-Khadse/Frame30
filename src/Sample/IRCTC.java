package Sample;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7666411125");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("harshada05@gmail.com");
		driver.findElement(By.xpath("//button[@class='continue-to-acc disabled-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='username-id']")).sendKeys("Harshada");
		driver.findElement(By.xpath("//input[@id='usr_pwd']")).sendKeys("harshada05");
		driver.findElement(By.xpath("//input[@name='confirm password']")).sendKeys("harshada05");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harshada Khadse");
		
		
		WebElement dropDown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
		Actions a=new Actions(driver);
		a.moveToElement(dropDown).click().build().perform();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(3000);
			a.sendKeys(Keys.DOWN).build().perform();
			
		}
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		WebElement country = driver.findElement(By.xpath("//button[text()='India']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(country).click().build().perform();
		for(int i=0;i<1;i++)
		{
			Thread.sleep(3000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		driver.close();

	}

}
