/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
/**
 *
 * @author user
 */
public class DB {
      private static final String server="jdbc:mysql://localhost:3306/keisu_bakers";
     private static final String username="root";
     private static final String password="";             
    
     public static  Connection createsConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection(server,username,password);
    
        return con;
     }
    
}
