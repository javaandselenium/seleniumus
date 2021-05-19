package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("Mayas"));
       Select s=new Select(ele);
       
       System.out.println(s.isMultiple());
       
       s.selectByIndex(0);
       s.selectByValue("v");
       s.selectByVisibleText("chicken 65");
       Thread.sleep(2000);
       s.deselectByIndex(0);
       Thread.sleep(2000);
       s.deselectByValue("v");
       Thread.sleep(2000);
       s.deselectByVisibleText("chicken 65");
       Thread.sleep(2000);
       driver.close();
	}

}
