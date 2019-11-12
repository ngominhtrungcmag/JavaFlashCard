/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcrad.ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngomi
 */
public class ConnectDB {
    private Connection con;
    public void ConnectDB() throws ClassNotFoundException
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://NGOTRUNG\\SQLEXPRESS:1433;"
                    + "databaseName=FlashCard;user=sa; password=sa";
            Connection con = DriverManager.getConnection(dbUrl);
            System.out.println("Connect Database Completed!");
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            System.out.println("Connect Database Failed!");
        } 
    }
    public void DisconnectDB()
    {
        if (con != null)
        {
            try {
                con.close();
                System.out.println("Disconect Database Completed!");
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    public void Excute(String statement)
    {
        Statement s;
        try {
            s = con.createStatement();
            s.execute(statement);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet Result(String statement)
    {
        Statement s = null; 
        ResultSet rs= null;
        try {
        s  = con.createStatement();
        rs = s.executeQuery(statement);
         } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
