/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kriteria;
import Penilaian.Perhitungan;
/**
 *
 * @author hp
 */
public class Programmer extends InputNilai implements Perhitungan {
   public Programmer (String nama, int tesX, int tesY, int tesZ){
        super(nama, tesX, tesY, tesZ);
    }
    
    public void inputTesX(int tesX) {
        this.tesX = tesX;
    }

     public void inputTesY(int tesY) {
        this.tesY = tesY;
    }

     public void inputTesZ(int tesZ) {
        this.tesZ = tesZ;
    }
     
    @Override
    public double NilaiTotal() {
         return (0.6 * super.tesX) + (0.15 * super.tesY) + (0.25 * super.tesZ);
    }
    
    @Override
    public String Keterangan() {
        if(this.NilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Programmer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Programmer\n";
    }
    
}