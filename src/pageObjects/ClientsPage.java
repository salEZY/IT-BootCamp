package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {
	private static WebElement ele;
	
	public static WebElement returnClients(WebDriver driver) {
		ele = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		return ele;
	}
	public static void setClients(WebDriver driver) {
		returnClients(driver).click();
	}
	
	public static WebElement addNewClient(WebDriver driver) {
		ele = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return ele;
	}
	public static void setNewClient(WebDriver driver) {
		addNewClient(driver).click();		
	}
	public static WebElement clientName(WebDriver driver) {
		ele = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return ele;
	}
	public static void setClientName(WebDriver driver, String clientName) {
		clientName(driver).sendKeys(clientName);		
	}
	public static WebElement contactName(WebDriver driver) {
		ele = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return ele;
	}
	public static void setContactName(WebDriver driver, String contactName) {
		contactName(driver).sendKeys(contactName);		
	}
	public static WebElement email(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return ele;
	}
	public static void setEmail(WebDriver driver, String email) {
		email(driver).sendKeys(email);		
	}
	public static WebElement registry(WebDriver driver) {
		ele = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return ele;
	}
	public static void setRegistry(WebDriver driver, String registry) {
		registry(driver).sendKeys(registry);		
	}
	private static WebElement getCountries(WebDriver driver) {
	    WebElement bizCountry = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
	    return bizCountry;
	}
	
	public static void setCountry(WebDriver driver, String countryName) throws InterruptedException
    {
    Actions builder = new Actions(driver);
    Actions country = builder
    .moveToElement(getCountries(driver))
    .click()
    .sendKeys(countryName);
    country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
    country.perform();
    }
    
	public static WebElement city(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return ele;
	}
	public static void setCity(WebDriver driver, String city) {
		city(driver).sendKeys(city);		
	}
	public static WebElement street(WebDriver driver) {
		ele = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return ele;
	}
	public static void setStreet(WebDriver driver, String street) {
		street(driver).sendKeys(street);		
	}
	public static WebElement zip(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return ele;
	}
	public static void setZip(WebDriver driver, String zip) {
		zip(driver).sendKeys(zip);		
	}
	public static WebElement code(WebDriver driver) {
		ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		return ele;
	}
	public static void setCode(WebDriver driver, String code) {
		code(driver).sendKeys(code);		
	}
	public static WebElement saveClient(WebDriver driver) {
		ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]/div[1]"));
		return ele;
	}
	public static void setSaveClient(WebDriver driver) {
		saveClient(driver).click();
	}
	
}
