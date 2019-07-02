package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Throwable e) {
			SysUtil.log(e);
		}
	}

	/**
	 * 测试数据库可用性
	 * @return
	 */
	public static boolean test() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(SysUtil.get("db_url"));
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			try { conn.close(); } catch(Throwable e) {};
		}
		return true;
	}
}
