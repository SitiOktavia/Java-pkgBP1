package perulangan;
import java.util.Scanner;
public class Warung_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilih_menu, pilih, total_harga = 0, porsi, tusuk, uang_bayar, sate_ayam=1500, 
            sate_kambing=3000, pecel_ayam=13000,pecel_empal=15000, 
            penyet_tahutempe=5000,
            penyet_telur=7000,penyet_ayam=10000;
        double diskon, kembalian, total_bayar;
        
        System.out.println("-----------Warung Makan Sederhana-----------");
        do{
        System.out.println("============================================");
        System.out.println("Menu  :");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        System.out.println("4. Selesai");
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
                         total_harga = total_harga+tusuk * sate_ayam;                      
                    }else if(pilihSate==2){
                        System.out.print("Masukkan jumlah pesanan = ");
                         tusuk=sc.nextInt();
                         total_harga = total_harga+tusuk * sate_kambing;
                    }else{
                        System.out.println("Tidak valid!");
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
                         total_harga = total_harga+porsi * pecel_ayam;                        
                    }else if(pilihPecel==2){
                        System.out.print("Masukkan jumlah pesanan = ");
                         tusuk=sc.nextInt();
                         total_harga = total_harga+tusuk * sate_kambing;
                    }else{
                        System.out.println("Tidak valid!");
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
                             total_harga = total_harga+porsi * penyet_tahutempe; 
                            break;
                        case 2:
                            System.out.print("Masukkan jumlah pesanan = ");
                             porsi=sc.nextInt();
                             total_harga = total_harga+porsi * penyet_telur; 
                            break;
                        case 3:
                            System.out.print("Masukkan jumlah pesanan = ");
                             porsi=sc.nextInt();
                             total_harga = total_harga+porsi * penyet_ayam;
                        break;
                        default: System.out.println("Tidak valid");
                    }
                    break;
                case 4:
                    System.out.println("");
                    break;
                default: System.out.println("Tidak valid!");                                   
    }
        }while(pilih_menu!=4);
           
        do{
            System.out.println("============================================");
            System.out.println("Total Harga Rp= "+total_harga); 
            System.out.println("");
            System.out.println("\nApakah anda mempunyai kartu anggota?");
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
                }else if (pilih==2){
                    System.out.println("Total yang harus dibayar = Rp"+total_harga);
                    System.out.print("Masukkan nominal uang pembayaran = Rp");
                    uang_bayar = sc.nextInt();
                    kembalian = uang_bayar-total_harga;
                    System.out.println("Uang kembalian anda = Rp"+kembalian);
                }else {
                    System.out.println("Tidak valid!");
                }
        }while(pilih!=1 && pilih!=2);
    System.out.println("Terima kasih.");
    }
    }       
   
    


