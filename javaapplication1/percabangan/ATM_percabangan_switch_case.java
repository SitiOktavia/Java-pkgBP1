/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.percabangan;
import java.util.Scanner;
/**
 *
 * @author Nacchan^v^
 */
public class ATM_percabangan_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double saldo = 5000000;
        int pin, pilih;
        
        //input pin
        System.out.print("Masukkan PIN = ");
        pin = sc.nextInt();
        if(pin==123456){
        
            System.out.println("ATM Sederhana");
            System.out.println("1. Transfer");
            System.out.println("2. Penarikan");
            System.out.println("3. Pembayaran");
            //input pilihan
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            //seleksi pilihan
            switch(pilih){
                case 1:
                    System.out.print("Rekening Tujuan = ");
                    int rek = sc.nextInt();
                    System.out.print("Nominal = ");
                    double nominal = sc.nextDouble();
                    if(saldo>=nominal){
                        System.out.println("Transfer Sukses.");
                        saldo = saldo-nominal;
                        System.out.println("Saldo :"+saldo);
                    }else{
                        System.out.println("Saldo Tidak Mencukupi!");
                    }
                    break;
                case 2:
                    System.out.println("Nominal = ");
                     double nominal_penarikan = sc.nextDouble();
                    if(saldo>=nominal_penarikan){
                        System.out.println("Penarikan Sukses.");
                        saldo = saldo-nominal_penarikan;
                        System.out.println("Saldo :"+saldo);
                    }else{
                        System.out.println("Saldo Tidak Mencukupi!");
                    } 
                    break;
                case 3:
                    System.out.println("1. SPP/UKT");
                    System.out.println("2. Listrik");
                    System.out.print("Pilih = ");
                    int pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            System.out.print("NPM = ");
                            int npm = sc.nextInt();
                            System.out.print("Nominal = ");
                            double spp_ukt = sc.nextDouble();
                            if(saldo>=spp_ukt){
                                System.out.println("Pembayaran Sukses.");
                                saldo = saldo-spp_ukt;
                                System.out.println("Saldo :"+saldo);
                            }else{
                                System.out.println("Saldo Tidak Mencukupi!");
                            }
                            break;
                        case 2:
                            System.out.println("Kode Pembayaran = ");
                            int kode = sc.nextInt();
                            System.out.print("Nominal = ");
                            double bayar_listrik = sc.nextDouble();
                            if(saldo>=bayar_listrik){
                                System.out.println("Pembayaran Sukses.");
                                saldo = saldo-bayar_listrik;
                                System.out.println("Saldo :"+saldo);
                            }else{
                                System.out.println("Saldo Tidak Mencukupi!");
                            }
                        
                    }
            }
         }else{
            System.out.println("PIN Salah!");
            }   
        
    }
}
