package Popup;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();	
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		String win[]=new String[10];
//		System.out.println("Total Windows=" +windows.size());
//		
		for(int i=0;i<windows.size();i++)
		{
			
			win[i]=itr.next();
			System.out.println(win[i]);
		}
		
		Thread.sleep(3000);
		driver.switchTo().window(win[0]);
		System.out.println("Window 0=" +driver.getTitle());
		driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(win[1]);
		System.out.println("Window 1=" +driver.getTitle());
		driver.close();

	}

}
