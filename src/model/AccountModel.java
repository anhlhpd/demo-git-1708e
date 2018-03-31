/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Phuong Anh
 */
public class AccountModel {

    public void save(Account acc) throws SQLException {
        Connection cnn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306", "root", "");
        Statement stt = cnn.createStatement();
        stt.execute("insert into accounts (name, balance) values (" + acc.getName() + ", " + acc.getBalance() + ")");
    }
}
