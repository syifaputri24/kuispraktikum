/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;
import Kriteria.InputNilai;
import Kriteria.Designer;
import Kriteria.Manager;
import Kriteria.Programmer;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("|Pelamaran Lowongan Pekerjaan|");
        System.out.println("==============================");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
        //scanner berupa data
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Input Nama : ");
        String nama = data.next();
        
        System.out.println("+++ Penilaian +++");
        System.out.println("Keterangan: Nilai yang valid berada do antara 0-100");
        
        if (pilih == 1){
            //programmer
            System.out.print("Input Nilai Programming Knowledge : ");
            int tesX= data.nextInt();
            System.out.print("Input Nilai Clean Coding : ");
            int tesY = data.nextInt();
            System.out.print("Input Nilai Debugging : ");
            int tesZ = data.nextInt();
            Programmer prog = new Programmer (nama,tesX,tesY,tesZ);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Keluar");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + prog.NilaiTotal());
                    System.out.println("Keterangan : " + prog.Keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Programming Knowledge : ");
                    prog.inputTesX(input.nextInt());
                    System.out.print("Input Nilai Clean Coding : ");
                    prog.inputTesY(input.nextInt());
                    System.out.print("Input Nilai Debugging : ");
                    prog.inputTesZ(input.nextInt());
                    
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            int tesX= data.nextInt();
            System.out.print("Input Nilai Prototyping : ");
            int tesY = data.nextInt();
            System.out.print("Input Nilai Creativity : ");
            int tesZ = data.nextInt();
            Designer des = new Designer(nama, tesX, tesY, tesZ);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + des.NilaiTotal());
                    System.out.println("Keterangan : " + des.Keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    des.inputTesX(input.nextInt());
                    System.out.print("Input Nilai Prototyping : ");
                    des.inputTesY(input.nextInt());
                    System.out.print("Input Nilai Creativity : ");
                    des.inputTesZ(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            int tesX= data.nextInt();
            System.out.print("Input Nilai Decision Making : ");
            int tesY = data.nextInt();
            System.out.print("Input Nilai Communication: ");
            int tesZ = data.nextInt();
            Manager manag = new Manager(nama, tesX, tesY, tesZ);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + manag.NilaiTotal());
                    System.out.println("Keterangan : " + manag.Keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    manag.inputTesX(input.nextInt());
                    System.out.print("Input Nilai Decision Making  : ");
                    manag.inputTesY(input.nextInt());
                    System.out.print("Input Nilai Communication: ");
                    manag.inputTesZ(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
    }
    
}