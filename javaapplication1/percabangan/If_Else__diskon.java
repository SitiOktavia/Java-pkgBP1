package javaapplication1.percabangan;
/**
 * @author Siti Oktavia
 */
import java.util.Scanner;
public class If_Else__diskon {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in); 
    int a=78000; //clearfile
    int b=233000; //penlight
    int c=194000;//totebag
    int d=128000;//acrylyc_stand
    int e=103000;//hair_rubber
    int f=28000;//photoset
    int total_harga_barang, jumlah_barang, total_harga_clearfile, 
        total_harga_penlight, total_harga_totebag, total_harga_acrylyc,
        total_harga_hairrubber, total_harga_photoset, jumlah_clearfile, 
        jumlah_penlight, jumlah_totebag, jumlah_acrylyc, jumlah_hairrubber,
        jumlah_photoset;
    double diskon, uang_diterima, total_kembalian, total_bayar;
        System.out.println("-----------------Johnny's Shop--------------");
        System.out.println("Daftar Merch                        Harga/pc");
        System.out.println("Clearfile                              78000");
        System.out.println("Penlight                              233000");
        System.out.println("Totebag                               194000");
        System.out.println("Acrylyc Stand                         128000");
        System.out.println("Hair Rubber                           103000");
        System.out.println("Photoset                               28000");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.print("Masukkan jumlah clearfile yang anda beli   = ");
            jumlah_clearfile = s.nextInt();
         total_harga_clearfile = (a*jumlah_clearfile);
        System.out.print("Masukkan jumlah penlight yang anda beli    = ");
            jumlah_penlight = s.nextInt();
            total_harga_penlight = (b*jumlah_penlight);
        System.out.print("Masukkan jumlah totebag yang anda beli     = ");
            jumlah_totebag = s.nextInt();
            total_harga_totebag = (c*jumlah_totebag);
        System.out.print("Masukkan jumlah acrylyc yang anda beli     = ");
            jumlah_acrylyc = s.nextInt();
            total_harga_acrylyc = (d*jumlah_acrylyc);
        System.out.print("Masukkan jumlah hair rubber yang anda beli = ");
            jumlah_hairrubber = s.nextInt();
            total_harga_hairrubber = (e*jumlah_hairrubber);
        System.out.print("Masukkan jumlah photoset yang anda beli    = ");
            jumlah_photoset = s.nextInt();
            total_harga_photoset = (f*jumlah_photoset);
        System.out.println("-------------------------------------------");
        
        total_harga_barang = (total_harga_clearfile+total_harga_penlight
                             +total_harga_totebag+total_harga_acrylyc
                             +total_harga_hairrubber+total_harga_photoset);
        jumlah_barang = (jumlah_clearfile+jumlah_penlight+jumlah_totebag
                         +jumlah_acrylyc+jumlah_hairrubber+jumlah_photoset);
        
        System.out.println("Jumlah barang = "+jumlah_barang);
        System.out.println("Total pembelian anda = Rp"+total_harga_barang);
        
        if(total_harga_barang<100000){
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_harga_barang);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.println("Total kembalian = Rp" +total_kembalian);
                }
        }
        else{if(total_harga_barang>=100000 && total_harga_barang<200000){
            total_bayar = (total_harga_barang*(1-0.05));
            System.out.println("Selamat! Anda mendapatkan diskon 5%");
            System.out.println("Total yang harus dibayar = Rp"+total_bayar); 
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_bayar);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.println("Total kembalian = Rp" +total_kembalian);
                }
            }
        else{if(total_harga_barang>=200000 && total_harga_barang<300000){
            total_bayar = (total_harga_barang*(1-0.1));
            System.out.println("Selamat! Anda mendapatkan diskon 10%");
            System.out.println("Total yang harus dibayar = Rp"+total_bayar);  
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_bayar);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.println("Total kembalian = Rp" +total_kembalian);
                }
        }
        else{if(total_harga_barang>=300000 && total_harga_barang<400000){
            total_bayar = (total_harga_barang*(1-0.15));
            System.out.println("Selamat! Anda mendapatkan diskon 15%");
            System.out.println("Total yang harus dibayar = Rp"+total_bayar);
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_bayar);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.println("Total kembalian = Rp" +total_kembalian);
                }
        }
        else{if(total_harga_barang>=400000 && total_harga_barang<500000){
            total_bayar = (total_harga_barang*(1-0.2));
            System.out.println("Selamat! Anda mendapatkan diskon 20%");
            System.out.println("Total yang harus dibayar = Rp"+total_bayar);
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_bayar);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.print("Total kembalian = Rp" +total_kembalian);
                }
        }
         else{if(total_harga_barang>=500000){
            total_bayar = (total_harga_barang*(1-0.25));
            System.out.println("Selamat! Anda mendapatkan diskon 25%");
            System.out.println("Total yang harus dibayar = Rp"+total_bayar);
            System.out.print("Masukkan nominal uang pembayaran = Rp"); 
            uang_diterima = s.nextDouble();
            total_kembalian = (uang_diterima - total_bayar);
            if(total_kembalian == 0){
            System.out.println("Uang anda pas.");
            }
            else {
            System.out.println("Total kembalian = Rp" +total_kembalian);
                }
        }
        }
        }
        }
        }
        }
        System.out.println("-------------------------------------------");
        System.out.println("     Terima kasih telah berkunjung.");
        }
        
    }

  
