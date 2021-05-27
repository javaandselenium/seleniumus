package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailAddresstb(String email) {
		emailtb.sendKeys(email);
	}

}
