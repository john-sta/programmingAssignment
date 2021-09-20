package sample;

import javafx.fxml.FXML;
import sample.Test;
import sample.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Controller {

    @FXML
    Button button1 = new Button();
    @FXML
    Button button2 = new Button();
    @FXML
    TextArea textArea1 = new TextArea();

    String connectionURL = "jdbc:sqlserver://localhost:1433;database=AdventureWorks2019;integratedSecurity = true";

    @FXML
    public void button1(ActionEvent event) {

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
