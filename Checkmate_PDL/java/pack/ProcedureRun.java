package pack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.relevantcodes.extentreports.LogStatus;

import oracle.jdbc.OracleTypes;

public class ProcedureRun extends AA_ILP{

	public static void bproc() throws ClassNotFoundException, SQLException {
		Connection conn = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.242:1521:QFUNDUAT2", prop.getProperty("db_username"),prop.getProperty("db_username"));


			
			String query = "{CALL PRC_QTP_SSN_FL_PDL_REVATHI}";
			CallableStatement stmt = conn.prepareCall(query);		
			stmt.execute();
			
	

	}

}
