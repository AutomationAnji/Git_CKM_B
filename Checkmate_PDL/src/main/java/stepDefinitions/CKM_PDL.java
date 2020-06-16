package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CKM_PDL {

	public static String AdminURL="https://192.168.2.199/cc/adminIndex.do";
	public static String AppURL="https://192.168.2.199/cc/index.do";
	public static Properties prop;
	String timestamp = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss").format(new Date());
	public static WebDriverWait wait;
	public static WebDriver driver;
	static String appUrl;

	public static ExtentReports reports;
	static ExtentReports reports2;
	public static String UserName;
	public static String UserNameAdmin;
	public static String ProductID;
	public static String State;
	public static String ProductType;
	
	public static String Password;
	public static String StoreId;
	public static ExtentTest test;
	public static ExtentTest test2;
	public static Excel TestData;
	public static String Due_Date;
	public static String SSN;
	public static String FileName;
	public static String date;
	public static String loandate;
	public static String loan_number;
	
	
}
