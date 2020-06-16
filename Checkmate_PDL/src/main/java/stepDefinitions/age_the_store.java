package stepDefinitions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.relevantcodes.extentreports.LogStatus;

public class age_the_store extends CKM_PDL{
	
	
	public static void age_the_store(String SSN, String FileName, String Days) throws ClassNotFoundException, SQLException, ParseException
	 
	{
		test.log(LogStatus.INFO, "*****Performing  age_the_store_to_gracedays *****");
		int lastrow=TestData.getLastRow("NewLoan");
		String sheetName="NewLoan";
		for(int row=2;row<=lastrow;row++)
		{	
			String RegSSN = TestData.getCellData(sheetName,"SSN",row);

			if(SSN.equals(RegSSN))
			{		
				//String AgeStore = TestData.getCellData(sheetName,"AgeStore",row);
				String AgeStore=Days;
						
		// Object of Connection from the Database
				Connection conn = null;
				
		// Object of Statement. It is used to create a Statement to execute the query
			    Statement stmt = null;
			    
	    // Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
				ResultSet resultSet = null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				test.log(LogStatus.INFO,"Connecting to DB and AgeStore has started");
				test.log(LogStatus.INFO, "******************************************************");
	    // Open a connection
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.254:1521:QFUNDUAT4", "CKMPRODV10_DEC0219", "CKMprodDec299");
				
				System.out.println("Connecting to DB");
				test.log(LogStatus.PASS, "Connecting to DB Successfully");
				//System.out.println();
			
				stmt = conn.createStatement();
				
						
						int IAgeStore=Integer.parseInt(AgeStore);
		    	//DueDate="12/18/2019";
				 DateFormat  df=new SimpleDateFormat("MM/dd/yyyy");
					Date DDueDateminus1 = df.parse(date);
					Calendar cal = Calendar.getInstance();
					 cal.setTime(DDueDateminus1);
					 cal.add(Calendar.DATE, IAgeStore);
					 Date DDueDate1= cal.getTime();
					 date =df.format(DDueDate1);
					 System.out.println(date);
						String DueDate0[] = date.split("/");

						String DueDate1 = DueDate0[0];

						String DueDate2 = DueDate0[1];

						String DueDate3 = DueDate0[2];
						
						date=DueDate0[1]+DueDate0[0]+DueDate0[2];
				
						resultSet = stmt.executeQuery("update ca_ss_store_date set st_date='"+date+"' where  st_code="+StoreId+" and st_date_id='PRO'");
				resultSet = stmt.executeQuery("commit");
                            
				test.log(LogStatus.PASS, "<FONT color=green style=Arial> After Age the Store the Date is  :" +date);
			
				
				
				
				
		// Closing Connection		
				
				if (resultSet != null) {
					try {
						resultSet.close();
					} catch (Exception e) {
					}
				}
				
				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
					}
				}
				
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
					}
				}
			}
		}
	}
}
