/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Meenakshi Sharma
 */
public class DatabaseConnection {
    public static Connection con;
    /**
     * @param args the command line arguments
     */
    public static Connection ConnectDb(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","mee22nakshi");
            return con;
        }catch(Exception e)
        {
            /*JOptionPane.showMessageDialog(null, e);*/
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    
    }
    
    public static void CloseDb()
    {
        if(con!=null)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
