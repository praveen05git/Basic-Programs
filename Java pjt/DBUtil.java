package com.sastra.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sastra.exception.DataLayerException;

public class Dbutil {
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "system";
	static String pass = "sastra";

	public static Connection getmyconnection() throws DataLayerException {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connected");

		} catch (ClassNotFoundException e) {
			throw new DataLayerException(e.getMessage());
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}
		return con;
	}

	public static void closeconnection(Connection cone) throws DataLayerException {
		try {
			if (cone != null) {
				cone.close();
			}
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}
	}
		public static void closestatement(PreparedStatement pst) throws DataLayerException {
			try {
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				throw new DataLayerException(e.getMessage());
			}
		}
		public static void closeresultset(ResultSet rs) throws DataLayerException {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				throw new DataLayerException(e.getMessage());
			}
		}

}
