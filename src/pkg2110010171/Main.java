/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010171;
import sensus.*;
import java.util.Date;
import dataset.*;
import forms.*;

/**
 *
 * @author Syifa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //menampilkan constructor overload pada setiap class
//        
//        //membuat object dari class pasien ( object : Pasien)
//        pasien Pasien = new pasien(1, "syifa", "bjm", "perempuan", new Date(103,9,21), "islam", "mhs", "08875036138", "masuk");
//    
//        //membuat object dari class bangsal ( object : Bangsal)
//        bangsal Bangsal = new bangsal(1, "melati", "A", 5);
//    
//        //membuat object dari class diagnosa ( object : Diagnosa)
//        diagnosa Diagnosa = new diagnosa(1, "Kanker");
//
//        //membuat object dari class transaksiPasienMasuk ( object : Masuk)
//        transaksiPasienMasuk Masuk = new transaksiPasienMasuk(1, 1, new Date(), 1, 1, "masuk");
//
//        //membuat object dari class transaksiPasienPindah ( object : Pindah)
//        transaksiPasienPindah Pindah = new transaksiPasienPindah(2, 1, new Date(), 1, 1, "pindah"); 
//       
//        //membuat object dari class login ( object : Login)
//        login Login = new login("syifakml", "123", "syifa", "pasien");
//        
//        
//        // Menampilkan data pada objek(method overload)      
//        Pasien.tampilkanDataPasien();       
//        Bangsal.tampilkanInfoBangsal();      
//        Diagnosa.tampilkanInfoDiagnosa();    
//        Masuk.tampilkanPasienMasuk();   
//        Pindah.tampilkanPasienPindah();
//        Login.tampilkanLogin(); 
          
//        datasetBangsal bangsal = new datasetBangsal();
//           
//            bangsal.insertKdBang(2);
//            bangsal.insertNmBang("Syifa");
//            bangsal.insertKelasBang("A");
//            bangsal.insertJumlahBang(4);
//                
//                System.out.println("DATASET BANGSAL");
//                System.out.println("-------------------------");
//                System.out.println("Kode Bangsal : "+bangsal.getRecordKdBang());
//                System.out.println("Nama Bangsal : "+bangsal.getRecordNmBang());
//                System.out.println("Kelas Bangsal : "+bangsal.getRecordKelasBang());
//                System.out.println("Jumlah Bangsal : "+bangsal.getRecordJumlahBang());  
//                System.out.println("-------------------------");
//                
//        datasetDiagnosa diagnosa = new datasetDiagnosa();
//           
//            diagnosa.insertKdDiag(1);
//            diagnosa.insertNmDiag("Cacar");
//                
//                System.out.println("DATASET DIAGNOSA");
//                System.out.println("-------------------------");
//                System.out.println("Kode Diagnosa : "+diagnosa.getRecordKdDiag());
//                System.out.println("Nama Diagnosa : "+diagnosa.getRecordNmDiag()); 
//                System.out.println("-------------------------");
//          
//        datasetLogin login = new datasetLogin();
//           
//            login.insertUsername("Syifa");
//            login.insertPassword("123sk");
//            login.insertNama("Syifa Kamalia");
//            login.insertLevel("pasien");
//                
//                System.out.println("DATASET LOGIN");
//                System.out.println("-------------------------");
//                System.out.println("Username : "+login.getRecordUsername());
//                System.out.println("Password : "+login.getRecordPassword());
//                System.out.println("Nama :"+login.getRecordNama());
//                System.out.println("Level :"+login.getRecordLevel()); 
//                System.out.println("-------------------------");
//          
//        datasetPasien pasien = new datasetPasien();
//           
//            pasien.insertNoRM(1);
//            pasien.insertNmPasien("Syifa Kamalia");
//            pasien.insertAlamat("Banjarmasin");
//            pasien.insertJk("Perempuan");
//            pasien.insertTglLahir(new Date(103,9,21));
//            pasien.insertAgama("Islam");
//            pasien.insertPekerjaan("Mahasiswa");
//            pasien.insertNoTelp("+62 887 5036 138");
//            pasien.insertJenisPas("Pasien Masuk");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No RM : "+pasien.getRecordNoRM());
//                System.out.println("Nama Pasien : "+pasien.getRecordNmPasien());
//                System.out.println("Alamat : "+pasien.getRecordAlamat());
//                System.out.println("Jenis Kelamin : "+pasien.getRecordJk()); 
//                System.out.println("Tanggal Lahir : "+pasien.getRecordTglLahir());
//                System.out.println("Agama : "+pasien.getRecordAgama());
//                System.out.println("Pekerjaan : "+pasien.getRecordPekerjaan());
//                System.out.println("No Telp : "+pasien.getRecordNoTelp()); 
//                System.out.println("Jenis Pasien : "+pasien.getRecordJenisPas()); 
//                System.out.println("-------------------------");
//          
//        datasetTransaksiPasienMasuk masuk = new datasetTransaksiPasienMasuk();
//           
//            masuk.insertNoReg(1);
//            masuk.insertNoRM(1);
//            masuk.insertTglMasuk(new Date());
//            masuk.insertKdDiag(1);
//            masuk.insertKdBang(1);
//            masuk.insertStatus("Pasien Masuk");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No Reg : "+masuk.getRecordNoReg());
//                System.out.println("No RM : "+masuk.getRecordNoRM());
//                System.out.println("Tanggal Masuk : "+masuk.getRecordTglMasuk());
//                System.out.println("Kode Diagnosa : "+masuk.getRecordKdDiag());
//                System.out.println("Kode Bangsal : "+masuk.getRecordKdBang());
//                System.out.println("Status : "+masuk.getRecordStatus()); 
//                System.out.println("-------------------------");
//          
//        datasetTransaksiPasienPindah pindah = new datasetTransaksiPasienPindah();
//           
//            pindah.insertNoRegP(1);
//            pindah.insertNoRM(1);
//            pindah.insertTglPindah(new Date());
//            pindah.insertKdDiag(1);
//            pindah.insertKdBang(1);
//            pindah.insertStatus("Pasien Pindah");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No Reg : "+pindah.getRecordNoRegP());
//                System.out.println("No RM : "+pindah.getRecordNoRM());
//                System.out.println("Tanggal Pindah : "+pindah.getRecordTglPindah());
//                System.out.println("Kode Diagnosa : "+pindah.getRecordKdDiag());
//                System.out.println("Kode Bangsal : "+pindah.getRecordKdBang());
//                System.out.println("Status : "+pindah.getRecordStatus()); 
//                System.out.println("-------------------------");

    new frameUtama().setVisible(true);
    }
    
}
