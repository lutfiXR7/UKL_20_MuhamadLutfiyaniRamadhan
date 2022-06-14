/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author muhammad lutfi
 */
public class Transaksi {
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>(); // untuk input id jenis laundry
    private ArrayList<Integer> banyak = new ArrayList<Integer>(); // untuk input berapa banyak setiap jenis laundry
    private ArrayList<Integer> idClient = new ArrayList<Integer>(); // untuk id clinet yang mencuci
// codingan dibawah ini akan muncul pada tabel laporan dan menjadi total omset
    public Transaksi() {     //konstraktor         // dibawah ini menggunakan codingan jenis inheritance (this)
    this.idClient.add(0); // id client adi
    this.idJenisLaundry.add(0); // jenis "pakaian"
    this.banyak.add(0); 
    this.idClient.add(0);
    this.idJenisLaundry.add(1); // jenis "Selimut"
    this.banyak.add(0);
    this.idClient.add(1);// id client budi
    this.idJenisLaundry.add(0);
    this.banyak.add(0);
    this.idClient.add(1);
    this.idJenisLaundry.add(2); // jenis "Bantal/boneka"
    this.banyak.add(0);
 }
 public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry
    jenisLaundry){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Silahkan Memesan Jasa Laundry");
    System.out.println("Masukkan ID Member");
    int idClient = myObj.nextInt();
    System.out.println("Selamat datang "+client.getNama(idClient));
    ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    ArrayList<Integer> banyak = new ArrayList<Integer>();
    int i=0;
    int temp=0;
    do{
    System.out.println("Masukkan kode Jenis Laundry :"); // untuk memasukan input id jenis laundry
    temp=myObj.nextInt();
    if (temp!=99){ // 99 untuk menyetop aktifitas laundry yang terjadi
        idJenisLaundry.add(temp);
        System.out.print(jenisLaundry.getNamaJenis(idJenisLaundry.get(i))+ "sebanyak : "); // banyaknya
        banyak.add(myObj.nextInt());
        i++;
    }
    }while (temp!=99);

    System.out.println("Transaksi belanja "+client.getNama(idClient)+"sebagai berikut"); // untuk transaksi belanja
    System.out.println("Jenis Laundry \tQty \tHarga \tJumlah \t"); // untuk penotalan

    int total=0;
    int x = idJenisLaundry.size();
    for (int j = 0; j < x; j++){
        int jumlah=banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
        total+=jumlah;
        System.out.println(jenisLaundry.getNamaJenis(idJenisLaundry.get(j))+"\t"+
        banyak+"\t"+
        jenisLaundry.getHarga(idJenisLaundry.get(j))+"\t"+jumlah);
        transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),banyak.get(j));
    }

    System.out.println("Total Belanja : "+total); // total penotalan berapa banyak, jenis, dan harga
        client.editSaldo(idClient, client.getSaldo(idClient)-total);
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya){ // dibawah ini termasuk inheritance (this)
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
    }
    // dibawah ini menggunakan inheritance (this)
    public int getIdJenisLaundry(int id){  // getter untuk memanggil
        return this.idJenisLaundry.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdClient(int id){
        return this.idClient.get(id);
    } 
    public int getJmlTransaksi(){
        return this.idClient.size();
    } 
}

   

