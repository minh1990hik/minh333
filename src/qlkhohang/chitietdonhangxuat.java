/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
public class chitietdonhangxuat {
    private int EXPORTDETAIL_ID;
    private int  EXPORT_ID;
    private String PRODUCT_ID;
    private String QUANTITY_EXP;
    private String PRICE_EXP;
    public chitietdonhangxuat(int EID, int ID, String PD, String QXP, String PE){
    this.EXPORTDETAIL_ID=EID;
    this.EXPORT_ID=ID;
    this.PRICE_EXP=PD;
    this.QUANTITY_EXP=QXP;
    this.PRICE_EXP=PE;
    }
    public void setEXPORTDETAILID(int EID){
     this.EXPORTDETAIL_ID=EID;
    }
    public int getEXPORTDETAILID(){
    return this.EXPORTDETAIL_ID;
    }
    public void setEXPORTID(int ID){
     this.EXPORT_ID=ID;
    }
    public int getEXPORTID(){
    return this.EXPORT_ID;
    }
    public void setPRODUCTID(String PD){
    this.PRODUCT_ID=PD;
    }
    public String getPRODUCTID(){
    return this.PRODUCT_ID;
    }
    public void setQUANTITYEXP(String QXP){
    this.QUANTITY_EXP=QXP;
    }
    public String getQUANTITYEXP(){
    return this.QUANTITY_EXP;
    }
    public void setPRICEEXP(String PE){
    this.PRICE_EXP=PE;
    }
    public String getPRICEEXP(){
    return this.PRICE_EXP;
    }
    
}
