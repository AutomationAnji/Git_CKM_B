package pack;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class PayAnyAmt_Installments_FL_ILP extends AA_CO_ILP{

	public static void PayAnyAmt_Installments_FL_ILP(String SSN, String FileName,String Amt) throws Exception {

		//Excel TestData = new Excel(System.getProperty("user.dir") + "/TestData/FL_ILP/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		System.out.println("NewLoan " + lastrow);
		String sheetName = "NewLoan";
		for (int row = 2; row <= lastrow; row++) {
			String RegSSN = TestData.getCellData(sheetName, "SSN", row);
			if (SSN.equals(RegSSN)) {
				String TxnType = TestData.getCellData(sheetName, "TxnType", row);
				String DisbType = TestData.getCellData(sheetName, "TenderType", row);
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				//String UserName = TestData.getCellData(sheetName, "UserName", row);
				//String Password = TestData.getCellData(sheetName, "Password", row);
				String TenderType = TestData.getCellData(sheetName, "Tender_Type", row);
				// System.out.println(Password);
				//String StoreId = TestData.getCellData(sheetName, "StoreID", row);
				String SSN1 = SSN.substring(0, 3);
				String SSN2 = SSN.substring(3, 5);
				String SSN3 = SSN.substring(5, 9);
				Thread.sleep(4000);
			
				Login.Login(UserName, Password, StoreId);
				driver.switchTo().defaultContent();
				WebDriverWait wait = new WebDriverWait(driver, 100);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("topFrame")));
				driver.switchTo().frame("topFrame");
				test.log(LogStatus.INFO, "Closure Transaction with-SSN: " + SSN + " :: is Starts");
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='910000']")));
				driver.findElement(By.cssSelector("li[id='910000']")).click();
				test.log(LogStatus.PASS, "Clicked on Loan Transactions");
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("li[id='911101']")).click();
				test.log(LogStatus.PASS, "Clicked on Transactions");
				driver.switchTo().frame("main");
				driver.findElement(By.name("ssn1")).sendKeys(SSN1);
				test.log(LogStatus.PASS, "SSN1 is entered: " + SSN1);
				driver.findElement(By.name("ssn2")).sendKeys(SSN2);
				test.log(LogStatus.PASS, "SSN2 is entered: " + SSN2);
				driver.findElement(By.name("ssn3")).sendKeys(SSN3);
				test.log(LogStatus.PASS, "SSN3 is entered: " + SSN3);
				driver.findElement(By.name("submit1")).click();
				test.log(LogStatus.PASS, "Click on submit Button");
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
				driver.findElement(By.name("button")).click();
				test.log(LogStatus.PASS, "Click on GO Button");
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");

				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();

				// driver.findElement(By.name("button")).click();
				test.log(LogStatus.PASS, "Click on GO Button");
				for (String winHandle1 : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle1);
				}
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
				driver.findElement(By.name("transactionList")).sendKeys("Payments");
				
				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();

				for (String winHandle1 : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle1);
				}
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
				if (ProductID.equals("ILP"))

				{

					driver.findElement(By.xpath("//*[@id='PD5']")).click();
					test.log(LogStatus.PASS, "Pay anyAmount the balance option is selected ");

			/*		Payoffbalance = driver.findElement(By.name("payOff")).getAttribute("value");
					test.log(LogStatus.PASS, "Capture the Payoff balance " + Payoffbalance);*/

					Thread.sleep(500);
	// name="requestBean.siilBean.payAmt"
					driver.findElement(By.name("requestBean.siilBean.payAmt")).sendKeys(Amt);
					test.log(LogStatus.PASS, "Payment Amount is ::"+Amt );
					driver.findElement(By.name("requestBean.siilBean.tenderTypeFirst")).sendKeys(DisbType);
					test.log(LogStatus.PASS, "Tender Type is selected " + TenderType);
	/// name="requestBean.siilBean.tenderTypeFirst"
					// name="requestBean.siilBean.tenderAmtFirst"
					driver.findElement(By.name("requestBean.siilBean.tenderAmtFirst")).sendKeys(Amt);
					test.log(LogStatus.PASS, "Tender Amount is Entered :: "+Amt);

					Thread.sleep(500);
	// name="requestBean.password"
					driver.findElement(By.name("requestBean.password")).sendKeys(Password);
					test.log(LogStatus.PASS, "Password is selected as " + Password);
	// name="finish"
					driver.findElement(By.name("finish")).click();
					test.log(LogStatus.PASS, "Clicked on Finish button ");
					try {
						Alert alert = driver.switchTo().alert();
						alert.accept();
						// if alert present, accept and move on.

					} catch (NoAlertPresentException e) {
						// do what you normally would if you didn't have the
						// alert.
					}
					for (String winHandle1 : driver.getWindowHandles()) {
						driver.switchTo().window(winHandle1);
					}
					driver.switchTo().defaultContent();
					driver.switchTo().frame("mainFrame");
					driver.switchTo().frame("main");
					test.log(LogStatus.INFO, "PayAny Amount Transaction with-SSN: " + SSN + " :: is Successful");

					// driver.findElement(By.name("ok")).click();

				/*	// if(driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td[1]/input")).isDisplayed())
					if (driver.findElement(By.name("checkyes")).isDisplayed()) {
						test.log(LogStatus.INFO, "Payoff Transaction with-SSN: " + SSN + " :: is Successful");
						// driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td[1]/input")).click();
						driver.findElement(By.name("checkyes")).click();
					} else {
						test.log(LogStatus.FAIL, "Payoff Loan is not Completed Successfully ");
					}*/

				}
			}

		}
	}



		}
