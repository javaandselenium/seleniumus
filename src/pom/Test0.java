package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		//WebElement ele = driver.findElement(By.id("email"));
		Facebook f =new Facebook(driver);
	       driver.navigate().refresh();
	       Thread.sleep(5000);
	      // ele.sendKeys("admin");
	       f.emailAddresstb("admin");
	       f.passwordtextbox("gegfgftfhg");
	       f.loginbutton();
	
	
	}

}
