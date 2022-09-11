package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	   driver.findElement(By.xpath("//input[@value='Sign in']"));
		Thread.sleep(3000);
		
//		//driver.switchTo().alert().accept();
		
		Alert alt=driver.switchTo().alert();
		System.out.println("Text present on alert="+alt.getText());
		
		alt.accept();
		
		
		driver.close();
	}

}
