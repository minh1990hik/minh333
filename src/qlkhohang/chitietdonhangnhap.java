/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
public class chitietdonhangnhap {
   private String IMPORTDETAIL_ID;
    private String PRODUCT_ID;
    private String QUANTITY_IMP;
    private String COST_EXP;
    private String IMPORT_ID;
    public chitietdonhangnhap(String IID,String ID, String PD, String QMP, String CXP){
    this.IMPORTDETAIL_ID=IID;
    this.IMPORT_ID=ID;
    this.PRODUCT_ID=PD;
    this.QUANTITY_IMP=QMP;
    this.COST_EXP=CXP;
    }
    public void setIMPORTDETAILID(String IID){
    this.IMPORTDETAIL_ID=IID;
    }
    public String getIMPORTDETAILID(){
    return this.IMPORTDETAIL_ID;
    }
    public void setIMPORTID(String ID){
        this.IMPORT_ID=ID;
    }
    public String getIMPORTID(){
    return this.IMPORT_ID;
    }
    public void setPRODUCID(String PD){
     this.PRODUCT_ID=PD;
    }
    public String getPRODUCTID(){
    return this.PRODUCT_ID;
    }
    public void setQUANTIFYIMP(String QMP){
    this.QUANTITY_IMP=QMP;
    }
    public String getQUANTIFYIMP(){
    return this.QUANTITY_IMP;
    }
    public void setCOSTEXP(String CXP){
    this.COST_EXP=CXP;
    }
    public String getCOSTEXP(){
    return this.COST_EXP;
    }
    
}
