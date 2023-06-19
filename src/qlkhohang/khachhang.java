/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author dminh
 */
public class khachhang {
 private int  CUSTOMER_ID;
 private String CUSTOMER_NAME;
 private String CUSTOMER_ADDRESS;
 private String CUSTOMER_PHONE_NUM;
 private String CUSTOMER_EMAIL;
 public khachhang(int ID, String NAME,String ADDRESS, String PHONE, String EMAIL){
 this.CUSTOMER_ID=ID;
 this.CUSTOMER_NAME=NAME;
 this.CUSTOMER_ADDRESS=ADDRESS;
 this.CUSTOMER_PHONE_NUM=PHONE;
 this.CUSTOMER_EMAIL=EMAIL;
 }
 public khachhang(){
 }
 public void setID(int ID){
 this.CUSTOMER_ID=ID;
 }
 public int getId(){
 return this.CUSTOMER_ID;
 }
 public void setNAME(String NAME){
 this.CUSTOMER_NAME=NAME;
 }
 public String getName(){
 return this.CUSTOMER_NAME;
 }
 public void setADDRESS(String ADDRESS){
     this.CUSTOMER_ADDRESS=ADDRESS;    
 }
 public String getADDRESS(){
 return this.CUSTOMER_ADDRESS;
 }
 public void setPHONE(String PHONE){
 this.CUSTOMER_PHONE_NUM=PHONE;
 }
 public String getPHONE(){
 return this.CUSTOMER_PHONE_NUM;
 }
 public void setEMAIL(String EMAIL){
     this.CUSTOMER_EMAIL=EMAIL;
 }
 public String getEMAIL(){
 return this.CUSTOMER_EMAIL;
 }
public ArrayList<Integer> idkhachhang(){
   ArrayList<Integer> list = new ArrayList<>();
   try {
     Connection c = ketnoi.lienket();
     Statement d = c.createStatement();
      ResultSet rs = d.executeQuery("SELECT * FROM quanlibanhang.khachhang");
      while(rs.next()){
      int ID = Integer.parseInt(rs.getString("CUSTOMER_ID"));
      list.add(Integer.parseInt(rs.getString("CUSTOMER_ID")));
      }
      ketnoi.dongketnoi(c);
   }
   catch(SQLException e){
   e.printStackTrace();
   }
   return list;
}
 
}
