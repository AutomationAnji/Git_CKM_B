package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver;

public class void_the_transaction extends CKM_PDL{
public static void void_the_transaction() throws Exception {

		
	int lastrow = TestData.getLastRow("NewLoan");
	System.out.println("NewLoan " + lastrow);
	String sheetName = "NewLoan";
	for (int row = 2; row <= lastrow; row++) {
		String RegSSN = TestData.getCellData(sheetName, "SSN", row);
		String TenderType = TestData.getCellData(sheetName, "TenderType", row);
		String Secretcode = TestData.getCellData(sheetName, "Secretcode", row);
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
			
			driver.findElement(By.name("transactionList")).sendKeys("Void");
		

				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
				// driver.findElement(By.id("go_Button")).click();
			

			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			
			
			String TenderType2 = TestData.getCellData(sheetName,"TenderType2",row);
			String amt = null;
			
if(TenderType2.equals("Cash"))



				
			{	
					
					
				driver.findElement(By.name("transactionDataBean.tenderTypeFirst")).sendKeys(TenderType2);
				test.log(LogStatus.PASS, "Tender Type is selected as "+TenderType2);
				
				 amt=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/b")).getText();
				String	amt1[]=amt.split(" ");	
				amt=amt1[1];
				}
			
if(TenderType2.equals("Original Tender"))	



{	
	
	
driver.findElement(By.name("transactionDataBean.tenderTypeFirst")).sendKeys(TenderType2);
test.log(LogStatus.PASS, "Tender Type is selected as "+TenderType2);
						
}
			
		

			
			
			
			
			
		/*	if(TenderType.equalsIgnoreCase("DEBIT CARD"))
			{
			
			driver.findElement(By.name("crditNbrFirst")).sendKeys("INSTANt TRAN");
			test.log(LogStatus.PASS, "Selected card as "+"INSTANT TRAN");
			}
			
		*/	
driver.findElement(By.name("transactionDataBean.tenderAmtFirst")).sendKeys(amt);

test.log(LogStatus.PASS, "Entered the amount ");

driver.findElement(By.name("transactionDataBean.encryptionKey")).sendKeys(Secretcode);
			test.log(LogStatus.PASS, "Secret code entered as "+ Secretcode);
			
			driver.findElement(By.name("transactionDataBean.password")).sendKeys(Password);
			test.log(LogStatus.PASS, "Password is selected as "+Password);
			Thread.sleep(1000);
			
			driver.findElement(By.name("Submit23")).click();
			Thread.sleep(2000);

																							
			test.log(LogStatus.PASS, "Clicked on Finish Void Loan button ");
			try { 
				Alert alert = driver.switchTo().alert();
				alert.accept();

			}
			catch (NoAlertPresentException e) {
			}
			
			Thread.sleep(1000);
			try { 
				Alert alert = driver.switchTo().alert();
				alert.accept();

			}
			catch (NoAlertPresentException e) {
			}
			
			Robot robot = new Robot(); 
			robot.keyPress(KeyEvent.VK_ENTER);	
			
			
			
			Thread.sleep(2000);
			try { 
				Alert alert = driver.switchTo().alert();
				alert.accept();

			}
			catch (NoAlertPresentException e) {
			}
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			driver.switchTo().frame("main");
			
			
			if(driver.findElement(By.name("checkno")).isDisplayed())
			{
				test.log(LogStatus.PASS, "Void Loan is Completed Successfully ");
				
				driver.findElement(By.name("checkno")).click();
			}
			else
			{
				test.log(LogStatus.FAIL, "Void  Loan is not Completed Successfully ");
			}
		
		

			

		}
	}

	
	
}
}