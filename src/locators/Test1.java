package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.linkText("Forgotten password?")).click();

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jhhjaj");
		driver.findElement(By.partialLinkText("password?")).click();
	}

}
