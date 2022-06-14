/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;

/**
 *
 * @author muhammad lutfi
 */

public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>(); // termasuk ke dalam codingan jenis encapsulapsi (private)
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {  //konstraktor             // dibawah ini memakai codingan jenis inheritance (this)
    this.jenisLaundry.add("Pakaian");
    this.harga.add(10000);
    this.durasi.add(1);
    this.jenisLaundry.add("Selimut");
    this.harga.add(12500);
    this.durasi.add(1);
    this.jenisLaundry.add("Bantal/Boneka");
    this.harga.add(15000);
    this.durasi.add(2);              
    }
    public int getJmlJenis(){             //untuk memanggil         // termasuk kedalam codingan jenis inheritance (this)
    return this.jenisLaundry.size();
    }
    public void setNamaJenis(String jenisLaundry ){ // untuk mengatur
    this.jenisLaundry.add(jenisLaundry);
    }
    public String getNamaJenis(int idJenisLaundry){
    return this.jenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi ){
    this.durasi.add(durasi);
    }
    public int getDurasi(int idJenisLaundry){
    return this.durasi.get(idJenisLaundry);
    }
    public void setHarga(int harga ){
    this.harga.add(harga);
    }
    public int getHarga(int idJenisLaundry){
    return this.harga.get(idJenisLaundry);
    }
  }

