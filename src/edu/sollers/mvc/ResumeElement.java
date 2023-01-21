/**
 * 
 */
package edu.sollers.mvc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Karanveer
 *
 */
public class ResumeElement {

	protected ResumeElement() {
	}

	protected Connection getConnection() throws SQLException {
		return ResumeBuilderController.getInstance().getConnection();
	}

	public static String getTableName() {
		return "";
	}

	public static String getFieldOrder() {
		return "";
	}

	public static String getSelectClause() {
		return "select " + getFieldOrder() + " from " + getTableName();
	}

	public String getInsertStatement() {
		return "insert into " + getTableName() + " (" + getFieldOrder() + ") values (" + ")";
	}

	public String getUpdateStatement() {
		return "update " + getTableName() + "";
	}

	public void save() {
	}
}
