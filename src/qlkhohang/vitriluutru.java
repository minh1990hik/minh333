/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlkhohang;

/**
 *
 * @author dminh
 */
public class vitriluutru {
    private int LOCATION_ID;
    private String LOCATION_NAME;
    private String LOCATION_DESCRIPTION;
    private String LOCATION_REPOSITORY;
    private String LOCATION_STATUS;
    public vitriluutru(int ID,String NAME,String DES, String REPO,String LOCA){
    this.LOCATION_ID=ID;
    this.LOCATION_NAME=NAME;
    this.LOCATION_DESCRIPTION=DES;
    this.LOCATION_REPOSITORY=REPO;
    this.LOCATION_STATUS=LOCA;
    }
    public void setID(int ID){
    this.LOCATION_ID=ID;
            }
    public int getID(){
    return this.LOCATION_ID;
    }
    public void setNAME(String NAME){
    this.LOCATION_NAME=NAME;
    }
    public String getNAME(){
    return this.LOCATION_NAME;
    }
    public void setDES(String DES){
    this.LOCATION_DESCRIPTION=DES;
    }
    public String getDES(){
    
    return this.LOCATION_DESCRIPTION;
            }
    public void setREPO(String REPO){
    this.LOCATION_REPOSITORY=REPO;
    }
    public String getREPO(){
    return this.LOCATION_REPOSITORY;
    }
    public void setSTATUS(String status){
    this.LOCATION_STATUS=status;
    }
    public String getSTATUS(){
    return this.LOCATION_STATUS;
    }
}

