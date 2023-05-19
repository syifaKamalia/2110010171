/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010171;
import sensus.*;
import java.util.Date;
/**
 *
 * @author Syifa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menampilkan constructor overload pada setiap class
        
        //membuat object dari class pasien ( object : Pasien)
        pasien Pasien = new pasien(1, "syifa", "bjm", "perempuan", new Date(103,9,21), "islam", "mhs", "08875036138", "masuk");
    
        //membuat object dari class bangsal ( object : Bangsal)
        bangsal Bangsal = new bangsal(1, "melati", "A", 5);
    
        //membuat object dari class diagnosa ( object : Diagnosa)
        diagnosa Diagnosa = new diagnosa(1, "Kanker");

        //membuat object dari class transaksiPasienMasuk ( object : Masuk)
        transaksiPasienMasuk Masuk = new transaksiPasienMasuk(1, 1, new Date(), 1, 1, "masuk");

        //membuat object dari class transaksiPasienPindah ( object : Pindah)
        transaksiPasienPindah Pindah = new transaksiPasienPindah(2, 1, new Date(), 1, 1, "pindah"); 
       
        //membuat object dari class login ( object : Login)
        login Login = new login("syifakml", "123", "syifa", "pasien");
        
        
        // Menampilkan data pada objek(method overload)      
        Pasien.tampilkanDataPasien();       
        Bangsal.tampilkanInfoBangsal();      
        Diagnosa.tampilkanInfoDiagnosa();    
        Masuk.tampilkanPasienMasuk();   
        Pindah.tampilkanPasienPindah();
        Login.tampilkanLogin();
    }
    
}
