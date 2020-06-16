package stepDefinitions;

import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import stepDefinitions.CKM_PDL;
 
public class new_Loan_taken_for_the_user extends CKM_PDL{
	
	public static String NewLoan_ProductName;
	public static String NewLoan_Term;
	public static String StoreID;
	public static String stateProduct;
	public static String stateProductType;
	public static String ESign_CollateralType;
	public static String ESign_LoanAmt;
	public static String ChkgAcctNbr;
	public static String ESign_DisbType;
	public static String ESign_CourtesyCallConsent;
	public static String AllowPromotion;
	public static String CouponNbr;
	public static String ESign_Preference;
	public static String ESign_Checks;
	public static String ESign_Password;
	public static String ESign_CheckNbr;
	public static String last4cheknum;
	public static String cardType;
	public static String cardNumber;
	public static String cardEx_month;
	public static String cardEx_Year;
	public static String cvv;
	public static String CardHolderName;
	public static String DisbAmount;
	public static String No_Of_Check;
	public static String ChkgAcctNbr_lastfour;
		
	public static int count;
	public static int rnum;
	public static int cnum;

	
	
	
	
	
	
	public static void new_Loan_taken_for_the_user(String SSN, String FileName,String NegAmt) throws Exception {
	{

		test.log(LogStatus.INFO, "*****Performing  New Loan transaction *****");
		int lastrow=TestData.getLastRow("NewLoan");
		String sheetName="NewLoan";

		for(int row=2;row<=lastrow;row++)
		{	
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);

			if(SSN.equals(RegSSN))
			{		
				State = prop.getProperty("State");
				
				ProductID=prop.getProperty("ProductID");

		
				ProductType = prop.getProperty("ProductType");
				
				NewLoan_ProductName = TestData.getCellData(sheetName,"NewLoan_ProductName",row);
				NewLoan_Term = TestData.getCellData(sheetName,"NewLoan_Term",row);
				StoreID = TestData.getCellData(sheetName,"StoreID",row);
				
				stateProduct=State+" "+ProductID;
				stateProductType=State+" "+ProductType;
				ESign_CollateralType = TestData.getCellData(sheetName,"ESign_CollateralType",row);

				ESign_LoanAmt = TestData.getCellData(sheetName,"ESign_LoanAmt",row);
				ChkgAcctNbr =SSN.substring(3, 9);
				ESign_DisbType = TestData.getCellData(sheetName,"ESign_DisbType",row);
				ESign_CourtesyCallConsent = TestData.getCellData(sheetName,"ESign_CourtesyCallConsent",row);
				AllowPromotion = TestData.getCellData(sheetName,"Allow Promotion",row);
				CouponNbr = TestData.getCellData(sheetName,"CouponNbr",row);
				ESign_Preference = TestData.getCellData(sheetName,"ESign_Preference",row);
				ESign_Checks = TestData.getCellData(sheetName,"ESign_Checks",row);
				ESign_Password=TestData.getCellData(sheetName,"ESign_Password",row);
				ESign_CheckNbr = SSN.substring(3, 9);			
				last4cheknum= ChkgAcctNbr.substring(ChkgAcctNbr.length() - 4);

				No_Of_Check=TestData.getCellData(sheetName,"No_Of_Check",row);
				ChkgAcctNbr_lastfour=ChkgAcctNbr.substring(ChkgAcctNbr.length() - 4);
				
				
				cardType=TestData.getCellData(sheetName,"Card Type ",row);
				cardNumber=TestData.getCellData(sheetName,"Debit Card No",row);
				cardEx_month=TestData.getCellData(sheetName,"Expiry Month",row);
				cardEx_Year=TestData.getCellData(sheetName,"Expiry Year",row);
				cvv=TestData.getCellData(sheetName,"CVV",row);
				CardHolderName=TestData.getCellData(sheetName,"CardHolderName",row);
				
				DisbAmount=TestData.getCellData(sheetName,"DisbAmount",row);
				//SSN1 = SSN.substring(0, 3);
				//SSN2 = SSN.substring(3,5);
				//SSN3 = SSN.substring(5,9);

				
				Thread.sleep(3000);
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
				driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
				test.log(LogStatus.PASS, "Click on Go Button");				
				Thread.sleep(5000);
			
				if(driver.findElement(By.id("NewLoan")).isEnabled())
					driver.findElement(By.id("NewLoan")).click();
				test.log(LogStatus.PASS, "Click on New Loan Button");
				Thread.sleep(3000);
					
				{
					
					WebElement htmltable=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table"));
					java.util.List<WebElement> rows = htmltable.findElements(By.tagName("tr"));
					count=0;							
					count=driver.findElements(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr")).size();	
					System.out.println("current row num "+count);	
					System.out.println(" rows num "+ rows.size());
					test.log(LogStatus.PASS, "New Loan button is enabled");
					if(ProductID.equals("LOC"))
					{
						LOC();

					}
					else if(ProductID.equals("PDL"))
					{
						PDL();

					}
					else{
						test.log(LogStatus.FAIL, "New Loan button is Disabled");
					}
					break;
					
				}
				
		}

	}
	}
}
public static void LOC() throws InterruptedException
{
	if(ProductID.equals("LOC"))
	{					
		rnum=rnum+1;
		if(State.equals("KS")){					
			try{								
				driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).click();
				  //driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/input")).click();
				
			}	
			catch(Exception e){
				test.log(LogStatus.PASS, "CustomerReached maximum Loan amounts");
				//CSRLoginLogout.logout();

			}}
					
	}
	test.log(LogStatus.PASS, "Product selected as "+stateProduct);
	
