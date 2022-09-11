package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		System.out.println("Total Links=" +elements.size());
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		
		System.out.println("Title of original page=" +driver.getTitle());
		Thread.sleep(2000);
		for(int i=0;i<elements.size();i++)
		{
			String exp="Gmail";
			String act=elements.get(i).getText();
			if(exp.equals(act))
			{
				elements.get(i).click();
			}
			break;
					
		}
		System.out.println("Title of switched page=" +driver.getTitle());
		Thread.sleep(5000);
		driver.close();

	}

}
