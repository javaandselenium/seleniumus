package waitingStaements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("username"));
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
		
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
		w.until(ExpectedConditions.elementToBeClickable(btn)).click();
		
		
		String t = driver.getTitle();
		w.until(ExpectedConditions.titleIs(t));
		System.out.println(t);
		if(t.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
