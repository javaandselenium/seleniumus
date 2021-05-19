package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(ele);
		 System.out.println(s.isMultiple());
		 
		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		
		for(WebElement b:op) {
			System.out.println(b.getText());
		}
		
		s.selectByIndex(4);
		
		s.selectByValue("2984");
	
		s.selectByVisibleText("Art");
		
		
		driver.close();

	}

}
