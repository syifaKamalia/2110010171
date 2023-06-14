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
public class datasetTransaksiPasienPindah {
    
    private ArrayList<Integer> noRegP;
    private ArrayList<Integer> noRM;
    private ArrayList<String> tglPindah;
    private ArrayList<Integer> kdDiag;
    private ArrayList<Integer> kdBang;
    private ArrayList<String> status;
    
    public datasetTransaksiPasienPindah(){
        
        noRegP = new ArrayList<Integer>();
        noRM = new ArrayList<Integer>();
        tglPindah = new ArrayList<String>();
        kdDiag = new ArrayList<Integer>();
        kdBang = new ArrayList<Integer>();
        status = new ArrayList<String>();
    }
    
    public void insertNoRegP(Integer isi){     
        this.noRegP.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoRegP(){ 
        return this.noRegP;
    }
    
    public void insertNoRM(Integer isi){     
        this.noRM.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoRM(){ 
        return this.noRM;
    }
    
    public void insertTglPindah(String isi){     
        this.tglPindah.add(isi);
    }
    
    public ArrayList<String> getRecordTglPindah(){ 
        return this.tglPindah;
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
    
//    public boolean isTglPindah() {
//        Date tglPindah = new Date();
//        return tglPindah.before(tglPindah);
//    }
    
}
