package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		Dimension abc=new Dimension(500,300);
		driver.manage().window().setSize(abc);
		
		Thread.sleep(2000);
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.close();
	}

}
