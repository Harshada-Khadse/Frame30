package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("https://www.google.com/");
		
		//driver.close();

	}

}
