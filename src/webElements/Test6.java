package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("email"));
		if(ele.isDisplayed()) {
			System.out.println("Element is dispalyed");
			ele.sendKeys("ttyftaagaga");
		}
		else
		{
			System.out.println("element is not dispalyed");
		}
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(ele1.isEnabled()) {
			System.out.println("Element is enabled");
			ele1.click();
		}
		else
		{
			System.out.println("Element is not enabled");
		}
		
		WebElement ele2 = driver.findElement(By.name("sex"));
		if(ele2.isSelected()) {
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}

	}

}
