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
public class Latihan2_Nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Latihan No.3");
        
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
