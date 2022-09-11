package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
		searchBar.sendKeys("Seleni");
		Thread.sleep(2000);
		
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<autoSuggestion.size();i++)
		{
			System.out.println(autoSuggestion.get(i).getText());
		}
		for(int i=0;i<autoSuggestion.size();i++)
		{
			if(autoSuggestion.get(i).getText().equals("selenium ide"))
			{
				autoSuggestion.get(i).click();
				i=10;
			}
		}
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
