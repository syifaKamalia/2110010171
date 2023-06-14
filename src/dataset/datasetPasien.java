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
public class datasetPasien {
    
    private ArrayList<Integer> noRM;
    private ArrayList<String> nmPasien;
    private ArrayList<String> alamat;
    private ArrayList<String> jk;
    private ArrayList<String> tglLahir;
    private ArrayList<String> agama;
    private ArrayList<String> pekerjaan;
    private ArrayList<String> noTelp;
    private ArrayList<String> jenisPas;
    
    public datasetPasien(){
        
        noRM = new ArrayList<Integer>();
        nmPasien = new ArrayList<String>();
        alamat = new ArrayList<String>();
        jk = new ArrayList<String>();
        tglLahir = new ArrayList<String>();
        agama = new ArrayList<String>();
        pekerjaan = new ArrayList<String>();
        noTelp = new ArrayList<String>();
        jenisPas = new ArrayList<String>();
    }
    
    public void insertNoRM(Integer isi){     
        this.noRM.add(isi);
    }
    
    public ArrayList<Integer> getRecordNoRM(){ 
        return this.noRM;
    }
    
    public void insertNmPasien(String isi){
        
        this.nmPasien.add(isi);
    }
    
    public ArrayList<String> getRecordNmPasien(){ 
        return this.nmPasien;
    }
    
    public void insertAlamat(String isi){     
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){ 
        return this.alamat;
    }
    
    public void insertJk(String isi){
        
        this.jk.add(isi);
    }
    
    public ArrayList<String> getRecordJk(){ 
        return this.jk;
    }
    
    public void insertTglLahir(String isi){     
        this.tglLahir.add(isi);
    }
    
    public ArrayList<String> getRecordTglLahir(){ 
        return this.tglLahir;
    }
    
    public void insertAgama(String isi){     
        this.agama.add(isi);
    }
    
    public ArrayList<String> getRecordAgama(){ 
        return this.agama;
    }
    
    public void insertPekerjaan(String isi){
        
        this.pekerjaan.add(isi);
    }
    
    public ArrayList<String> getRecordPekerjaan(){ 
        return this.pekerjaan;
    }
    
    public void insertNoTelp(String isi){     
        this.noTelp.add(isi);
    }
    
    public ArrayList<String> getRecordNoTelp(){ 
        return this.noTelp;
    }
    
    public void insertJenisPas(String isi){
        
        this.jenisPas.add(isi);
    }
    
    public ArrayList<String> getRecordJenisPas(){ 
        return this.jenisPas;
    }    
    
//    public boolean isTglahir() {
//        Date tglLahir = new Date();
//        return tglLahir.before(tglLahir);
//    }
//    
}
