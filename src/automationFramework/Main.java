package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import appModules.SignIn_Action;
import utility.Constant;
import utility.ExcelUtils;


public class Main {
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws Exception {
		String message = "";
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(Constant.URL);

        SignIn_Action.Execute(driver);
        Thread.sleep(2000);

        //TESTIRANJE BUSINESS-a
//        BusinessTest.SetUpExcel(Constant.Path_TestData + Constant.File_TestData, "Business");
//        message = BusinessTest.AddNewBusinessTest(driver);
//        ExcelUtils.setCellData(message, 1, 12);
//        System.out.println("Test has: "+message);
//        message = BusinessTest.AddNewBusinessWithoutNameTest(driver);
//        ExcelUtils.setCellData(message, 2, 12);
//        System.out.println("Test has: "+message);
        //TESTIRANJE CLIENT-a
        ClientsTest.SetUpExcel(Constant.Path_TestData + Constant.File_TestData, "Clients");
        ClientsTest.addNewClientTest(driver);
        ExcelUtils.setCellData(message, 1, 9);
        System.out.println("Test has: "+message);
        ClientsTest.addNewClientNoName(driver);
        ExcelUtils.setCellData(message, 1, 9);
        System.out.println("Test has: "+message);
        
        driver.close();
		driver.quit();
	}
	
}
