/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
public class sanpham {
    // 7 thuoc tinh
   private int PRODUCT_ID;
   private String PRODUCT_NAME;
   private String PRODUCT_DESCRIPTION;
   private String PRODUCT_PRICE;
   private String PRODUCT_IVENTORY;
   private String PRODUCT_TYPE;
   private String LOCATED_ID;
    public sanpham(int PRODUCT_ID, String PRODUCT_DESCRIPTION,String PRODUCT_PRICE,String PRODUCT_IVENTORY,String PRODUCT_TYPE,String LOCATION_ID,String name){
        this.PRODUCT_ID=PRODUCT_ID;
        this.PRODUCT_DESCRIPTION=PRODUCT_DESCRIPTION;
        this.PRODUCT_PRICE=PRODUCT_PRICE;
        this.PRODUCT_IVENTORY=PRODUCT_IVENTORY;
        this.PRODUCT_TYPE=PRODUCT_TYPE;
        this.LOCATED_ID=LOCATED_ID;
        this.PRODUCT_NAME=name;
    }
    public void setID(String id){
    this.LOCATED_ID=id;
    }
    public int getID(){
    return this.PRODUCT_ID;
    }
    public void setDES(String des){
    this.PRODUCT_DESCRIPTION=des;
    }
    public String getDES(){
    return this.PRODUCT_DESCRIPTION;
    }
    public void setPRICE(String price){
    this.PRODUCT_PRICE=price;
    }
    public String getPRICE(){
    return this.PRODUCT_PRICE;
    }
    public void setName(String name){
    this.PRODUCT_NAME=name;
    }
    public String getName(){
    return this.PRODUCT_NAME;
    }
    public void setIven(String iven){
    this.PRODUCT_IVENTORY=iven;
    }
    public String getIven(){
    return this.PRODUCT_IVENTORY;
    }
    public void setType(String type){
    this.PRODUCT_TYPE=type;
    }
    public String getType(){
    return this.PRODUCT_TYPE;
    }
    public void setLOCATION(String loca){
    this.LOCATED_ID=loca;
    }
    public String getLOCATION(){
    return this.LOCATED_ID;
    }
}
