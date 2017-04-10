package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbManager {

	private Connection c;

	public void connection() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
			System.out.println("Database connection opened.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnection() {
		try {
			c.close();
			System.out.println("Database connection closed.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void createTables() {
		try {
			// Create tables: begin

			Statement stmt1 = c.createStatement();

			String sql1 = "CREATE TABLE film " + "(f_id INTEGER  PRIMARY KEY AUTOINCREMENT,"
					+ " title     TEXT     NOT NULL, " + " length  INTEGER," + " country TEXT NOT NULL,"
					+ " photo	BLOB," + " p_id_director INTEGER REFERENCES  person (p_id),"
					+ " ost_id INTEGER REFERENCES  ost (ost_id),"
					+ " r_id INTEGER REFERENCES  release (r_id))";

			stmt1.executeUpdate(sql1);
			stmt1.close();
}
