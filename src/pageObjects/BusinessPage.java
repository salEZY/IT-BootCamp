package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {
	private static WebElement ele;
	private static String nameMissingMessage = "The name field is required.";
	
	public static WebElement getBusiness(WebDriver driver) {
		ele = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		return ele;
	}
	public static void setBusiness(WebDriver driver) {
		getBusiness(driver).click();
	}
	
	public static WebElement addNewBusiness(WebDriver driver) {
		ele = driver.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
		return ele;
	}
	public static void setNewBusiness(WebDriver driver) {
		addNewBusiness(driver).click();		
	}
	
	public static WebElement name(WebDriver driver) {
		ele = driver.findElement(By.id("business-form-name"));
		return ele;
	}
	public static void setName(WebDriver driver, String formName) {
		name(driver).sendKeys(formName);		
	}
	private static WebElement getCountries(WebDriver driver) {
		ele = driver.findElement(By.id("business-form-country"));
		return ele;
	}
	
	public static void SetCountry(WebDriver driver, String countryName) throws InterruptedException
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
		ele = driver.findElement(By.id("business-form-city"));
		return ele;
	}
	public static void setCity(WebDriver driver, String formCity) {
		city(driver).sendKeys(formCity);		
	}
	public static WebElement street(WebDriver driver) {
		ele = driver.findElement(By.id("business-form-street"));
		return ele;
	}
	public static void setStreet(WebDriver driver, String formStreet) {
		street(driver).sendKeys(formStreet);		
	}
	public static WebElement zip(WebDriver driver) {
		ele = driver.findElement(By.id("business-form-zip"));
		return ele;
	}
	public static void setZip(WebDriver driver, String formZip) {
		zip(driver).sendKeys(formZip);		
	}
	public static WebElement registry(WebDriver driver) {
		ele = driver.findElement(By.id("business-form-reg-num"));
		return ele;
	}
	public static void setRegistry(WebDriver driver, String formRegistry) {
		registry(driver).sendKeys(formRegistry);		
	}
	public static WebElement addBankAccount(WebDriver driver) {
		ele = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return ele;
	}
	public static void setBankAccount(WebDriver driver) {
		addBankAccount(driver).click();
	}
	public static WebElement bankName(WebDriver driver) {
		ele = driver.findElement(By.id("bank-dialog-name"));
		return ele;
	}
	public static void setBankName(WebDriver driver, String bankName) {
		bankName(driver).sendKeys(bankName);		
	}
	public static WebElement accNumber(WebDriver driver) {
		ele = driver.findElement(By.id("bank-dialog-num"));
		return ele;
	}
	public static void setAccNumber(WebDriver driver, String accNumber) {
		accNumber(driver).sendKeys(accNumber);		
	}
	public static WebElement swiftNumber(WebDriver driver) {
		ele = driver.findElement(By.id("bank-dialog-swf-num"));
		return ele;
	}
	public static void setSwiftNumber(WebDriver driver, String swiftNumber) {
		swiftNumber(driver).sendKeys(swiftNumber);		
	}
	public static WebElement paymentInstructions(WebDriver driver) {
		ele = driver.findElement(By.id("bank-dialog-pay-inst"));
		return ele;
	}
	public static void setPaymentInstructions(WebDriver driver, String paymentInstructions) {
		paymentInstructions(driver).sendKeys(paymentInstructions);		
	}
	public static WebElement currency(WebDriver driver) {
		ele = driver.findElement(By.id("//div[@class='v-select__selections']"));
		return ele;
	}

	
	public static WebElement createBankAcc(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return ele;
	}
	public static void setBankAcc(WebDriver driver) {
		createBankAcc(driver).click();
	}
	public static WebElement getSaveAcc(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return ele;
	}
	public static void setSaveAcc(WebDriver driver) {
		getSaveAcc(driver).click();
	}
	
	public static WebElement getNameMissingMesage(WebDriver driver)
	{
		ele = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
		return ele;
	}
	public static boolean CheckNameMissingMessage(WebDriver driver)
	{
		String message = getNameMissingMesage(driver).getText();
		if (message.equals(nameMissingMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ele = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return ele;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void SetCurrency(WebDriver driver, String currencyName) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyName)) {
                e.click();
            }
        }
    }
}


