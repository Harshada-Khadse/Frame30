package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		 WebElement nameTextbox = driver.findElement(By.name("fullname"));
		 nameTextbox.sendKeys("Harshada Khadse");
		 
		 WebElement emailTextbox = driver.findElement(By.id("emailid"));
		 emailTextbox.sendKeys("harshadao5@gmail.com");
		 
		 WebElement passTextbox = driver.findElement(By.id("pass"));
		 passTextbox.sendKeys("harshada005");
		 
		 
		 WebElement repassTextbox = driver.findElement(By.id("repass"));
		 repassTextbox.sendKeys("harshada005");
		 
		 driver.findElement(By.xpath("//input[@value='f']")).click();
		 
		 WebElement dayDropdown=driver.findElement(By.xpath("//select[@name='date_day']"));
		 Thread.sleep(3000);
		 Select s=new Select(dayDropdown);
		 s.selectByValue("10");
		 
		 WebElement monthDropdown=driver.findElement(By.xpath("//select[@name='date_mon']"));
		 Thread.sleep(3000);
		 Select s1=new Select(monthDropdown);
		 s1.selectByValue("10");
		 
		 WebElement yearDropdown=driver.findElement(By.xpath("//select[@name='Date_Year']"));
		 Thread.sleep(3000);
		 Select s3=new Select(yearDropdown);
		 s3.selectByValue("1998");
		 
		
		 
		
		 
		 WebElement location=driver.findElement(By.id("signup_city"));
		 location.sendKeys("Bhusawal");
		 
		 WebElement school=driver.findElement(By.id("school"));
		 school.sendKeys("K.Narkhede");
		 
		 
		 WebElement college=driver.findElement(By.id("college"));
		 college.sendKeys("D.Y.Patil");
		  
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
