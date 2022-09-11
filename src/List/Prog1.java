package List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khads\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		
		WebElement chooseCar = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s=new Select(chooseCar);
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		s.selectByVisibleText("Audi");
		
		System.out.println("All selected option are:");
		List<WebElement> selectedOption = s.getAllSelectedOptions();
		for(WebElement ele:selectedOption)
		{
			System.out.println(ele.getText()+ " ");
		}
			//check list is multiple or not
			boolean a=s.isMultiple();
			System.out.println("Is list box is multi selectable="+a);
			
			//System.out.println(s.isMultiple());
			
			//De-selecting one value from list box
			s.deselectByVisibleText("Saab");
		}
		

	}


