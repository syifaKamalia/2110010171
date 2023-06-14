/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetLogin {
    
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> nama;
    private ArrayList<String> level;
    
    
    public datasetLogin(){
        
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        nama = new ArrayList<String>();
        level = new ArrayList<String>();
    }
    
    public void insertUsername(String isi){     
        this.username.add(isi);
    }
    
    public ArrayList<String> getRecordUsername(){ 
        return this.username;
    }
    
    public void insertPassword(String isi){
        
        this.password.add(isi);
    }
    
    public ArrayList<String> getRecordPassword(){ 
        return this.password;
    }
    
    public void insertNama(String isi){     
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){ 
        return this.nama;
    }
    
    public void insertLevel(String isi){
        
        this.level.add(isi);
    }
    
    public ArrayList<String> getRecordLevel(){ 
        return this.level;
    }
    
}
