/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author dminh
 */
public class nhacungcap {
    private int SUPPLIER_ID;
    private String SUPPLIER_NAME;
    private String SUPPLIER_ADDRESS;
    private String SUPPLIER_PHONE_NUM;      
    private String SUPPLIER_EMAIL;
     public  nhacungcap(int SUPPLIER_ID,String SUPPLIER_NAME,String SUPPLIER_ADDRESS,String SUPPLIER_PHONE_NUM,String SUPPLIER_EMAIL){
     this.SUPPLIER_ADDRESS=SUPPLIER_ADDRESS;
     this.SUPPLIER_ID=SUPPLIER_ID;
     this.SUPPLIER_EMAIL=SUPPLIER_EMAIL;
     this.SUPPLIER_NAME=SUPPLIER_NAME;
     this.SUPPLIER_PHONE_NUM=SUPPLIER_PHONE_NUM;
     }
     public nhacungcap(){
     }
     public void setID(int SUPPLIER_ID){
     this.SUPPLIER_ID=SUPPLIER_ID;
     } 
     public int getID(){
     return this.SUPPLIER_ID;
     }
     public void setNAME(String SUPPLIER_NAME){
     this.SUPPLIER_NAME=SUPPLIER_NAME;
     }
     public String getNAME(){
     return this.SUPPLIER_NAME;
     }
     public void setADDRESS(String ADDRESS){
     this.SUPPLIER_ADDRESS=ADDRESS;
     }
     public String getADDRESS(){
     return this.SUPPLIER_ADDRESS;
     }
     public void setPHONE(String phone){
     this.SUPPLIER_PHONE_NUM=phone;
     }
     public String getPHONE(){
     return this.SUPPLIER_PHONE_NUM;
     }
     public void setEMAIL(String Email){
     this.SUPPLIER_EMAIL=Email;
     }
     public String getEMAIL(){
     return this.SUPPLIER_EMAIL;
     }
     public ArrayList<Integer> danhsachid(){
         ArrayList<Integer> list = new ArrayList<>();
      try {
      Connection c = ketnoi.lienket();
      Statement d = c.createStatement();
      ResultSet rs = d.executeQuery("SELECT * FROM quanlibanhang.nhacungcap");
      while(rs.next()){
      list.add(Integer.parseInt(rs.getString("SUPPLIER_ID")));
      
      }
      
      ketnoi.dongketnoi(c);
      } catch(SQLException e){
      e.printStackTrace();
      }
      return  list;
     } 
    
}
