package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		String t = driver.getTitle();
		System.out.println(t);
//		if(t.equals("actiTIME - Login")) {
//			System.out.println("Pass:home page is dispalyed");
//		}
//		else
//		{
//			System.out.println("Fail:home page is not dispalyed");
//		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
