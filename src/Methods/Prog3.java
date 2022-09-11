package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		String expTitle="Rediff.com";
		String actualTitle=driver.getTitle();
		
		if(expTitle.equals(actualTitle)) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
				driver.close();
		
	}

}
