/**
 * 
 */
package edu.sollers.components;

import java.sql.*;

import edu.sollers.mvc.ResumeElement;

/**
 * @author Karanveer
 *
 */
public class Membership extends ResumeElement {
	private String membership;

	/**
	 * Constructor with parameter
	 * 
	 * @param membership String
	 */
	public Membership(String membership) {
		this.membership = membership;
	}

	// Static methods cannot be overridden

	public static String getTableName() {
		return "membership";
	}

	public static String getFieldOrder() {
		return "membership";
	}

	public static String getSelectClause() {
		return "select " + getFieldOrder() + " from " + getTableName();
	}

	@Override
	public String getInsertStatement() {
		return "insert into " + getTableName() + " (" + getFieldOrder() + ") values ('" + membership + "')";
	}

	@Override
	public void save() {
		Connection conn1;
		try {
			String url="jdbc:sqlite:/home/aluminium/Desktop/semi-resume_builder-master/resume.db";
			conn1 = DriverManager.getConnection(url);
			Statement stmt = conn1.createStatement();
			String sql = "Select * from personal_info where first_name = 1 ";
			ResultSet re = stmt.executeQuery(sql);
			while (re.next()) {
				String firstname = re.getString("first_name");
				System.out.println(firstname);
			}

			stmt = conn1.createStatement();
			int row = stmt.executeUpdate(getInsertStatement());
			if (row == 1)
				System.out.println("Inserted membership object into table");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the membership
	 */
	public String getMembership() {
		return membership;
	}

	@Override
	public String toString() {
		return "Membership: " + membership + "\n";
	}

}
