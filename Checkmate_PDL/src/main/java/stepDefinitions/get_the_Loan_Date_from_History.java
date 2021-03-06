package stepDefinitions;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class get_the_Loan_Date_from_History extends CKM_PDL {
public static void get_the_Loan_Date_from_History(String SSN) throws Exception {

		
		int lastrow = TestData.getLastRow("NewLoan");
		System.out.println("NewLoan " + lastrow);
		String sheetName = "NewLoan";
		for (int row = 2; row <= lastrow; row++) {
			String RegSSN = TestData.getCellData(sheetName, "SSN", row);
			if (SSN.equals(RegSSN)) {

				
				
				test.log(LogStatus.INFO, "get_the_loan_Date_from_History");

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
				
				driver.findElement(By.name("transactionList")).sendKeys("History");
			

					driver.findElement(By.xpath("//input[@value='Go' and @type='button']")).click();
					// driver.findElement(By.id("go_Button")).click();
				

				
				driver.switchTo().defaultContent();
				driver.switchTo().frame("mainFrame");
				driver.switchTo().frame("main");
			

				// *[@id="transactionHistoryTable"]/tbody/tr/td[3]/table/tbody/tr[4]/td/span[2]
				
				date = driver.findElement(By.xpath("//*[@id=\"transactionHistoryTable\"]/tbody/tr[5]/td[1]/span[2]")).getText();
				loan_number = driver.findElement(By.xpath("//*[@id=\"transactionHistoryTable\"]/tbody/tr[3]/td[1]/span[2]")).getText();
				test.log(LogStatus.PASS, "Capture loandate" + date);
				test.log(LogStatus.PASS, "loan number " + loan_number);
				System.out.print(date);
				

				

			}
		}
	}
	
	
	
	
	
}