	Thread.sleep(2000);	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-250)", "");
	
	driver.findElement(By.id("LoanButtonId")).click();
	test.log(LogStatus.PASS, "Clicked on loan button");
		Thread.sleep(3000);
		driver.findElement(By.name("advanceRequestBean.paymentCollateralType")).sendKeys(ESign_CollateralType);
		test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
		if(!(ESign_LoanAmt.isEmpty()))
		{
			driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/table/tbody/tr[13]/td[3]/input")).sendKeys(ESign_LoanAmt);
			test.log(LogStatus.PASS, "Loan amount is enterted as "+ESign_LoanAmt);
		}
		
		
		String LOCamount2=driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[7]/td[2]/input")).getAttribute("value");
		test.log(LogStatus.PASS, "LOC amount is : "+LOCamount2);
		
		driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
		test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);

		driver.findElement(By.name("advanceRequestBean.courtesyCallFlag")).sendKeys(ESign_CourtesyCallConsent);
		test.log(LogStatus.PASS, "Courtsey call consent selected as "+ESign_CourtesyCallConsent);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
		test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
		if(ESign_CourtesyCallConsent.equalsIgnoreCase("Yes"))
			Thread.sleep(500);
		{
			if(ESign_Preference.equalsIgnoreCase("Call"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceCall']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
			}
			if(ESign_Preference.equalsIgnoreCase("Mail"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceMail']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);
			}
			if(ESign_Preference.equalsIgnoreCase("SMS"))	
			{
				driver.findElement(By.xpath("//*[@id='preferenceSms']")).click();
				test.log(LogStatus.PASS, "Courtesy Call Consent is selected as "+ESign_Preference);

				try { 
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
					//if alert present, accept and move on.														

				}
				catch (NoAlertPresentException e) {
					//do what you normally would if you didn't have the alert.
				}
			}
		}


		//'''''''''''''''''''''''''''''''''''''''''''''''//'''''''''''''''''''''''''''''''''''''''''''''//

		if (ESign_CollateralType.equals("ACH"))
		{
			driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount2);
			
			test.log(LogStatus.PASS, "Disb amount enterd  as "+LOCamount2);
			
			driver.findElement(By.name("requestBean.password")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");
			test.log(LogStatus.PASS, "click on Finish Loan button ");
		}

		//..................................................//.......................................
		if (ESign_CollateralType.equals("DEBIT CARD"))
		{	
			driver.findElement(By.xpath("//*[@id='cardsList']/select")).sendKeys("NEW CARD");
			test.log(LogStatus.PASS, "Select card as : " + "NEW CARD");
		
			driver.findElement(By.xpath("//*[@id='cardType2']/select")).sendKeys(cardType);
			test.log(LogStatus.PASS, "Enterd card Type  : " + cardType);
			
			driver.findElement(By.xpath("//*[@id='ccnumber']")).sendKeys(cardNumber);
			test.log(LogStatus.PASS, "Card number is :" + cardNumber);

			driver.findElement(By.xpath("//*[@id='expmonth']")).sendKeys(cardEx_month);
			test.log(LogStatus.PASS, "Enterd Expiry month " + cardEx_month);

			driver.findElement(By.xpath("//*[@id='expyear']")).sendKeys(cardEx_Year);
			test.log(LogStatus.PASS, "Enterd Expiry year " + cardEx_month);
		
			driver.findElement(By.xpath("//*[@id='cvvnumber']")).sendKeys(cvv);
			test.log(LogStatus.PASS, "Enterd CVV " + cvv);
			driver.findElement(By.xpath("//*[@id='ccname']")).sendKeys(CardHolderName);
			test.log(LogStatus.PASS, "Card holder name is " + CardHolderName);
	
			driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table[1]/tbody/tr[17]/td[2]/div[1]/input[3]")).click();
			test.log(LogStatus.PASS, "Clicked on add card button ");
			Thread.sleep(30000);
			driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount2);			
			test.log(LogStatus.PASS, "Disb amount enterd  as "+LOCamount2);
			driver.findElement(By.name("requestBean.password")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");

		}

		Thread.sleep(3000);
		try {
			Alert alert = driver.switchTo().alert();
			String almsg= alert.getText();

			alert.accept();
			test.log(LogStatus.PASS, "alert handled "+almsg);
	}
		catch (NoAlertPresentException e) {
			//do what you normally would if you didn't have the alert.
		}

		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		Thread.sleep(4000);
		
		String confirm_text1=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[1]")).getText();
		String confirm_text2=driver.findElement(By.xpath("//*[@id='confirmMsg']/b[2]")).getText();
		
		
		//test.log(LogStatus.PASS, "confirm text is  "+confirm_text1+"Will revice an amount of"+confirm_text2+"With Due date"+Duedate_confirm_text3);
		
	
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td/input[1]")).click();
		
		test.log(LogStatus.PASS, "click on Yes button ");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		if(driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td")).getText().contains("successfully")){
		
			test.log(LogStatus.PASS, "<FONT color=green style=Arial> New Loan is Completed Successfully");
			test.log(LogStatus.INFO, "******************************************************** ");
			Thread.sleep(1000);
		}
		else
		{
			test.log(LogStatus.INFO, "<FONT color=green style=Arial>New Loan is  Completed Successfully ");
		}

		
	}

public static void PDL() throws InterruptedException
{
	if(ProductID.equals("PDL"))
	{					
		rnum=rnum+1;
		if(State.equals("CA")){					
			try{								
				driver.findElement(By.xpath("//*[@id=\"riskViewBdy\"]/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/input")).click();
				  //driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/input")).click();
				
			}	
			catch(Exception e){
				test.log(LogStatus.PASS, "CustomerReached maximum Loan amounts");
				//CSRLoginLogout.logout();

			}}
					
	}
	test.log(LogStatus.PASS, "Product selected as "+stateProduct);
	
	  //LOCamount=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[5]/table/tbody/tr[1]/td[2]")).getText();
	String Loanamount=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[1]/td[2]")).getText();
	test.log(LogStatus.PASS, "Loan amount is : "+Loanamount);
	String OrginationFee=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[1]/td[2]")).getText();
	test.log(LogStatus.PASS, "Orgination&Documentation Fee is : "+OrginationFee);
	String APR=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[3]/td[2]")).getText();
	test.log(LogStatus.PASS, "APR is : "+APR);
	String Totaldue=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[4]/td[2]")).getText();
	test.log(LogStatus.PASS, "Total Due is : "+Totaldue);
	String Duedate=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[5]/td[2]")).getText();
	test.log(LogStatus.PASS, "Due Date is : "+Duedate);
	String MinLoanAmt=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[6]/td[2]")).getText();
	test.log(LogStatus.PASS, "Minimum Loan amount is : "+MinLoanAmt);
	String MaxLoanAmt=driver.findElement(By.xpath("//*[@id='riskViewBdy']/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[7]/td[2]")).getText();
	test.log(LogStatus.PASS, "Maximum Loan amount is : "+MaxLoanAmt);


	Thread.sleep(2000);	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-250)", "");
	
	driver.findElement(By.id("LoanButtonId")).click();
	test.log(LogStatus.PASS, "Clicked on New loan button in Product Selection Screen");
		Thread.sleep(8000);
		
		//''''''''''''''''''''''''''''''''''''''''''''''' Collateral Types '''''''''''''''''''''''''''''''''''''''''''''//

		if (ESign_CollateralType.equals("ACH"))
		{
			driver.findElement(By.name("advanceRequestBean.collateralTypeId")).sendKeys(ESign_CollateralType);
			test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
			
			driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
			test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
			
			driver.findElement(By.name("advanceRequestBean.preference")).click();
			test.log(LogStatus.PASS, "Courtsey call consent selected as : Complimentary call");
			
			driver.findElement(By.name("advanceRequestBean.loggedUserPassword")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");
			
		}
		if (ESign_CollateralType.equals("RCPO"))
		{
			driver.findElement(By.name("advanceRequestBean.collateralTypeId")).sendKeys(ESign_CollateralType);
			test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
			
			driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
			test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
			
			driver.findElement(By.name("advanceRequestBean.preference")).click();
			test.log(LogStatus.PASS, "Courtsey call consent selected as : Complimentary call");
			
			driver.findElement(By.name("advanceRequestBean.loggedUserPassword")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");
			
		}
		
		if (ESign_CollateralType.equals("CHECK"))
		{
			driver.findElement(By.name("advanceRequestBean.collateralTypeId")).sendKeys(ESign_CollateralType);
			test.log(LogStatus.PASS, "Collateral Type is enterted as "+ESign_CollateralType);
			
			driver.findElement(By.xpath("//*[@id='advanceRequestBean.disbursementType']")).sendKeys(ESign_DisbType);
			test.log(LogStatus.PASS, "Disb Type is enterted as "+ESign_DisbType);
			
			driver.findElement(By.name("advanceRequestBean.preference")).click();
			test.log(LogStatus.PASS, "Courtsey call consent selected as : Complimentary call");
			
			driver.findElement(By.name("requestBean.noOfChecks")).sendKeys("1");
			test.log(LogStatus.PASS, "Number of checks selected as : "+"1");
			
			Thread.sleep(500);
			
			driver.findElement(By.name("chkNbr0")).sendKeys(ChkgAcctNbr_lastfour);
			test.log(LogStatus.PASS, "Check Number Entered as : "+ChkgAcctNbr_lastfour);
			
			Thread.sleep(500);
			
			driver.findElement(By.name("advanceRequestBean.loggedUserPassword")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");
			
		}

		//..................................................//.......................................
		if (ESign_CollateralType.equals("Debit Card"))
		{	
			driver.findElement(By.xpath("//*[@id='cardsList']/select")).sendKeys("NEW CARD");
			test.log(LogStatus.PASS, "Select card as : " + "NEW CARD");
		
			driver.findElement(By.xpath("//*[@id='cardType2']/select")).sendKeys(cardType);
			test.log(LogStatus.PASS, "Enterd card Type  : " + cardType);
			
			driver.findElement(By.xpath("//*[@id='ccnumber']")).sendKeys(cardNumber);
			test.log(LogStatus.PASS, "Card number is :" + cardNumber);

			driver.findElement(By.xpath("//*[@id='expmonth']")).sendKeys(cardEx_month);
			test.log(LogStatus.PASS, "Enterd Expiry month " + cardEx_month);

			driver.findElement(By.xpath("//*[@id='expyear']")).sendKeys(cardEx_Year);
			test.log(LogStatus.PASS, "Enterd Expiry year " + cardEx_month);
		
			driver.findElement(By.xpath("//*[@id='cvvnumber']")).sendKeys(cvv);
			test.log(LogStatus.PASS, "Enterd CVV " + cvv);
			driver.findElement(By.xpath("//*[@id='ccname']")).sendKeys(CardHolderName);
			test.log(LogStatus.PASS, "Card holder name is " + CardHolderName);
	
			driver.findElement(By.xpath("//*[@id='errorMessage']/form[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[3]/td/table[1]/tbody/tr[17]/td[2]/div[1]/input[3]")).click();
			test.log(LogStatus.PASS, "Clicked on add card button ");
			Thread.sleep(30000);
			//driver.findElement(By.name("advanceRequestBean.disbAmtFirst")).sendKeys(LOCamount2);			
			//test.log(LogStatus.PASS, "Disb amount enterd  as "+LOCamount2);
			driver.findElement(By.name("requestBean.password")).sendKeys(ESign_Password);
			test.log(LogStatus.PASS, "ESign_Checks is selected as "+ESign_Password);
			driver.findElement(By.name("finishadvance")).click();
			test.log(LogStatus.PASS, "click on Finish Loan button ");

		}

		Thread.sleep(3000);
		try {
			Alert alert = driver.switchTo().alert();
			String almsg= alert.getText();

			alert.accept();
			test.log(LogStatus.PASS, "alert handled "+almsg);
	}
		catch (NoAlertPresentException e) {
			//do what you normally would if you didn't have the alert.
		}

		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		Thread.sleep(4000);
		
		String AmountFinanced=driver.findElement(By.xpath("//*[@id='confirmEsign']/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]")).getText();
		test.log(LogStatus.PASS, "Amount Financed : "+AmountFinanced);
		Thread.sleep(400);
		String FinanceCharge=driver.findElement(By.xpath("//*[@id='confirmEsign']/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]")).getText();
		test.log(LogStatus.PASS, "Finance Charge : "+FinanceCharge);
		Thread.sleep(400);
		String TotalPayment=driver.findElement(By.xpath("//*[@id='confirmEsign']/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]")).getText();
		test.log(LogStatus.PASS, "Total Payment : "+TotalPayment);
		Thread.sleep(400);
		String Due_date=driver.findElement(By.xpath("//*[@id='confirmEsign']/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]")).getText();
		test.log(LogStatus.PASS, "Due Date : "+Due_date);
		Thread.sleep(400);
		String LoanType=driver.findElement(By.xpath("//*[@id='confirmEsign']/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]")).getText();
		test.log(LogStatus.PASS, "Loan Type is : "+LoanType);
		
		
		//test.log(LogStatus.PASS, "confirm text is  "+confirm_text1+"Will revice an amount of"+confirm_text2+"With Due date"+Duedate_confirm_text3);
		
	
		
		driver.findElement(By.xpath("//*[@id='OKBut']")).click();		
		test.log(LogStatus.PASS, "click on Yes button ");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.switchTo().frame("main");
		
		if(driver.findElement(By.xpath("//*[@id='tdTranHist']/table/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/b")).getText().contains("Successfully")){
			Thread.sleep(800);
			String Amount_to_Pay=driver.findElement(By.xpath("//*[@id='netCollectAmt']")).getAttribute("value");		
			test.log(LogStatus.PASS, "Amount to Pay is : "+Amount_to_Pay);
			Thread.sleep(400);
			String Amount_to_Collect=driver.findElement(By.xpath("//*[@id='netpayAmt']")).getAttribute("value");
			test.log(LogStatus.PASS, "Amount to Collect is : "+Amount_to_Collect);
			Thread.sleep(400);
		    driver.findElement(By.xpath("//*[@id='tdTranHist']/table/tbody/tr/td/table[2]/tbody/tr[4]/td/table/tbody/tr[1]/td/input[2]")).click();
		    test.log(LogStatus.PASS, "click on No button for another transaction ");
		    Thread.sleep(500);
			test.log(LogStatus.PASS, "<FONT color=green style=Arial> New Loan is Completed Successfully");
			test.log(LogStatus.INFO, "******************************************************** ");
			Thread.sleep(500);
		}
		else
		{
			test.log(LogStatus.FAIL, "New Loan Failed ");
		}

		
	}
	//--------------------------------------------------------------------------------------------------------------------------
	
	
		}
