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
//kontruktor
public class Petugas implements User {           // disini memakai codingan jenis interface (implements) + polymirphisme               
    private ArrayList<String> namaPetugas = new ArrayList<String>(); // disini memakai codingan jenis encapsulapsi (private)
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {                       // dibawah ini menggunakan codingan jenis inheritance (this)
    this.namaPetugas.add("admin");
    this.alamat.add("kedung kandang");
    this.telepon.add("081112223333");
    this.jabatan.add(0);
    }
    public void setJabatan(int jabatan ){
    this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
    return this.jabatan.get(id);
    }
    public int getJmlPetugas(){
    return this.namaPetugas.size();
    }
    // disini menggunakan codingan jenis overriding untuk menjdikan inheritance
    @Override                                 // dari sini sampai bawah menggunakan codingan jenis overriding
    public void setNama(String namaPetugas ){
    this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat ){
    this.namaPetugas.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
    this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idPetugas){
    return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas){
    return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas){
    return this.telepon.get(idPetugas);
    }
}
