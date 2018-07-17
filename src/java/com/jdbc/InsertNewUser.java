/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;
import com.beans.RegisterClass;
import com.beans.RegisterClass;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meenakshi Sharma
 */
public class InsertNewUser {
   
   
    public static boolean insertUser(RegisterClass r) {
        
       boolean b=true;
        
        Connection con=DatabaseConnection.ConnectDb();
        try {
          
           String sql="insert into register values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, r.getName());
            ps.setString(2, r.getEmail());
             ps.setString(4, r.getUsername());
            ps.setString(3, r.getPassword());
            ps.setString(5, r.getTelephone());
          
            b=ps.execute();
        } catch (SQLException ex) {
             
            ErrorMessageInterface.USER_ERRROR_MSG=ex.getMessage();
 // Logger.getLogger(InsertNewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
           
           try {
               con.close();
           } catch (SQLException ex) {
               //Logger.getLogger(InsertNewStudent.class.getName()).log(Level.SEVERE, null, ex);
               ex.printStackTrace();
                      
           }
           
        }
        
        
      
    return b;
   }
}

