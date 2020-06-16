package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import com.relevantcodes.extentreports.LogStatus;

public class rescind_the_transaction extends CKM_PDL {
	public static void rescind_the_transaction() throws Exception {
		int lastrow = TestData.getLastRow("NewLoan");
	System.out.println("NewLoan " + lastrow);
	String sheetName = "NewLoan";
	for (int row = 2; row <= lastrow; row++) {
		String RegSSN = TestData.getCellData(sheetName, "SSN", row);
		String TenderType = TestData.getCellData(sheetName, "TenderType", row);
		if (SSN.equals(RegSSN)) {

			
			
			test.log(LogStatus.INFO, "void_the_transaction");

			//System.out.println(ProductID);
			//String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			//appUrl = AppURL;
			Login.Login(UserName, Password, StoreId);
			driver.switchTo().frame("topFrame");				
			driver.findElement(By.xpath("//*[@id=\'910000\']/a")).click();
			test.log(LogStatus.PASS, "Clicked on Loan Transactions");
			Thread.sleep(500);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\'911101\']/a")).click();
			test.log(LogStatus.PASS, "Clicked on Transaction");		
			driver.switchTo().frame("main");	
			Thread.sleep(1000);
			driver.findElement(By.name("requestBean.ssn")).sendKeys(SSN);
			test.log(LogStatus.PASS, "SSN entered as :" +SSN);
			Thread.sleep(2000);
			driver.findElement(By.name("submit")).click();
			test.log(LogStatus.PASS, "Click on submit Button");
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			driver.findElement(By.name("button")).click();
			test.log(LogStatus.PASS, "Click on Go Button");				
			Thread.sleep(5000);
		
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
			test.log(LogStatus.PASS, "Click on GO Button");
		
		
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			
			driver.findElement(By.name("transactionList")).sendKeys("rescind");
		

				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
				// driver.findElement(By.id("go_Button")).click();
			

			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
		

			driver.findElement(By.name("transactionDataBean.tenderTypeFirst")).sendKeys(TenderType);
			test.log(LogStatus.PASS, "Tender type entered as "+TenderType);
			String Pmt= driver.findElement(By.xpath(" /html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]")).getText();						
			System.out.println(Pmt);
			driver.findElement(By.name("transactionDataBean.tenderAmtFirst")).sendKeys(Pmt);
			test.log(LogStatus.PASS, "Tender Amt is entered as "+Pmt);
			driver.findElement(By.name("transactionDataBean.password")).sendKeys(Password);
			test.log(LogStatus.PASS, "Password is selected as "+Password);
			driver.findElement(By.name("Submit23")).click();
																							
			test.log(LogStatus.PASS, "Clicked on Finish Rescind Loan button ");
			
			try { 
				Alert alert = driver.switchTo().alert();
				alert.accept();

			}
			catch (NoAlertPresentException e) {
			}
			
			
			Robot robot = new Robot(); 
			robot.keyPress(KeyEvent.VK_ENTER);	
			Thread.sleep(2000);
			
			driver.findElement(By.name("checkyes")).click();
			test.log(LogStatus.PASS, "Rescind Loan is Completed Successfully ");
			
			
			

		}
	}
}





}