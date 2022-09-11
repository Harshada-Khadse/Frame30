package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\khads\\Desktop\\train ticket.pdf");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Press']")).click();
	Thread.sleep(3000);
	driver.close();
	}

}
