package javaapplication1.percabangan;
import java.util.Scanner;
public class WarungDiskon_if_else__switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilih_menu, pilih, total_harga = 0, porsi, tusuk, uang_bayar, sate_ayam=1500, 
            sate_kambing=3000, pecel_ayam=13000,pecel_empal=15000, 
            penyet_tahutempe=5000,
            penyet_telur=7000,penyet_ayam=10000;
        double diskon, kembalian, total_bayar;
        
        System.out.println("Warung Makan Sederhana");
        System.out.println("Menu  :");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        System.out.print("Masukkan nomor menu yang dipilih = ");
        pilih_menu = sc.nextInt();
            switch(pilih_menu){
                case 1:
                    System.out.println("1. Sate Ayam    : 1500/tusuk");
                    System.out.println("2. Sate Kambing : 3000/tusuk");
                    System.out.print("Pilih   = ");
                    int pilihSate=sc.nextInt();
                    if(pilihSate==1){
                        System.out.print("Masukkan jumlah pesanan = ");
                         tusuk=sc.nextInt();
                         total_harga = tusuk * sate_ayam;
                        System.out.println("Total Harga = Rp"+total_harga);                        
                    }else{
                        System.out.print("Masukkan jumlah pesanan = ");
                         tusuk=sc.nextInt();
                         total_harga = tusuk * sate_kambing;
                        System.out.println("Total Harga = Rp"+total_harga); 
                    }
                    break;
                case 2:
                    System.out.println("1. Lauk Ayam  : 13000/porsi");
                    System.out.println("2. Lauk Empal : 15000/porsi");
                    System.out.print("Pilih   = ");
                    int pilihPecel=sc.nextInt();
                    if(pilihPecel==1){
                        System.out.print("Masukkan jumlah pesanan = ");
                         porsi=sc.nextInt();
                         total_harga = porsi * pecel_ayam;
                        System.out.println("Total Harga = Rp"+total_harga);                        
                    }else{
                        System.out.print("Masukkan jumlah pesanan = ");
                         porsi=sc.nextInt();
                         total_harga = porsi * pecel_empal;
                        System.out.println("Total Harga Rp= "+total_harga); 
                    }
                    break;
                case 3:
                    System.out.println("   Menu Penyetan  :");
                    System.out.println("1. Penyetan Tahu Tempe : 5000");
                    System.out.println("2. Penyetan Telur      : 7000");
                    System.out.println("3. Penyetan Ayam       : 10000");
                    System.out.print("Pilih menu  = ");
                    int pilihPenyetan = sc.nextInt();
                    switch(pilihPenyetan){
                        case 1 :
                            System.out.print("Masukkan jumlah pesanan = ");
                             porsi=sc.nextInt();
                             total_harga = porsi * penyet_tahutempe;
                            System.out.println("Total Harga = Rp"+total_harga); 
                            break;
                        case 2:
                            System.out.print("Masukkan jumlah pesanan = ");
                             porsi=sc.nextInt();
                             total_harga = porsi * penyet_telur;
                            System.out.println("Total Harga = Rp"+total_harga);  
                            break;
                        case 3:
                            System.out.print("Masukkan jumlah pesanan = ");
                             porsi=sc.nextInt();
                             total_harga = porsi * penyet_ayam;
                            System.out.println("Total Harga = Rp"+total_harga); 
                    }
            
                    
    }
            System.out.println("Apakah anda mempunyai kartu anggota?");
            System.out.println("1. Iya       2. Tidak");
            System.out.print("Pilih   = ");
            pilih = sc.nextInt();
                if(pilih==1){
                    System.out.println("Selamat! Anda mendapatkan diskon 5%");
                    total_bayar = total_harga*(1-0.05);
                    System.out.println("Total yang harus dibayar = Rp"+total_bayar);
                    System.out.print("Masukkan nominal uang pembayaran = Rp");
                    uang_bayar = sc.nextInt();
                    kembalian = uang_bayar-total_bayar;
                    System.out.println("Uang kembalian anda = Rp"+kembalian);
                }else {
                    System.out.println("Total yang harus dibayar = Rp"+total_harga);
                    System.out.print("Masukkan nominal uang pembayaran = Rp");
                    uang_bayar = sc.nextInt();
                    kembalian = uang_bayar-total_harga;
                    System.out.println("Uang kembalian anda = Rp"+kembalian);
                }
    }
    }       
   
    
