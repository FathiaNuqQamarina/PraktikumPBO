/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Latihan2_FathiaNuqQamarina_2009106012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in); // class scanner masukkan
         
        ////Algoritma Luas Lingkaran
        final double phi = 3.14; // final tipe data // konstatnta bernam
        double luasL; // deklarasi variabel luas dan phi
        //double radius = 20;// penugasan radius dalam program
        System.out.println("-- Menghitung Luas Lingkaran --");
        System.out.print("Masukan Radius Lingkaran : ");
        double radius1 = input.nextDouble(); // masukkan angka di console.
        
        luasL = radius1*radius1*phi; // rumus luas
        
        
        System.out.println("Luas Lingkaran = " +luasL);
        ////Algoritma Luas Lingkaran
        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        
        System.out.println("--- Latihan Minggu Ke-2 ---");
        //Latihan Minggu Ke-2
        System.out.println("---------------------------------");
        System.out.println("Latihan No.1");
        System.out.println("--- Program Konversi Suhu dari Celcius Ke Fahrenheit --- ");
        System.out.print("Masukkan Suhu dalam Celcius :");
        float suhu_celcius = input.nextFloat();
        
        float konver_fahrenheit = suhu_celcius * (9/5)+32;
        
        System.out.println(suhu_celcius+ " derajat Celcius sama dengan " + konver_fahrenheit);
        
                
         
        System.out.println("---------------------------------");
        System.out.println("Latihan No.2");
         //Deklarasi variabel
        double luas, volume, panjang;
        final double phi2=3.14;
        int radius;

       //Input nilai radius
       System.out.print("Masukan Radius : ");
       radius =input.nextInt();

       //Menghitung luas lingkaran
       luas= phi2*radius*radius;
       
       System.out.print("Masukan Panjang : ");
       panjang =input.nextInt();
       
       volume = luas * panjang;

       //Tampilkan hasil
       System.out.println("Luas = "+luas);
        
       System.out.println("volume = "+volume);
        
       
       
       
        System.out.println("---------------------------------");
        System.out.println("Latihan No.3");
        //Deklarasi Vaeiabel
        final double kaki = 0.305;
        double ubah_meter;
        // Masukkan Angka yg di KOnversi
        System.out.print("Masukan Angka dalam Kaki yang ingin di konversi Ke Meter : ");
        double konver = input.nextDouble();
        // Rumus perubahan dari satuan kaki ke meter
        ubah_meter = kaki*konver;
        
        System.out.println ("Hasil Konversi = " +konver + " Kaki" +" adalah "+ubah_meter+ " meter");
        
        
        
    }
    
}
