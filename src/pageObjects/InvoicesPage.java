package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvoicesPage {
	private static WebElement ele;
	
	public static WebElement returnEmail(WebDriver driver) {
		ele = driver.findElement(By.id("login-form-email"));
		return ele;
	}
	
	public static WebElement returnPass(WebDriver driver) {
		ele = driver.findElement(By.id("login-pass"));
		return ele;
	}
	
	public static WebElement returnSignInBtn(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return ele;
	}
	

}

		
