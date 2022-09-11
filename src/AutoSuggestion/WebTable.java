package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;
	public static void readSmallTable()
	{
	   driver.get("https://money.rediff.com/index.html");
	   List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
	   List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
	   System.out.println("Total Rows=" +row.size());
	   System.out.println("Total column="+column.size());
	   
	   for(int i=0;i<row.size();i++)
	   {
		   System.out.println(row.get(i).getText());
	   }
	   
	} 
	
	public static void readCompleteTable() throws Exception
	{
	driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
	driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
	Thread.sleep(2000);
	List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
	
	System.out.println("Total rows=" +row.size());
	System.out.println("Total column" +column.size());
	
	for(int i=0;i<row.size();i++)
	{
		System.out.println(row.get(i).getText());
	}
	}
     public static void main(String[] args) throws Exception{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     
     Thread.sleep(2000);
     readCompleteTable();
     driver.close();
	}
}

