package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Registration_of_the_Borrower_PDL extends CKM_PDL{
	public static void Registration_of_the_Borrower_PDL(WebDriver driver, ExtentTest test, String AppURL, String SSN,String FileName) throws Exception {

		int lastrow=TestData.getLastRow("Borrower_Registration");	
		String sheetName="Borrower_Registration";		
		for(int row=2;row<=lastrow;row++)
		{		
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);
			
			if(SSN.equals(RegSSN))
			{	
				         
	       String LastName = TestData.getCellData(sheetName,"LastName",row);
	       String FirstName = TestData.getCellData(sheetName,"FirstName",row);
	       String AddressLine = TestData.getCellData(sheetName,"AddressLine",row);
	       String City = TestData.getCellData(sheetName,"City",row);
	       String State = TestData.getCellData(sheetName,"State",row);	      
	       String ZipCode = TestData.getCellData(sheetName,"ZipCode",row);
	       String MonthsAtAddress = TestData.getCellData(sheetName,"MonthsAtAddress",row);	     
	       String Bank_ABARoutingNbr = TestData.getCellData(sheetName,"Bank_ABARoutingNbr",row);
	       String Bank_ChkgAcctNbr = TestData.getCellData(sheetName,"SSN",row);	       
	       String Ctc_PrimaryPhone = TestData.getCellData(sheetName,"Ctc_PrimaryPhone",row);
	       String Ctc_PhoneType = TestData.getCellData(sheetName,"Ctc_PhoneType",row);
	       String Misc_PhotoIDNbr = TestData.getCellData(sheetName,"SSN",row);
	       String Misc_IDExpDate = TestData.getCellData(sheetName,"Misc_IDExpDate",row);	   
	       String Misc_PhotoIDType = TestData.getCellData(sheetName,"Misc_PhotoIDType",row);
	       String BorrDOB = TestData.getCellData(sheetName,"Misc_DOB",row);
	       String Income_IncomeType = TestData.getCellData(sheetName,"Income_IncomeType",row);
	       String Income_Employer = TestData.getCellData(sheetName,"Income_Employer",row);
	       String Income_WorkPhone = TestData.getCellData(sheetName,"Income_WorkPhone",row);
	       String Income_NetIncomeAmt = TestData.getCellData(sheetName,"Income_NetIncomeAmt",row);
	       String Income_GrossIncome = TestData.getCellData(sheetName,"Income_GrossIncome",row);
	       String Income_PayFrequency = TestData.getCellData(sheetName,"Income_PayFrequency",row);
	       String MonthlyPayDay = TestData.getCellData(sheetName,"MonthlyPayDay",row);
	       String Income_HireDt = TestData.getCellData(sheetName,"Income_HireDt",row);
	       String Income_DirectDeposit=TestData.getCellData(sheetName,"Income_DirectDeposit",row);	
	       String ProductType=TestData.getCellData(sheetName,"ProductType",row);	     	       
	       String Bankruptcy=TestData.getCellData(sheetName,"Bankruptcy",row);	     
				test.log(LogStatus.INFO, "Borrower Registration-SSN: " +SSN);
				ProductID=prop.getProperty("ProductID");	
				   DateFormat  df=new SimpleDateFormat("MM/dd/yyyy");
			        String SSN1 = SSN.substring(0, 3);
			        String SSN2 = SSN.substring(3,5);
			        String SSN3 = SSN.substring(5,9);
			        String PP1 = Ctc_PrimaryPhone.substring(0, 3);
			        String PP2 = Ctc_PrimaryPhone.substring(3, 6);
			        String PP3 = Ctc_PrimaryPhone.substring(6, 10);
			        String IncomeP1 = Income_WorkPhone.substring(0, 3);
			        String IncomeP2 = Income_WorkPhone.substring(3, 6);
			        String IncomeP3 = Income_WorkPhone.substring(6, 10);			      		       
			        System.out.println(Misc_IDExpDate);
			        Date Misc_IDExpDt = df.parse(Misc_IDExpDate);
			        String IDExpDate0 =df.format(Misc_IDExpDt);	
			        System.out.println(IDExpDate0);
			        String IDExpDate[] =IDExpDate0.split("/");
			        String IDExpD1 = IDExpDate[0];
			        String IDExpD2 = IDExpDate[1];
			        String IDExpD3 = IDExpDate[2];
			        String DOB[] =BorrDOB.split("/");
			        String DOB1 = DOB[0];
			        String DOB2 = DOB[1];
			        String DOB3 = DOB[2];
			      
			        Thread.sleep(3000);
			
			WebDriverWait wait = new WebDriverWait(driver, 1000);	

			driver.switchTo().defaultContent();
			driver.switchTo().frame("topFrame");
			
		
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='900000']")));
	        driver.findElement(By.xpath("//*[@id='900000']/a")).click();
			
			test.log(LogStatus.PASS, "Clicked on Borrower");			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");			 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[id='901000']")));
			driver.findElement(By.cssSelector("li[id='901000']")).click();			
			test.log(LogStatus.PASS, "Clicked on Registration");			
			driver.switchTo().frame("main");
			driver.findElement(By.name("customerBean.custProdType")).sendKeys(ProductType);
			 test.log(LogStatus.PASS, "ProductType is entered: "+ProductType);
			driver.findElement(By.name("ssn1")).sendKeys(SSN1);
			 test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
			driver.findElement(By.name("ssn2")).sendKeys(SSN2);
			test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
			driver.findElement(By.name("ssn3")).sendKeys(SSN3);
			test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
			driver.findElement(By.name("ssn4")).sendKeys(SSN1);
			test.log(LogStatus.PASS, "Confirm SSN1 is entered: "+SSN1);
			driver.findElement(By.name("ssn5")).sendKeys(SSN2);
			test.log(LogStatus.PASS, "Confirm SSN2 is entered: "+SSN2);
			driver.findElement(By.name("ssn6")).sendKeys(SSN3);
			test.log(LogStatus.PASS, "Confirm SSN3 is entered: "+SSN3);			
			driver.findElement(By.name("customerBean.lastNm")).sendKeys(LastName);
			test.log(LogStatus.PASS, "LastName is entered: "+LastName);
			
			Actions action= new Actions(driver);
			action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			
			try { 
			    Alert alert = driver.switchTo().alert();
			    alert.accept();
			    //if alert present, accept and move on.														
				
			}
			catch (NoAlertPresentException e) {
			    //do what you normally would if you didn't have the alert.
			}
					
			driver.findElement(By.name("customerBean.firstNm")).sendKeys(FirstName);
			test.log(LogStatus.PASS, "FirstName is entered: "+FirstName);			
			driver.findElement(By.name("customerBean.addressLn")).sendKeys(AddressLine);
			test.log(LogStatus.PASS, "AddressLine is entered: "+AddressLine);			
			driver.findElement(By.name("customerBean.city")).sendKeys(City);
			test.log(LogStatus.PASS, "City is entered: "+City);			
			driver.findElement(By.name("customerBean.stateCd")).sendKeys(State);
			test.log(LogStatus.PASS, "State is entered: "+State);			
			driver.findElement(By.name("customerBean.postalCd")).sendKeys(ZipCode);
			test.log(LogStatus.PASS, "ZipCode is entered: "+ZipCode);
			
			driver.findElement(By.name("customerBean.mlaCreditId")).sendKeys("8525445214");
			test.log(LogStatus.PASS, "MLA is entered:85254 ");	
			
			driver.findElement(By.name("phoneNbr1")).sendKeys(PP1);
			test.log(LogStatus.PASS, "PP1 is entered: "+PP1);
			driver.findElement(By.name("phoneNbr2")).sendKeys(PP2);
			test.log(LogStatus.PASS, "PP2 is entered: "+PP2);
			driver.findElement(By.name("phoneNbr3")).sendKeys(PP3);
			test.log(LogStatus.PASS, "PP3 is entered: "+PP3);		
			
			
			driver.findElement(By.name("customerBean.phoneCd")).sendKeys("Cell");
			test.log(LogStatus.PASS, "Phone Type is selected as:Cell ");	
			
			
			driver.findElement(By.name("customerBean.driversLicNbr")).sendKeys(Misc_PhotoIDNbr);
			test.log(LogStatus.PASS, "PhotoIDNbr is entered: "+Misc_PhotoIDNbr);
			
			driver.findElement(By.name("customerBean.driversLicSt")).sendKeys(State);
			test.log(LogStatus.PASS, "ID State is entered: "+State);
			
			
			driver.findElement(By.name("dlexpiry1")).sendKeys(IDExpD1);
			test.log(LogStatus.PASS, "ID Expiration Date1 is entered: "+IDExpD1);
			driver.findElement(By.name("dlexpiry2")).sendKeys(IDExpD2);
			test.log(LogStatus.PASS, "ID Expiration Date1 is entered: "+IDExpD2);
			driver.findElement(By.name("dlexpiry3")).sendKeys(IDExpD3);
			test.log(LogStatus.PASS, "ID Expiration Date1 is entered: "+IDExpD3);
			
			
			driver.findElement(By.name("customerBean.photoIdType")).sendKeys(Misc_PhotoIDType);
			test.log(LogStatus.PASS, "PhotoIDType is entered: "+Misc_PhotoIDType);
			
			
			driver.findElement(By.name("customerBean.drivingZipcode")).sendKeys(ZipCode);
			test.log(LogStatus.PASS, "ZipCode is entered: "+ZipCode);
			
			driver.findElement(By.name("customerBean.marketingInfo")).sendKeys("Referral");
			test.log(LogStatus.PASS, "Market Information: "+ZipCode);
			
			driver.findElement(By.name("dob1")).sendKeys(DOB1);
			test.log(LogStatus.PASS, "DOB1 Date1 is entered: "+DOB1);
			driver.findElement(By.name("dob2")).sendKeys(DOB2);
			test.log(LogStatus.PASS, "DOB3 is entered: "+DOB2);
			driver.findElement(By.name("dob3")).sendKeys(DOB3);
			test.log(LogStatus.PASS, "DOB3 is entered: "+DOB3);

			driver.findElement(By.name("customerBean.incomeCdDisp")).sendKeys(Income_IncomeType);
			test.log(LogStatus.PASS, "IncomeType is entered: "+Income_IncomeType);
			driver.findElement(By.name("customerBean.empNmDisp")).sendKeys(Income_Employer);
			test.log(LogStatus.PASS, "Employer is entered: "+Income_Employer);
			
			driver.findElement(By.name("customerBean.roomSupervisor")).sendKeys("Supervisor");
			test.log(LogStatus.PASS, "SPV is entered:Supervisor  ");
			
			driver.findElement(By.name("customerBean.empDept")).sendKeys("Dept");
			test.log(LogStatus.PASS, "Dt is entered:Dept  ");		
			
			driver.findElement(By.name("workPhoneNbrDisp1")).sendKeys(IncomeP1);
			test.log(LogStatus.PASS, "PP1 is entered: "+IncomeP1);
			driver.findElement(By.name("workPhoneNbrDisp2")).sendKeys(IncomeP2);
			test.log(LogStatus.PASS, "PP2 is entered: "+IncomeP2);
			driver.findElement(By.name("workPhoneNbrDisp3")).sendKeys(IncomeP3);
			test.log(LogStatus.PASS, "PP3 is entered: "+IncomeP3);
			
			driver.findElement(By.name("customerBean.roomEmpStatus")).sendKeys("Active");
			test.log(LogStatus.PASS, "Employee status entered:Active");			
			
			driver.findElement(By.name("customerBean.payFreqCdDisp")).sendKeys(Income_PayFrequency);
			test.log(LogStatus.PASS, "Income_PayFrequency is entered: "+Income_PayFrequency);	
			
			driver.findElement(By.name("customerBean.grossAmtDisp")).sendKeys(Income_GrossIncome);
			test.log(LogStatus.PASS, "Income_GrossIncome is entered: "+Income_GrossIncome);
			
			driver.findElement(By.name("customerBean.activeFlgDisp")).sendKeys("Active");
			test.log(LogStatus.PASS, "Bank Status is entered:Active ");
			
			driver.findElement(By.name("customerBean.abaNbrDisp")).sendKeys(Bank_ABARoutingNbr);
			test.log(LogStatus.PASS, "Bank_ABARoutingNbr is entered: "+Bank_ABARoutingNbr);
			
			
			
			if(Income_PayFrequency.equals("Monthly")) // Added by pradeep for Monthly pay freq
			{
				driver.findElement(By.id("rad_monthly1")).click();

				driver.findElement(By.name("customerBean.monthlyDate")).sendKeys(MonthlyPayDay);
				test.log(LogStatus.PASS, "The 1st day of each month is selected");
			}
			
			if(Income_PayFrequency.equals("Semi-Monthly"))
			{
				driver.findElement(By.id("rad_semi1")).click();
				test.log(LogStatus.PASS, "The 1st and 16th day of each month is selected");
			}
			
			if(Income_PayFrequency.equals("Bi-Weekly"))
			{
				driver.findElement(By.id("rad_wk4")).click();
				test.log(LogStatus.PASS, "Wednesday is selected");
				/*driver.findElement(By.id("biwksndid")).click();
				test.log(LogStatus.PASS, "Which day is your next Pay date? is selected as last date radio button");	*/			
			}
			
			
			
			driver.findElement(By.name("customerBean.activeFlgDisp")).sendKeys("Active");
			test.log(LogStatus.PASS, "Bank Status is entered:Active ");
			driver.findElement(By.name("customerBean.abaNbrDisp")).sendKeys(Bank_ABARoutingNbr);
			test.log(LogStatus.PASS, "Bank_ABARoutingNbr is entered: "+Bank_ABARoutingNbr);
			
			driver.findElement(By.name("customerBean.savingsAccount")).sendKeys("NO");
			test.log(LogStatus.PASS, "Is Saving Account is entered: NO");
			
			driver.findElement(By.name("customerBean.accountNbrDisp")).sendKeys(Bank_ChkgAcctNbr);
			test.log(LogStatus.PASS, "Chkg Acct Nbr is entered: "+Bank_ChkgAcctNbr);
			
			driver.findElement(By.name("customerBean.directDeposit")).sendKeys("Yes");
			test.log(LogStatus.PASS, "Deposit is entered:Yes ");
		
			driver.findElement(By.name("chk1")).click();
			test.log(LogStatus.PASS, "Account Ownership is verified ");
			
			driver.findElement(By.name("chk2")).click();
			test.log(LogStatus.PASS, "Account is verified as a Personal Checking Account ");
			
			driver.findElement(By.name("chk3")).click();
			test.log(LogStatus.PASS, "Bank Name is verified ");
			
			driver.findElement(By.name("chk4")).click();
			test.log(LogStatus.PASS, "Account Number is verified ");
			
			driver.findElement(By.name("chk5")).click();
			test.log(LogStatus.PASS, "Routing Number is verified ");
			
			driver.findElement(By.name("isDboVerifySel")).sendKeys("Paper Evidence is on file");
			test.log(LogStatus.PASS, "Account Verification");
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("bottom");
			 String BusinessDt= driver.findElement(By.xpath("/html/body/blink/table/tbody/tr/td[3]")).getText();
			 String Busdate[]=BusinessDt.split(":");
			 String date = Busdate[1];
			
			 Date d1 = df.parse(date);
			 Calendar cal = Calendar.getInstance();
			 cal.setTime(d1);
			 cal.add(Calendar.DATE, -20);
			 Date PayStubReviewedDate1= cal.getTime();
			 
			 String PayStubReviewedDate =df.format(PayStubReviewedDate1);
					 //Date D=Add(date1,7);
			 //System.out.println(date);
			
			 //System.out.println(PayStubReviewedDate);
			 
			 	String PayStubReviewedDate0[] =PayStubReviewedDate.split("/");
		        String PayStubReviewedDate2 = PayStubReviewedDate0[0];
		        String PayStubReviewedDate3 = PayStubReviewedDate0[1];
		        String PayStubReviewedDate4 = PayStubReviewedDate0[2];
		        driver.switchTo().defaultContent();
				 driver.switchTo().frame("mainFrame");
				 driver.switchTo().frame("main");
		        driver.findElement(By.name("payStubReviewed1")).sendKeys(PayStubReviewedDate2);
				test.log(LogStatus.PASS, "PayStubReviewed1 is entered: "+PayStubReviewedDate2);
				driver.findElement(By.name("payStubReviewed2")).sendKeys(PayStubReviewedDate3);
				test.log(LogStatus.PASS, "PayStubReviewed2 is entered: "+PayStubReviewedDate3);
				driver.findElement(By.name("payStubReviewed3")).sendKeys(PayStubReviewedDate4);
				test.log(LogStatus.PASS, "PayStubReviewed3 is entered: "+PayStubReviewedDate4);
				
				cal.add(Calendar.DATE, -30);
				 Date PayStubDate1= cal.getTime();
				 
				 String PayStubDate =df.format(PayStubDate1);
						 //Date D=Add(date1,7);
				 //System.out.println(date);
				
				 //System.out.println(PayStubReviewedDate);
				 
				 	String PayStubDate0[] =PayStubDate.split("/");
			        String PayStubDate2 = PayStubDate0[0];
			        String PayStubDate3 = PayStubDate0[1];
			        String PayStubDate4 = PayStubDate0[2];
			        driver.findElement(By.name("payStubDate1")).sendKeys(PayStubDate2);
					test.log(LogStatus.PASS, "payStubDate1 is entered: "+PayStubDate2);
					driver.findElement(By.name("payStubDate2")).sendKeys(PayStubDate3);
					test.log(LogStatus.PASS, "payStubDate2 is entered: "+PayStubDate3);
					driver.findElement(By.name("payStubDate3")).sendKeys(PayStubDate4);
					test.log(LogStatus.PASS, "payStubDate3 is entered: "+PayStubDate4);
					
					String Income_HireDt0[] =Income_HireDt.split("/");
			        String Income_HireDt1 = Income_HireDt0[0];
			        String Income_HireDt2 = Income_HireDt0[1];
			        String Income_HireDt3 = Income_HireDt0[2];
			        
			   
			        driver.findElement(By.name("hireDate1")).sendKeys(Income_HireDt1);
					test.log(LogStatus.PASS, "hireDate1 is entered: "+Income_HireDt1);
					driver.findElement(By.name("hireDate2")).sendKeys(Income_HireDt2);
					test.log(LogStatus.PASS, "hireDate2 is entered: "+Income_HireDt2);
					driver.findElement(By.name("hireDate3")).sendKeys(Income_HireDt3);
					test.log(LogStatus.PASS, "hireDate3 is entered: "+Income_HireDt3);
		
			driver.findElement(By.name("customerBean.directDeposit")).sendKeys(Income_DirectDeposit);
			test.log(LogStatus.PASS, "DirectDeposit is entered: "+Income_DirectDeposit);
			cal.add(Calendar.DATE, -60);
			 Date Bank_AcctVerificationDt0= cal.getTime();
			 
			 String Bank_AcctVerificationDt =df.format(Bank_AcctVerificationDt0);
			 String Bank_AcctVerificationDt1[] =Bank_AcctVerificationDt.split("/");
		        String Bank_AcctVerificationDt2 = Bank_AcctVerificationDt1[0];
		        String Bank_AcctVerificationDt3 = Bank_AcctVerificationDt1[1];
		        String Bank_AcctVerificationDt4 = Bank_AcctVerificationDt1[2];
			driver.findElement(By.name("statementEndDtDisp1")).sendKeys(Bank_AcctVerificationDt2);
			test.log(LogStatus.PASS, "Bank_AcctVerificationDt1 is entered: "+Bank_AcctVerificationDt2);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("statementEndDtDisp2")).sendKeys(Bank_AcctVerificationDt3);
			test.log(LogStatus.PASS, "Bank_AcctVerificationDt2 is entered: "+Bank_AcctVerificationDt3);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("statementEndDtDisp3")).sendKeys(Bank_AcctVerificationDt4);
			test.log(LogStatus.PASS, "Bank_AcctVerificationDt3 is entered: "+Bank_AcctVerificationDt4);
			
			
			driver.findElement(By.name("customerBean.contName")).sendKeys("Qfund");
			test.log(LogStatus.PASS, "Last Name is entered:Qfund ");
			
			driver.findElement(By.name("customerBean.contactFirstName")).sendKeys("Qfund");
			test.log(LogStatus.PASS, "Bank_AcctVerificationDt3 is entered:Qfund ");
			
			driver.findElement(By.name("customerBean.contactrelationDisp")).sendKeys("Brother");
			test.log(LogStatus.PASS, "Relation Ship is entered:Brother ");
			
			
			driver.findElement(By.name("cphoneNbrDisp1")).sendKeys(IncomeP1);
			test.log(LogStatus.PASS, "PP1 is entered: "+IncomeP1);
			driver.findElement(By.name("cphoneNbrDisp2")).sendKeys(IncomeP2);
			test.log(LogStatus.PASS, "PP2 is entered: "+IncomeP2);
			driver.findElement(By.name("cphoneNbrDisp3")).sendKeys(IncomeP3);
			test.log(LogStatus.PASS, "PP3 is entered: "+IncomeP3);
			
			
			driver.findElement(By.name("customerBean.nameDispSummary")).sendKeys("Qfundone");
			test.log(LogStatus.PASS, "Last Name is entered:Qfundone ");
			
			driver.findElement(By.name("customerBean.referenceFirstNameSummary")).sendKeys("Qfundtwo");
			test.log(LogStatus.PASS, "Bank_AcctVerificationDt3 is entered:Qfundtwo ");
			
			driver.findElement(By.name("customerBean.relationDispSummary")).sendKeys("Brother");
			test.log(LogStatus.PASS, "Relation Ship is entered:Brother ");
			
			
			driver.findElement(By.name("refPhoneNbr1")).sendKeys("123");
			test.log(LogStatus.PASS, "PP1 is entered:123");
			driver.findElement(By.name("refPhoneNbr2")).sendKeys("123");
			test.log(LogStatus.PASS, "PP2 is entered:123");
			driver.findElement(By.name("refPhoneNbr3")).sendKeys("4444");
			test.log(LogStatus.PASS, "PP3 is entered:4444");
			
		driver.findElement(By.name("Save")).click();							
		test.log(LogStatus.PASS, "Clicked on Save&Loan");
					
		Thread.sleep(4000);
				
				try { 
					    Alert alert = driver.switchTo().alert();
					    alert.accept();
					    //if alert present, accept and move on.														
						
					}
					catch (NoAlertPresentException e) {
					    //do what you normally would if you didn't have the alert.
					}
					   
						for(String winHandle : driver.getWindowHandles()){
					    driver.switchTo().window(winHandle);
								
					 driver.switchTo().defaultContent();
					 driver.switchTo().frame("mainFrame");
					 driver.switchTo().frame("main");				 
					 Thread.sleep(2000);
					 
					 
				        if(driver.findElement(By.name("Go")).isDisplayed())
					 	{
						test.log(LogStatus.PASS, "Borrower is Registered Successfully with SSN as " +SSN);						
					 	}
						else
						{
						test.log(LogStatus.FAIL, "Borrower is not Registered Successfully with SSN as " +SSN);
						}
					 
			
					 }

						
						try { 
						    Alert alert = driver.switchTo().alert();
						    alert.accept();
						    //if alert present, accept and move on.														
							
						}
						catch (NoAlertPresentException e) {
						    //do what you normally would if you didn't have the alert.
						}
			}
	}	
		  
	}		
	
	
	
	
	
	
	
}
