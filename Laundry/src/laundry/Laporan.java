/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author muhammad lutfi
 */
// menggunakan overloding
public class Laporan { // untuk mengurusi tentang jenis laundry
    //modifier //return //nama method //
     public void laporan(JenisLaundry jenisLaundry){ 
        int x=jenisLaundry.getJmlJenis();

        System.out.println();
        System.out.println("Tabel Jenis Laundry"); // untuk memuncul tabel jenis laundry
        System.out.println();
        System.out.println("Nama Jenis \tDurasi(hr) \tHarga/kg"); // untuk memunculkan jenis, durasi, dan harga/kg
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getNamaJenis(i)+"\t"+
            jenisLaundry.getDurasi(i)+"\t"+jenisLaundry.getHarga(i));
            }
    }
    public void laporan(Client client){ //untuk mengurusi tentang client
        int x=client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client"); // untuk memunculkan tabel client
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo"); // untuk memunculkan nama, alamat, nomor telpom, dan saldo
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i)+"\t"+
            client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
            client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){ // untuk mengurusi tentang transaksi dan jenis laundry
        int x=transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi"); // untuk mengeluarkan laporan transaksi
        System.out.println();
        System.out.println("Nama jenis \tDurasi(hr) \tHarga/kg \tJumlah"); // untuk menjumlah semua laundry

        int total=0;
        for (int i = 0; i < x; i++) {
        int
            jumlah=transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total+=jumlah;

            System.out.println(jenisLaundry.getNamaJenis(transaksi.getIdJenisLaundry(i))+"\t"+

            transaksi.getBanyaknya(i)+"\t"+jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i))+"\t"+jumlah);
        }
        System.out.println("Total Omset ="+total); // untuk meng input total omset
    }
}


