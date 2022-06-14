/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

/**
 *
 * @author muhammad lutfi
 */
public class Subclass  extends Siswa{
    String nama = "Lutfi";

    @Override
    public void kelas() {
        super.kelas();
    }

    @Override
    public void Nama() {
        System.out.println("Nama saya " + this.nama);
    }

    public void Alamat(){
        System.out.println("Malang, Jawa TImur");
    }
}
    

