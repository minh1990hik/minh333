/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ketnoi {
    public static Connection lienket(){
     Connection c = null;
      try {
       c=DriverManager.getConnection("jdbc:mySQL://localhost:3306/quanlibanhang", "root", "258369");
       
      }
      catch(SQLException e){
       e.printStackTrace();
      }
       return c;
}

public static void dongketnoi(Connection c){
   try {
    if(c!=null)
        c.close();
   }
   catch(SQLException e){
   e.printStackTrace();;
   }
}
        }
