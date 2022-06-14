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
public class Client implements User{                   // memakai bahasa codingan interface (implements) + polymirphisme
    private ArrayList<String> namaClient = new ArrayList<String>();  // termasuk ke dalam codingan jenis encapsulapsi (private)
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {   //kontraktor              //dibawah ini memakai codingan jenis inheritance (this)
        this.namaClient.add("adi");
        this.alamat.add("sawojajar");
        this.telepon.add("08123456666");
        this.saldo.add(100000);

        this.namaClient.add("budi");
        this.alamat.add("bululawang");
        this.telepon.add("081222233344");
        this.saldo.add(200000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);              // memakai codingan jenis inheritance (this)
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    // dibawah ini menggunakan jenis codingan overriding untuk menjadi polymirphisme
    @Override                    // dari sini sampai bawah memakai codingan jenis overriding
    public void setNama(String namaClient ){ //seter untuk mengatur nama client
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int idClient){ // getter = memanggil nama client
        return this.namaClient.get(idClient);
    }

    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
}
