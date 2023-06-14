/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SYIFA
 */
public class datasetTransaksiPasienMasuk {
    
    private ArrayList<Integer> noReg;
    private ArrayList<Integer> noRM;
    private ArrayList<String> tglMasuk;
    private ArrayList<Integer> kdDiag;
    private ArrayList<Integer> kdBang;
    private ArrayList<String> status;
    
    public datasetTransaksiPasienMasuk(){
        
        noReg = new ArrayList<Integer>();
        noRM = new ArrayList<Integer>();
        tglMasuk = new ArrayList<String>();
        kdDiag = new ArrayList<Integer>();
        kdBang = new ArrayList<Integer>();
        status = new ArrayList<String>();
    }
    
    public void insertNoReg(Integer isi){     
        this.noReg.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoReg(){ 
        return this.noReg;
    }
    
    public void insertNoRM(Integer isi){     
        this.noRM.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoRM(){ 
        return this.noRM;
    }
    
    public void insertTglMasuk(String isi){     
        this.tglMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordTglMasuk(){ 
        return this.tglMasuk;
    }
    
    public void insertKdDiag(Integer isi){     
        this.kdDiag.add(isi);
    }
    
    public ArrayList<Integer> getRecordKdDiag(){ 
        return this.kdDiag;
    }
    
    public void insertKdBang(Integer isi){
        
        this.kdBang.add(isi);
    }
    
    public ArrayList<Integer> getRecordKdBang(){ 
        return this.kdBang;
    }
    
    public void insertStatus(String isi){
        
        this.status.add(isi);
    }
    
    public ArrayList<String> getRecordStatus(){ 
        return this.status;
    }   
    
//    public boolean isTglMasuk() {
//        Date tglMasuk = new Date();
//        return tglMasuk.before(tglMasuk);
//    }
    
}
