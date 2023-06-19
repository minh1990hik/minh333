/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author dminh
 */
public class donhangxuat {
    private int EXPORT_ID;
    private int CUSTOMER_ID;
    private String DELIVERY_TIME_EXP;
    private String ORDER_TIME_EXP;
    private String TOTAL_PRICE_EXP;
    public donhangxuat(int EID, int CID, String DIE, String OTE, String TPE){
        this.EXPORT_ID=EID;
        this.CUSTOMER_ID=CID;
        this.DELIVERY_TIME_EXP=DIE;
        this.ORDER_TIME_EXP=OTE;
        this.TOTAL_PRICE_EXP=TPE;
    }
    public donhangxuat(){
    }
    public void setEXPORTID(int EID){
     this.EXPORT_ID=EID;
    }
    public int getEXPORTID(){
    return this.EXPORT_ID;
    }
    public void setCUSTOMERID(int CID){
    this.CUSTOMER_ID=CID;
    }
    public int getCUSTOMERID(){
    return this.CUSTOMER_ID;
    }
    public void setDELIVERYTIME(String DIE){
    this.DELIVERY_TIME_EXP=DIE;
    }
    public String getDELIVERYTIME(){
    return this.DELIVERY_TIME_EXP;
    }
    public void setORDERTIMEEXP(String OTE){
    this.ORDER_TIME_EXP=OTE;
    }
    public  String getORDERTIMEEXP(){
    return this.ORDER_TIME_EXP;
    }
    public void setTOTALPRICEEXP(String TPE){
    this.TOTAL_PRICE_EXP=TPE;
    }
    public String getTOTALPRICEEXP(){
    return this.TOTAL_PRICE_EXP;
    }
    public ArrayList<Integer> iddonhangxuat(){
    ArrayList<Integer> list = new ArrayList<>();
    try{
    Connection c = ketnoi.lienket();
    Statement d=c.createStatement();
    ResultSet rs = d.executeQuery("SELECT * FROM quanlibanhang.donhangxuat");
    while(rs.next()){
    int ID = Integer.parseInt(rs.getString("EXPORT_ID"));
    list.add(ID);
    }
    ketnoi.dongketnoi(c);
    } catch(SQLException e){e.printStackTrace();}
    return list;
    }
    
}
