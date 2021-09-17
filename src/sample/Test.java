package sample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

    public static void main(String[] args){

        String connectionURL = "jdbc:sqlserver://localhost:1433;database=AdventureWorks2019;integratedSecurity = true";

        try {
            Connection connection = DriverManager.getConnection(connectionURL);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Person.Person");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Name:" + resultSet.getString("FirstName") + " " + resultSet.getString("LastName"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
