package com.ss.mar.jb.WeekOneAssign;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ss.mar.jb.AssignmentFour.SingletonDoubleCheck;


public class SampleSingleton {

	private static Connection conn = null;

	private static SampleSingleton instance = null;

	public static SampleSingleton getInstance() {
		//1st check
		if (instance==null) {
			synchronized (SampleSingleton.class) {
				//2nd check
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}

		return instance;
	}

	public static void databaseQuery(BigDecimal input) {
		try {		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		BigDecimal x = new BigDecimal(0);
		while(rs.next()) {
			x = input.multiply(new BigDecimal(rs.getInt(1)));
		}

		} catch (Exception e) {
			// TODO: handle exception
		}


	}
}
