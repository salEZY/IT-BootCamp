package automationFramework;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;
import pageObjects.ClientsPage;
import utility.ExcelUtils;

public class ClientsTest {

	 	private static String pass = "PASS";
	    private static String failed = "FAILED";
	    public static void SetUpExcel(String path, String sheetName) throws Exception
	    {
	    	ExcelUtils.setExcelFile(path,sheetName);
	    }
	    
	public static String addNewClientTest(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String clientName = ExcelUtils.getCellData(1, 0);
		String contactName = ExcelUtils.getCellData(1, 1);
		String email = ExcelUtils.getCellData(1, 2);
		String registry = ExcelUtils.getCellData(1, 3);
		String country = ExcelUtils.getCellData(1, 4);
		String city = ExcelUtils.getCellData(1, 5);
		String street = ExcelUtils.getCellData(1, 6);
		String zip = ExcelUtils.getCellData(1, 7);
		String code = ExcelUtils.getCellData(1, 8);
		
		Thread.sleep(2000);
	    ClientsPage.setClients(driver);
	    Thread.sleep(2000);
	    ClientsPage.setNewClient(driver);
	    Thread.sleep(2000);
	    ClientsPage.setClientName(driver, clientName);
	    ClientsPage.setContactName(driver, contactName);
	    ClientsPage.setEmail(driver, email);
	    ClientsPage.setRegistry(driver, registry);
	    ClientsPage.setCountry(driver, country);
	    Thread.sleep(1000);
	    ClientsPage.setCity(driver, city);
	    Thread.sleep(1000);
	    ClientsPage.setStreet(driver, street);
	    ClientsPage.setZip(driver, zip);
	    Thread.sleep(1000);
	    ClientsPage.setCode(driver, code);
	    ClientsPage.setSaveClient(driver);
	    return pass;
		}
	
	public static String addNewClientNoName(WebDriver driver) throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		String clientName = ExcelUtils.getCellData(1, 0);
		String contactName = ExcelUtils.getCellData(1, 1);
		String email = ExcelUtils.getCellData(1, 2);
		String registry = ExcelUtils.getCellData(1, 3);
		String country = ExcelUtils.getCellData(1, 4);
		String city = ExcelUtils.getCellData(1, 5);
		String street = ExcelUtils.getCellData(1, 6);
		String zip = ExcelUtils.getCellData(1, 7);
		String code = ExcelUtils.getCellData(1, 8);

	    Thread.sleep(2000);
	    ClientsPage.setClients(driver);
	    ClientsPage.setNewClient(driver);
//	    ClientsPage.setClientName(driver, clientName);
	    Thread.sleep(1000);
	    ClientsPage.setContactName(driver, contactName);
	    Thread.sleep(1000);
	    ClientsPage.setEmail(driver, email);
	    Thread.sleep(1000);
	    ClientsPage.setRegistry(driver, registry);
	    Thread.sleep(1000);
	    ClientsPage.setCountry(driver, country);
	    Thread.sleep(1000);
	    ClientsPage.setCity(driver, city);
	    Thread.sleep(1000);
	    ClientsPage.setStreet(driver, street);
	    ClientsPage.setZip(driver, zip);
	    Thread.sleep(1000);
	    ClientsPage.setCode(driver, code);
	    ClientsPage.setSaveClient(driver);
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
