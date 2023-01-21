package edu.sollers.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {
    private static Connection conn;

    public static void connect() {
        try {

            conn = DriverManager.getConnection("jdbc:sqlite:/home/aluminium/Desktop/semi-resume_builder-master/resume.db");
//
            System.out.println("\nConnection made\n\n");
//
//            Statement ps = conn.createStatement();
//            ps.execute("CREATE TABLE personal_info (\n" +
//                            "first_name TINYTEXT NOT NULL,\n" +
//                            "last_name TINYTEXT NOT NULL,\n" +
//                            "email TINYTEXT NOT NULL,\n" +
//                            "street1 TINYTEXT NOT NULL,\n" +
//                            "street2 TINYTEXT,\n" +
//                            "city TINYTEXT NOT NULL,\n" +
//                            "state TINYTEXT NOT NULL,\n" +
//                            "zip TINYTEXT NOT NULL);");
//            Statement ps1= conn.createStatement();
//            ps1.execute("CREATE TABLE summary (\n" +
//                    "summary TINYTEXT NOT NULL);");
//            Statement ps2= conn.createStatement();
//            ps2.execute("CREATE TABLE objective (\n" +
//                    "objective TINYTEXT NOT NULL);");
//            Statement ps3= conn.createStatement();
//            ps3.execute("CREATE TABLE education (\n" +
//                    "id INTEGER NOT NULL PRIMARY KEY,\n" +
//                    "school_name TINYTEXT NOT NULL,\n" +
//                    "school_city VARCHAR(20) NOT NULL,\n" +
//                    "school_state VARCHAR(20) NOT NULL,\n" +
//                    "degree TINYTEXT NOT NULL,\n" +
//                    "major TINYTEXT NOT NULL,\n" +
//                    "grad_month VARCHAR(15) NOT NULL,\n" +
//                    "grad_year INTEGER NOT NULL,\n" +
//                    "is_anticipated boolean);");
//            Statement ps4= conn.createStatement();
//            ps4.execute("CREATE TABLE experience (\n" +
//                    " id INTEGER NOT NULL PRIMARY KEY,\n" +
//                    " cmp_name TINYTEXT NOT NULL,\n" +
//                    " pos TINYTEXT NOT NULL,\n" +
//                    " cmp_loc TINYTEXT NOT NULL,\n" +
//                    " start_date TINYTEXT NOT NULL,\n" +
//                    " end_date TINYTEXT NOT NULL,\n" +
//                    " cmp_summ VARCHAR(100) NOT NULL);");
//            Statement ps5= conn.createStatement();
//            ps5.execute("CREATE TABLE publication (\n" +
//                    " id INTEGER NOT NULL PRIMARY KEY,\n" +
//                    " auth_name TINYTEXT NOT NULL,\n" +
//                    " title TINYTEXT NOT NULL,\n" +
//                    " year SMALLINT NOT NULL,\n" +
//                    " summary VARCHAR(100) NOT NULL); ");
//            Statement ps6= conn.createStatement();
//            ps6.execute("CREATE TABLE activity (\n" +
//                    " id INTEGER NOT NULL PRIMARY KEY,\n" +
//                    " activity TINYTEXT NOT NULL);");
//            Statement ps7= conn.createStatement();
//            ps7.execute("CREATE TABLE membership (\n" +
//                    " id INTEGER NOT NULL PRIMARY KEY,\n" +
//                    " membership TINYTEXT NOT NULL);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
