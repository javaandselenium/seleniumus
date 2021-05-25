package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s=new Select(ele);
		s.selectByVisibleText("May");
		s.selectByIndex(5);
		
		ArrayList a=new ArrayList<>();
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement b:allOptions) {
			String text = b.getText();
			a.add(text);
			System.out.println(text);
		}
		
		Collections.sort(a);
		System.out.println("***********After sorting*********");
		for(Object ele1:a) {
			System.out.println(ele1);
		}
		driver.close();
	}

}
