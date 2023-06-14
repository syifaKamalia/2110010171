/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author SYIFA
 */
public class datasetBangsal {
    
    private ArrayList<Integer> kdBang;
    private ArrayList<String> nmBang;
    private ArrayList<String> kelasBang;
    private ArrayList<Integer> jumlahBang;
    
    public datasetBangsal(){
        
        kdBang = new ArrayList<Integer>();
        nmBang = new ArrayList<String>();
        kelasBang = new ArrayList<String>();
        jumlahBang = new ArrayList<Integer>();
    }
    
    public void insertKdBang(Integer isi){     
        this.kdBang.add(isi);
    }
    
    public ArrayList<Integer> getRecordKdBang(){ 
        return this.kdBang;
    }
    
    public void insertNmBang(String isi){
        
        this.nmBang.add(isi);
    }
    
    public ArrayList<String> getRecordNmBang(){ 
        return this.nmBang;
    }
    
    public void insertKelasBang(String isi){     
        this.kelasBang.add(isi);
    }
    
    public ArrayList<String> getRecordKelasBang(){ 
        return this.kelasBang;
    }
    
    public void insertJumlahBang(Integer isi){     
        this.jumlahBang.add(isi);
    }
    
    public ArrayList<Integer> getRecordJumlahBang(){ 
        return this.jumlahBang;
    }
    
    
}
