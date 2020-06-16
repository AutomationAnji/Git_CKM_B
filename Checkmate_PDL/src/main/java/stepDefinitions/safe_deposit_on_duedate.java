package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.relevantcodes.extentreports.LogStatus;

public class safe_deposit_on_duedate extends CKM_PDL{
public static void safe_deposit_on_duedate() throws Exception {

		
	int lastrow = TestData.getLastRow("NewLoan");
	System.out.println("NewLoan " + lastrow);
	String sheetName = "NewLoan";
	for (int row = 2; row <= lastrow; row++) {
		String RegSSN = TestData.getCellData(sheetName, "SSN", row);
		String TenderType = TestData.getCellData(sheetName, "TenderType", row);
		if (SSN.equals(RegSSN)) {

			
			
			if(SSN.equals(RegSSN))
			{
				
				String NoOfDollarsAmount = TestData.getCellData(sheetName,"NoOfDollarsAmount",row);

				test.log(LogStatus.INFO, "Safe assign process initiated" );
				Login.Login(UserName, Password, StoreId);
				
				Thread.sleep(3000);
							
				driver.switchTo().frame("topFrame");

				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Cash Management')]")));

				driver.findElement(By.linkText("Cash Management")).click();			
				test.log(LogStatus.PASS, "Clicked on Cash Management");
				Thread.sleep(1500);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.findElement(By.linkText("Safe")).click();
				test.log(LogStatus.PASS, "Clicked on Safe");	
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Deposit")).click();

				test.log(LogStatus.PASS, "Clicked on Deposit");

		

				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
				driver.findElement(By.name("safeDepositRequestBean.abaCode")).sendKeys("Wells");
				test.log(LogStatus.PASS, "Selected the from the list Wells Fargo Bank");
				
				driver.findElement(By.name("safeDepositRequestBean.abaCode")).sendKeys("Wells");
				test.log(LogStatus.PASS, "Selected the from the list Wells Fargo Bank");
				
			
				Thread.sleep(2500);
				driver.findElement(By.name("safeDepositRequestBean.password")).sendKeys("1234");

				test.log(LogStatus.PASS, "Entered the Password: 1234");
				Thread.sleep(500);
				
				Thread.sleep(500);
				driver.findElement(By.name("finishdeposit")).click();
				test.log(LogStatus.PASS, "Clicked on Finish deposit");
				

			
					Thread.sleep(5000);
					

				try { 
					Alert alert = driver.switchTo().alert();
					alert.accept();
					//if alert present, accept and move on.														

				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.

				}
				Thread.sleep(3000);

				Thread.sleep(15000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
				String text = "";
				try {
					text=driver.findElement(By.xpath("//select[@name='dispRepresentmentType']/option")).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					 text=driver.findElement(By.xpath("//select[@name='pdlCollateralAchDepType']/option[2]")).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					 text=driver.findElement(By.xpath("//select[@name='collateralRcpoDepType']/option")).getText();
				} catch (Exception e) {
					// TODO: handle exception
				}
				test.log(LogStatus.PASS,"Safe depost is on "+text);
				
				try {
					driver.findElement(By.name("pdlCollateralChecks")).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					driver.findElement(By.name("pdlCollateralAch")).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					driver.findElement(By.name("pdlCollateralRcpo")).click();
				} catch (Exception e) {
					// TODO: handle exception
				}
			
				
				test.log(LogStatus.PASS,"Clicked on select check box ");
			//	driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[8]/td[7]/input")).click();
				
				
				if(driver.findElement(By.name("finishdeposit")).isDisplayed())
				{
					
					test.log(LogStatus.PASS,"Safe assigned successfully with over/short.");

				}
				else
				{
					test.log(LogStatus.FAIL,"Safe not assigned successfully with over/short.");
				}
				Thread.sleep(3000);
				try { 
					Alert alert = driver.switchTo().alert();
					alert.accept();
					//if alert present, accept and move on.														

				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.

				}
				Thread.sleep(15000);
				String amount=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]")).getText();
				
				///html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]
						  test.log(LogStatus.PASS,"Amount in the safe deposit is ."+amount);
				
						  driver.findElement(By.name("safeDepositRequestBean.password")).sendKeys("1234");

							test.log(LogStatus.PASS, "Entered the Password: 1234");
							
				driver.findElement(By.name("finishdeposit")).click();
				Thread.sleep(3000);
				try { 
					Alert alert = driver.switchTo().alert();
					alert.accept();
					//if alert present, accept and move on.														

				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.

				}
				Thread.sleep(3000);
				driver.findElement(By.name("finishdeposit")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='submit' and @value='Ok']")).click();
				
						
				
				break;
			}


		}}}}


	
