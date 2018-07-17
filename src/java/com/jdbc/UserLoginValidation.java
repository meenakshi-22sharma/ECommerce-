/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc;

import com.beans.UserLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Meenakshi Sharma
 */
public class UserLoginValidation {
    public static ResultSet isUserValid(UserLogin ul)
    {
         ResultSet isUserExists = null;
         try{
             String sql="select * register where USERNAME=? and PASSWORD=?";
             Connection con= DatabaseConnection.ConnectDb();
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setString(2,ul.getUsername().trim());      // here start index with 0 1 2 3..setString
             ps.setString(3,ul.getPassword().trim());
             ResultSet rs=ps.executeQuery();
             if(rs.next()){
                 isUserExists=rs;
             }
         }
         catch(Exception e){
             
         }
         return isUserExists;
    }
}
