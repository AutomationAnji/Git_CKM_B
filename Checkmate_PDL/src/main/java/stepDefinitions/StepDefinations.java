package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations extends CKM_PDL {

	
	
	
//	@Before
//    public void beforeScenario(){
//        System.out.println("This will run before the Scenario");
//    } 
	
	@Given("^CA_PDL_014$")
	public void CA_PDL_014() throws Throwable {
		String FileName = "CA_PDL_014.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_014" + "_" + PayFrequency + "_" + CollateralType,
						"Loan– same day Void with secret code");

			}
		}
	}

	@Given("^CA_PDL_015$")
	public void CA_PDL_015() throws Throwable {
		FileName = "CA_PDL_015.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_015" + "_" + PayFrequency + "_" + CollateralType,
						"Loan – void on next day with secret code");

			}
		}
	}
	@Given("^CA_PDL_016$")
	public void CA_PDL_016() throws Throwable {
		FileName = "CA_PDL_016.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_016" + "_" + PayFrequency + "_" + CollateralType,
						"loan with disbursement cash ->void with cash");

			}
		}
	}
	@Given("^CA_PDL_017$")
	public void CA_PDL_017() throws Throwable {
		FileName = "CA_PDL_017.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_017" + "_" + PayFrequency + "_" + CollateralType,
						"loan with disbursement cash ->void with DC");

			}
		}
	}
	@Given("^CA_PDL_019$")
	public void CA_PDL_019() throws Throwable {
		FileName = "CA_PDL_019.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_019" + "_" + PayFrequency + "_" + CollateralType,
						"Loan– same day Rescind");
				

			}
		}
	}
	@Given("^CA_PDL_051$")
	public void CA_PDL_051() throws Throwable {
		FileName = "CA_PDL_051.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_051" + "_" + PayFrequency + "_" + CollateralType,
						"New Loan --> Age store up to some days before due date --> Partial Payment.");
				

			}
		}
	}
	@Given("^CA_PDL_052$")
	public void CA_PDL_052() throws Throwable {
		FileName = "CA_PDL_052.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_052" + "_" + PayFrequency + "_" + CollateralType,
						"New Loan --> Age store up to some days after due date --> Check Partial Payment transaction is displayed or not.");
				

			}
		}
	}
	@Given("^CA_PDL_053$")
	public void CA_PDL_053() throws Throwable {
		FileName = "CA_PDL_053.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_053" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as MO with different numbers =>Transaction should not be processed");
				

			}
		}
	}
	@Given("^CA_PDL_054$")
	public void CA_PDL_054() throws Throwable {
		FileName = "CA_PDL_054.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_054" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as MO with same numbers =>Transaction should not be processed");
				

			}
		}
	}
	@Given("^CA_PDL_055$")
	public void CA_PDL_055() throws Throwable {
		FileName = "CA_PDL_055.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_055" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as CCK with different numbers =>Transaction should not be processed");
				

			}
		}
	}
	@Given("^CA_PDL_056$")
	public void CA_PDL_056() throws Throwable {
		FileName = "CA_PDL_056.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_056" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed");
				

			}
		}
	}
	@Given("^CA_PDL_057$")
	public void CA_PDL_057() throws Throwable {
		FileName = "CA_PDL_057.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_057" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as Cash  =>Transaction should not be processed");
				

			}
		}
	}
	@Given("^CA_PDL_058$")
	public void CA_PDL_058() throws Throwable {
		FileName = "CA_PDL_058.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_058" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as Cash  =>Transaction should be processed");
				

			}
		}
	}
	@Given("^CA_PDL_059$")
	public void CA_PDL_059() throws Throwable {
		FileName = "CA_PDL_059.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_059" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CCK  =>Transaction should be processed");
				

			}
		}
	}
	@Given("^CA_PDL_060$")
	public void CA_PDL_060() throws Throwable {
		FileName = "CA_PDL_060.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_060" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CK  =>Transaction should be processed");
				

			}
		}
	}
	@Given("^CA_PDL_061$")
	public void CA_PDL_061() throws Throwable {
		FileName = "CA_PDL_061.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_061" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as MO  =>Transaction should be processed");
				

			}
		}
	}
	@Given("^CA_PDL_066$")
	public void CA_PDL_066() throws Throwable {
		FileName = "CA_PDL_066.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_066" + "_" + PayFrequency + "_" + CollateralType,
						"Loan -- Age the store up to some days before due date --Partial Payment with cash –Void");
				

			}
		}
	}
	@Given("^CA_PDL_067$")
	public void CA_PDL_067() throws Throwable {
		FileName = "CA_PDL_067.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_067" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed => Void with original tender");
				

			}
		}
	}	
	@Given("^CA_PDL_068$")
	public void CA_PDL_068() throws Throwable {
		FileName = "CA_PDL_068.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_068" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed => Void with Cash");
				

			}
		}
	}
	@Given("^CA_PDL_069$")
	public void CA_PDL_069() throws Throwable {
		FileName = "CA_PDL_069.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_069" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CCK  =>Transaction should be processed => Void with original tender");
				

			}
		}
	}
	
	@Given("^CA_PDL_070$")
	public void CA_PDL_070() throws Throwable {
		FileName = "CA_PDL_070.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_070" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CCK  =>Transaction should be processed => Void with cash"
						+ "");
				

			}
		}
	}
	
	@Given("^CA_PDL_071$")
	public void CA_PDL_071() throws Throwable {
		FileName = "CA_PDL_071.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_070" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CK  =>Transaction should be processed => Void with Original Tender"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_072$")
	public void CA_PDL_072() throws Throwable {
		FileName = "CA_PDL_072.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_072" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as CK  =>Transaction should be processed => Void with Cash"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_073$")
	public void CA_PDL_073() throws Throwable {
		FileName = "CA_PDL_073.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_073" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as MO  =>Transaction should be processed => Void with Original Tender"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_074$")
	public void CA_PDL_074() throws Throwable {
		FileName = "CA_PDL_074.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_074" + "_" + PayFrequency + "_" + CollateralType,
						"Advance =>Partial Payment with tender types as MO  =>Transaction should be processed => Void with Cash"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_083$")
	public void CA_PDL_083() throws Throwable {
		FileName = "CA_PDL_083.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_083" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with ACH --> Safe deposit on Due date → Payoff amount should display in Safe deposit"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_084$")
	public void CA_PDL_084() throws Throwable {
		FileName = "CA_PDL_083.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_084" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with ACH --> Partial Payment --> Safe deposit on Due date → pending amount should display in Safe deposit"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_085$")
	public void CA_PDL_085() throws Throwable {
		FileName = "CA_PDL_085.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_085" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with ACH --> Check edit from admin → Should display as Manual in Safe deposit on Due date"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_087$")
	public void CA_PDL_087() throws Throwable {
		FileName = "CA_PDL_087.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_087" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with ACH → mark Revoke from admin → Process Safe deposit on Due date"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_088$")
	public void CA_PDL_088() throws Throwable {
		FileName = "CA_PDL_088.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_088" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with RCPO --> Safe deposit on Due date → Payoff amount should display in Safe deposit"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_089$")
	public void CA_PDL_089() throws Throwable {
		FileName = "CA_PDL_089.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_089" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with RCPO --> Partial Payment --> Safe deposit on Due date → pending amount should display in Safe deposit"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_090$")
	public void CA_PDL_090() throws Throwable {
		FileName = "CA_PDL_090.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_090" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with RCPO --> Check edit from admin → Should display as Manual in Safe deposit on Due date"
						+ "");
				

			}
		}
	}
	@Given("^CA_PDL_092$")
	public void CA_PDL_092() throws Throwable {
		FileName = "CA_PDL_092.xls";
		TestData = new Excel(System.getProperty("user.dir")
				+ prop.getProperty("CKM_Store_Test_data_CA_PDL_path_samatha") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				
				// System.out.println(SSN);
				test = reports.startTest("CA_PDL_092" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with RCPO → mark Revoke from admin → Process Safe deposit on Due date"
						+ "");
				

			}
		}
	}
	@And("^Login into CSR$")
	public void login_into_CSR() throws Throwable {

		
		Login.Login(UserName, Password, StoreId);

	}
	
	@And("^Login into Admin$")
	public void login_into_Admin() throws Throwable {

		
		LoginAdmin.LoginAdmin(UserNameAdmin, Password, StoreId);

	}

	@Given("^Registration of the Borrower PDL$")
	public void Registration_of_the_Borrower_PDL() throws Throwable {

		Registration_of_the_Borrower_PDL.Registration_of_the_Borrower_PDL(driver, test, AppURL, SSN, FileName);
	}

	@Then("^New Loan taken for the user$")
	public void new_Loan_taken_for_the_user() throws Throwable {
		new_Loan_taken_for_the_user.new_Loan_taken_for_the_user(SSN, FileName, "200");

	}
	
	@Then("^Get the Due Date from History$")
	public void get_the_Due_Date_from_History() throws Throwable 
	{
		get_the_Due_Date_from_History.get_the_Due_Date_from_History(SSN);
	}

	@Then("^Age the store to \"(.*)\"$")  
	public void age_the_store_to_days(String days) throws Throwable {
		age_the_store.age_the_store(SSN, FileName, days);
	}
	
	@Then("^A_Age the store to \"(.*)\"$")  
	public void age_the_store_a(String days) throws Throwable {
		age_the_store_a.age_the_store_a(SSN, FileName, days);
	}
	
	
	
	
	
	@Then("^Void the transaction$")
	public void void_the_transaction() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		void_the_transaction.void_the_transaction();
	}
	@Then("^Get the Loan Date from History$")
	public void get_the_Loan_Date_from_History() throws Throwable 
	{
		get_the_Loan_Date_from_History.get_the_Loan_Date_from_History(SSN);
	}
	
	@Then("^Rescind the transaction$")
	public void rescind_the_transaction() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rescind_the_transaction.rescind_the_transaction();
	}	
	@Then("^Partial Payment Diff No$")
	public void partial_Payment_diff_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		partial_payment_diff_no.partial_payment_diff_no();
	}
	@Then("^Partial Payment Same No$")
	public void partial_Payment_same_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		partial_payment_same_no.partial_payment_same_no();
	}
	@Then("^Partial Payment$")
	public void partial_Payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		partial_payment.partial_payment();
	}
	
	@Then("^Safe deposit on duedate$")
	public void safe_deposit_on_duedate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		safe_deposit_on_duedate.safe_deposit_on_duedate();
	}

	@Then("^Payoff amount in Safe deposit$")
	public void payoff_amount_in_Safe_deposit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//payoff_amount_in_Safe_deposit.payoff_amount_in_Safe_deposit();
	}
	
	@Then("^Check edit from admin$")
	public void check_edit_from_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		check_edit_from_admin.check_edit_from_admin();
	}
	@Then("^History$")
	public void History() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		History.History(SSN,AppURL);
	}
	@Then("^Revoke from admin$")
	public void revoke_from_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		revoke_from_admin.revoke_from_admin();
	}
	
//	@Then("^Revoke from admin$")
//	public void revoke_from_admin() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		revoke_from_admin.revoke_from_admin();
//	}
}
