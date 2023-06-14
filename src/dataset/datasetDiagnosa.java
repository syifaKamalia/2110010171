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
public class datasetDiagnosa {
    
    private ArrayList<Integer> kdDiag;
    private ArrayList<String> nmDiag;
    
    public datasetDiagnosa(){
        
        kdDiag = new ArrayList<Integer>();
        nmDiag = new ArrayList<String>();
    }
    
    public void insertKdDiag(Integer isi){     
        this.kdDiag.add(isi);
    }
    
    public ArrayList<Integer> getRecordKdDiag(){ 
        return this.kdDiag;
    }
    
    public void insertNmDiag(String isi){
        
        this.nmDiag.add(isi);
    }
    
    public ArrayList<String> getRecordNmDiag(){ 
        return this.nmDiag;
    }
    
}
