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
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import stepDefinitions.CKM_PDL;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class revoke_from_admin extends CKM_PDL{
	public static void revoke_from_admin() throws Exception {
		int lastrow = TestData.getLastRow("NewLoan");
	System.out.println("NewLoan " + lastrow);
	String sheetName = "NewLoan";
	for (int row = 2; row <= lastrow; row++) {
		String RegSSN = TestData.getCellData(sheetName, "SSN", row);
		ProductID=prop.getProperty("ProductID");
		if (SSN.equals(RegSSN)) {

			
			
			test.log(LogStatus.INFO, "revoke_from_admin");

			//System.out.println(ProductID);
			//String AppURL = TestData.getCellData(sheetName, "AppURL", row);
			//appUrl = AppURL;
			LoginAdmin.LoginAdmin(UserNameAdmin, Password, StoreId);
			
			Thread.sleep(2000);
			driver.switchTo().frame("topFrame");				
			driver.findElement(By.linkText("Transactions")).click();
			test.log(LogStatus.PASS, "Clicked on Transactions");
			Thread.sleep(500);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("mainFrame");
			Thread.sleep(500);
			driver.findElement(By.linkText("Revoke")).click();
			test.log(LogStatus.PASS, "Clicked on Revoke");		
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Revoke manual")).click();
			//driver.findElement(By.linkText("ACH")).click();
			test.log(LogStatus.PASS, "clicked on Revoke Manual:");
			driver.switchTo().frame("main");	
			Thread.sleep(3000);
			
			driver.findElement(By.name("requestBean.dealNbr")).sendKeys(loan_number);
			test.log(LogStatus.PASS, "entered the loan number  :"+loan_number);
			
			
			
			driver.findElement(By.name("Submit")).click();
			//driver.findElement(By.name("requestBean.type")).submit();
			test.log(LogStatus.PASS, "clicked on Submit  :");
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='button']")).click();
			test.log(LogStatus.PASS, "Click on Go Button");
			Thread.sleep(2000);

			driver.findElement(By.name("requestBean.revoke")).sendKeys("yes");
			test.log(LogStatus.PASS, "Entered revoke as Yes");

			driver.findElement(By.name("Submit")).click();
			test.log(LogStatus.PASS, "clicked on Finish Revoke");
			Thread.sleep(2000);
			String confirm=driver.findElement(By.xpath("//input[@value=' Ok ']")).getAttribute("value");
			
			Assert.assertEquals(confirm.trim(), "Ok");
			test.log(LogStatus.PASS, "Revoke Successfully");

		}
	}
}
}
