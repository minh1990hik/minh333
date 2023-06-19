/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;        
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author dminh
 */
public class donhangnhap {
    private String IMPORT_ID;
    private String ORDER_TIME_IMP;
    private String DELIVERY_IMP;
    private String TOTAL_COST_IMP;
    private int SUPPLIER_ID;
    public donhangnhap(String IMD, int ISP,String ORDER_TIME_IMP,String DELIVERY_IMP,String TOTAL_COST_IMP ){
    this.IMPORT_ID=IMD;
    this.SUPPLIER_ID=ISP;
    this.ORDER_TIME_IMP= ORDER_TIME_IMP;
    this.DELIVERY_IMP=DELIVERY_IMP;
    this.TOTAL_COST_IMP=TOTAL_COST_IMP;
    }
    public donhangnhap(){
    
    }
    public void setIID(String IID){
    this.IMPORT_ID=IID;
    }
    public String getIID(){
    return this.IMPORT_ID;
    }
    public void setISP(int ISP){
     this.SUPPLIER_ID=ISP;
    }
    public int getISP(){
    return this.SUPPLIER_ID;
    }
    public void setorder(String time){
    this.ORDER_TIME_IMP=time;
    }
    public String getorger(){
    return this.ORDER_TIME_IMP;
    }
    public void setdelivery(String dely){
    this.DELIVERY_IMP=dely;
    }
    public String getdelivery(){
    return this.DELIVERY_IMP;
    }
    public void setCOST(String cost){
    this.TOTAL_COST_IMP=cost;
    }
    public String getCOST(){
    return this.TOTAL_COST_IMP;
    }
    public ArrayList<Integer> iddonhangnhap(){
        ArrayList<Integer> list = new ArrayList<>();
      try{
       Connection c = ketnoi.lienket();
       Statement d = c.createStatement();
          ResultSet rs = d.executeQuery("SELECT * FROM quanlibanhang.donhangnhap ");
          while(rs.next()){
          int ID= Integer.parseInt(rs.getString("IMPORT_ID"));
           list.add(ID);
          }
      ketnoi.dongketnoi(c);
      }
      catch(SQLException e){
      e.printStackTrace();
      }
      return list;
    }
}
