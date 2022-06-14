/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// disini tempat untuk running dari aplikasi laundry
package laundry; 

/**
 *
 * @author muhammad lutfi
 */
public class Laundry {

    /**
     * @param args the command line arguments
     */
    // pembuatan object
    public static void main(String[] args) { 
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();
        //pemanggilan object
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        laporanLaundry.laporan(transaksiLaundry,daftarJenisLaundry);
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
    }
    
}
// untuk id client pertama adi : 0
                           // budi : 1
// untuk id jenis laundry "pakaian" : 0
//                        "selimut" : 1
//                        "Bantal/boneka" : 2

// untuk menyetop menggunanan : 99
// untuk class Client dan Petugas diimplementasikan ke user + polymirphisme
// disini saya memakai encapsulapsi, inheritance, dan polymirphisme
// kemudian pada class transaksi ada keterangan dan nanti akan muncul pada tabel laporan dan menjadi total omset dan langsung tertera 97500
// Suatu interface bisa meng-extend satu atau lebih interface lainnya. Abstract class hanya bisa meng-extend
// satu abstract class dan meng-implement beberapa interface. 
// Suatu interface hanya bisa meng-extend interface lainnya. Dan tidak bisa meng-implement class atau interface lainnya.