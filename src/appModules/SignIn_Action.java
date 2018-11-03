package appModules;

        import org.openqa.selenium.WebDriver;
        import pageObjects.BusinessPage;
        import pageObjects.ClientsPage;
        import pageObjects.InvoicesPage;
        import utility.ExcelUtils;

    // Now this method does not need any arguments

    public class SignIn_Action {

		public static void Execute(WebDriver driver) throws Exception{

			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

			String sUserName = ExcelUtils.getCellData(1, 1);

			String sPassword = ExcelUtils.getCellData(1, 2);

			InvoicesPage.returnEmail(driver).sendKeys(sUserName);

			InvoicesPage.returnPass(driver).sendKeys(sPassword);

			InvoicesPage.returnSignInBtn(driver).click();

        }

}