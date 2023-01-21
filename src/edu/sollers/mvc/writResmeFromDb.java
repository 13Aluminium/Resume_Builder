package edu.sollers.mvc;

import java.sql.*;
import java.io.*;

public class writResmeFromDb {
    public void getActivity() throws SQLException {
        Connection conn1;
        System.out.println("this is running");

        conn1 = DriverManager.getConnection("jdbc:sqlite:/home/aluminium/Desktop/semi-resume_builder-master/resume.db");

        Statement statement = conn1.createStatement();
        //for personal information exctraction
        String sql = "Select * from personal_info";

        ResultSet re = statement.executeQuery(sql);
        while (re.next()) {
            String firstname = re.getString("first_name");
            String lastname = re.getString("last_name");
            String email = re.getString("email");
            String addr = re.getString("street1");
            String addr2 = re.getString("street2");
            String city = re.getString("city");
            String state = re.getString("state");
            String zip = re.getString("zip");
            String sql1 = "Select * from Objective";
            //objective exctraction

            ResultSet re1 = statement.executeQuery(sql1);

                String objective = re1.getString("objective");

            //      for summary exctraction

            String sql2 = "Select * from summary";

            ResultSet re2 = statement.executeQuery(sql2);
                String Summary = re1.getString("summary");

            // for education exctraction

            String sql3 = "Select * from education";

            ResultSet re3 = statement.executeQuery(sql3);
            String schoolname = re3.getString("school_name");



            System.out.println(firstname);
            try {
                File myObj = new File("firat.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("First name :"+firstname+"\n");
                myWriter.write("Last name :"+lastname+"\n");
                myWriter.write("EMAIL ID :"+email+"\n");
                myWriter.write("adrress :"+addr+addr2+"\n");
                myWriter.write("city :"+city+"\n");
                myWriter.write("state :"+state+"\n");
                myWriter.write("zip :"+zip+"\n");
                myWriter.write("Goal :"+objective+"\n");
                myWriter.write("about myself :"+Summary+"\n");




                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }

    }
}