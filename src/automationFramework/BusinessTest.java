package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;
import utility.ExcelUtils;

public class BusinessTest {

    private static String pass = "PASS";
    private static String failed = "FAILED";
    public static void SetUpExcel(String path, String sheetName) throws Exception
    {
    	ExcelUtils.setExcelFile(path,sheetName);
    }
	public static String AddNewBusinessTest(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
		String name = ExcelUtils.getCellData(1, 0);
		String country = ExcelUtils.getCellData(1, 1);
		String city = ExcelUtils.getCellData(1, 2);
		String street = ExcelUtils.getCellData(1, 3);
		String zip = ExcelUtils.getCellData(1, 4);
		String registry = ExcelUtils.getCellData(1, 5);
		String bankName = ExcelUtils.getCellData(1, 6);
		String accNumber = ExcelUtils.getCellData(1, 7);
		String swift = ExcelUtils.getCellData(1, 8);
		String payment = ExcelUtils.getCellData(1, 9);
		String currency = ExcelUtils.getCellData(1, 10);
	    Thread.sleep(2000);
		
	    
	    BusinessPage.setBusiness(driver);
	    Thread.sleep(2000);
        BusinessPage.setNewBusiness(driver);
		BusinessPage.setName(driver, name);
		BusinessPage.SetCountry(driver, country);
		BusinessPage.setCity(driver, city);
		BusinessPage.setStreet(driver, street);
		BusinessPage.setZip(driver, zip);
		BusinessPage.setRegistry(driver, registry);
		BusinessPage.setBankAccount(driver);
		BusinessPage.setBankName(driver, bankName);
		BusinessPage.setAccNumber(driver, accNumber);
		BusinessPage.setSwiftNumber(driver, swift);
		BusinessPage.setPaymentInstructions(driver, payment);
		BusinessPage.SetCurrency(driver, currency);
		BusinessPage.setBankAcc(driver);
		BusinessPage.setSaveAcc(driver);
		return pass;
		}
	public static String AddNewBusinessWithoutNameTest(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  
//		String name = ExcelUtils.getCellData(1, 0);
		String country = ExcelUtils.getCellData(1, 1);
		String city = ExcelUtils.getCellData(1, 2);
		String street = ExcelUtils.getCellData(1, 3);
		String zip = ExcelUtils.getCellData(1, 4);
		String registry = ExcelUtils.getCellData(1, 5);
		String bankName = ExcelUtils.getCellData(1, 6);
		String accNumber = ExcelUtils.getCellData(1, 7);
		String swift = ExcelUtils.getCellData(1, 8);
		String payment = ExcelUtils.getCellData(1, 9);
		String currency = ExcelUtils.getCellData(1, 10);
	    Thread.sleep(2000);
		
	    
	    BusinessPage.setBusiness(driver);
	    Thread.sleep(2000);
        BusinessPage.setNewBusiness(driver);
		//BusinessPage.setName(driver, name);
        Thread.sleep(2000);
		BusinessPage.SetCountry(driver, country);
		Thread.sleep(2000);
		BusinessPage.setCity(driver, city);
		Thread.sleep(2000);
		BusinessPage.setStreet(driver, street);
		Thread.sleep(2000);
		BusinessPage.setZip(driver, zip);
		Thread.sleep(2000);
		BusinessPage.setRegistry(driver, registry);
		Thread.sleep(2000);
		BusinessPage.setBankAccount(driver);
		Thread.sleep(2000);
		BusinessPage.setBankName(driver, bankName);
		Thread.sleep(2000);
		BusinessPage.setAccNumber(driver, accNumber);
		Thread.sleep(2000);
		BusinessPage.setSwiftNumber(driver, swift);
		Thread.sleep(2000);
		BusinessPage.setPaymentInstructions(driver, payment);
		Thread.sleep(2000);
		BusinessPage.SetCurrency(driver, currency);
		Thread.sleep(2000);
		BusinessPage.setBankAcc(driver);
		Thread.sleep(2000);
		BusinessPage.setSaveAcc(driver);
		boolean trueForPass = BusinessPage.CheckNameMissingMessage(driver);
		if(trueForPass)
		{
			return pass;
		}
		else {
			return failed;
		}
		}
}
