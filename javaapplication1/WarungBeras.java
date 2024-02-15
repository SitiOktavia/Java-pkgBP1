/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 * 
 * @author Siti Oktavia
 */
import java.util.Scanner;
public class WarungBeras {
    public static void main(String[] args) {
        //total bayar = total belanjaan - total belanjaan x 5%
        //total belanjaan = total kg beras yg dibeli x harga beras per kg
        //total kembalian = uang yang diberi - total bayar
        Scanner sc = new Scanner (System.in);
        int harga_beras1kg = 8000; //inisialisasi
        int uang_yg_diberi;
        int total_kg_beras;
        double total_bayar, total_kembalian;
        
        System.out.println("KASIR WARUNG BERAS");
        //input
        System.out.print("Total kg beras = ");
        total_kg_beras = sc.nextInt();
        //proses
        total_bayar = (harga_beras1kg * total_kg_beras) * (1 - 0.05);
        //output
        System.out.println("Harga beras per 1 kg = "+harga_beras1kg);
        System.out.println("Total Harga = "+harga_beras1kg * total_kg_beras);
        System.out.println("Diskon 5%");
        System.out.println("Total Bayar = "+total_bayar);
        //input
        System.out.print("Uang yang diberi = ");
        uang_yg_diberi = sc.nextInt ();
        //output
        total_kembalian =  uang_yg_diberi - total_bayar;
        System.out.println("Total kembalian = "+total_kembalian);
        
    }
    
}
