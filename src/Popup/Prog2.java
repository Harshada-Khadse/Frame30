package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		
//		Alert a=driver.switchTo().alert();
//		Thread.sleep(3000);
//		System.out.println(a.getText());
//		a.accept();
//		
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Alert b=driver.switchTo().alert();
//		System.out.println(b.getText());
//		b.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Alert c=driver.switchTo().alert();
		System.out.println(c.getText());
		c.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		c.dismiss();
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
