package WarungMakan;
import java.util.Scanner;
public class appWarungMakan_complete {
static Scanner sc = new Scanner (System.in);

    int harga[] = new int [10];

    static int hitungharga(int hargasatuan, int jumlah){
        int harga = hargasatuan * jumlah;
        return harga;
    }
    static String [][] sort (String[] menu, int []harga){
        String hasil [][] = new String [10][2];
        for (int i = 0; i < menu.length; i++){
            for (int j = 0; j < menu.length-1; j++){
                if(menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String t = menu [j];
                    menu [j] = menu [j+1];
                    menu [j+1]=t;
                    int h = harga [j];
                    harga[j] = harga[j+1];
                    harga[j+1]= h;
                    
                 }
             }
        }
        for (int i = 0; i < menu.length; i++) {
			hasil[i][0] = menu[i];
			hasil[i][1] = String.valueOf(harga[i]);
        }
        return hasil;
    }
    
    static String[][] search(String[] menu, int harga[], String cari){
       String[][] hasil = new String [10][2];
       int idx = 0;
       for (int i = 0; i < menu.length; i++){
           if(menu[i].indexOf(cari)>=0){
               hasil [idx][0] = menu [i];
               hasil [idx][1] = String.valueOf(harga[i]);
               idx++;
           }               
           }
           return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        int user = 0;
        
        do{
        System.out.println ("\nUSER");
        System.out.println ("1. Kasir");
        System.out.println ("2. Admin");
        System.out.println ("3. Owner");
        System.out.println ("4. Exit");
        System.out.print ("Pilih = ");
        user = sc.nextInt();     
        
        //array pembelian
        String makanan[] = new String [10];
        String minuman [] = new String [5];
        String gorengan [] = new String [5];
        int harga[] = new int [10];
        int hargamnm[] = new int [10];
        int hargagrg[]= new int [10];

        minuman[0] = "Es Teh       ";            hargamnm [0]= 3000;
        minuman[1] = "Es Jeruk     ";            hargamnm [1]= 4000;
        minuman[2] = "Air Mineral  ";            hargamnm [2]= 1000;
        minuman[3] = "Teh Hangat   ";            hargamnm [3]= 2500;
        minuman[4] = "Jeruk Hangat ";            hargamnm [4]= 3500;
        
        makanan [0]="Sate Ayam      ";           harga [0]= 12000;
        makanan [1]="Sate Sapi      ";           harga [1]= 15000;
        makanan [2]="Sate Kambing   ";           harga [2]= 20000;
        makanan [3]="Soto Madura    ";           harga [3]= 12000;
        makanan [4]="Soto Lamongan  ";           harga [4]= 14000;
        makanan [5]="Gado-gado      ";           harga [5]= 10000;
        makanan [6]="Rawon          ";           harga [6]= 13000;
        makanan [7]="Bakso          ";           harga [7]= 8000;
        makanan [8]="Pecel          ";           harga [8]= 7000;
        makanan [9]="Penyetan       ";           harga [9]= 12000;
      
        gorengan [0] = "Ote-ote        ";        hargagrg[0]= 1000;
        gorengan [1] = "Tahu Isi       ";        hargagrg[1]= 2000;
        gorengan [2] = "Pisang Goreng  ";        hargagrg[2]= 2000;
        gorengan [3] = "Molen Pisang   ";        hargagrg[3]= 3000;
        gorengan [4] = "Mendoan        ";        hargagrg[4]= 1500;
   
        int pilih = 0;
        int idx = 0, idxmkn = 0, idxmnm = 0, idxsnk=0;
        String [][] pesanan = new String [10][2];
        int total [] = new int [10]; 
        int beli;
        int jumlah [] = new int [10];
        int jumlahmkn = 10;
        int jumlahuangPembeli;
        double grandtotal = 0, diskon, uangKembalian;
        String[][] urutmakan = sort(makanan, harga);
        String[][] urutminum = sort(minuman, hargamnm);
        String[][] urutgorengan = sort(gorengan, hargagrg);
        String kartuMember;
        
        switch (user){
            case 1 :              
            do{
            System.out.println("========================= USER KASIR =========================");
            System.out.println("MENU UTAMA");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Cari Menu");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("======================== DAFTAR MENU =========================");
                    System.out.println("1. Menu Makanan");
                    System.out.println("2. Menu Minuman");
                    System.out.println("3. Menu Gorengan");
                    System.out.print("Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1: 
                            System.out.println("======================== Menu Makanan ========================");                          
                            System.out.println("No.\tMenu Makanan\tHarga ");
                            for (int i = 0; i < 10; i++) {
                                    System.out.println((i + 1) + ".\t"+urutmakan[i][0] + "\t"+urutmakan[i][1] );
                            }
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah Porsi = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = urutmakan[beli - 1][0];
                            pesanan[idxmkn][1] = String.valueOf(urutmakan[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            System.out.println("");
                            idx++;
                            break;
                            
                        case 2:
                            System.out.println("======================== Menu Minuman ========================");
                            System.out.println("No.\tMenu Minuman\tHarga ");
                            for (int i = 0; i < 5; i++) {
                                    System.out.println((i + 1) + ".\t"+urutminum[i][0]+"\t"+urutminum[i][1]);
                            }
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = urutminum[beli - 1][0];
                            pesanan[idx][1] = String.valueOf(urutminum[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            System.out.println("");
                            idx++;
                            break;
                            
                        case 3 :
                            System.out.println("======================== Menu Gorengan =======================");
                            System.out.println("No.\tMenu Gorengan\tHarga ");
                            for (int i = 0; i < 5; i++) {
                                    System.out.println((i + 1) + ".\t"+urutgorengan[i][0]+"\t"+urutgorengan[i][1]);
                            }
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = urutgorengan[beli - 1][0];
                            pesanan[idx][1] = String.valueOf(urutgorengan[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            System.out.println("");
                            idx++;
                            break;
                    }                                                      
            break;
            
                case 2:
                    System.out.println("========================== Cari Menu =========================");
                    System.out.println("1. Menu Makanan");
                    System.out.println("2. Menu Minuman");
                    System.out.println("3. Menu Gorengan");
                    System.out.print("Pilih = ");
                    int pilih3=sc.nextInt();
                    switch(pilih3){
                        case 1 :
                            System.out.print("Cari = ");
                            String c = sc.next();
                            String hasilcarimkn[][] = search(makanan, harga,c);
                            System.out.println("======================= Hasil Pencarian ======================");
                            System.out.println("No.\tMenu Makanan\tHarga ");
                            for (int i = 0; i < hasilcarimkn.length; i++) {
                                if(hasilcarimkn[i][0]!=null){
                                    System.out.print((i + 1) + ".\t"+hasilcarimkn[i][0]);
                                    System.out.println("\t"+Integer.parseInt(hasilcarimkn[i][1]));
                                }
                            }   
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = hasilcarimkn[beli - 1][0];
                            pesanan[idx][1] = String.valueOf(hasilcarimkn[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            idx++;
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Cari = ");
                            String c1 = sc.next();
                            String hasilcarimnm[][] = search(minuman, hargamnm,c1);
                            System.out.println("======================= Hasil Pencarian ======================");
                            System.out.println("No.\tMenu Minuman\tHarga ");
                            for (int i = 0; i < hasilcarimnm.length; i++) {
                                if(hasilcarimnm[i][0]!=null){
                                    System.out.print((i + 1) + ".\t"+hasilcarimnm[i][0]);
                                    System.out.println("\t"+Integer.parseInt(hasilcarimnm[i][1]));
                                }
                            }  
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = hasilcarimnm[beli - 1][0];
                            pesanan[idx][1] = String.valueOf(hasilcarimnm[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            System.out.println("");
                            idx++;
                            break;

                        case 3:
                            System.out.print("Cari = ");
                            String c3 = sc.next();
                            String hasilcarigrg[][] = search(gorengan, hargagrg,c3);
                            System.out.println("======================= Hasil Pencarian ======================");
                            System.out.println("No.\tMenu Gorengan\tHarga ");
                            for (int i = 0; i < hasilcarigrg.length; i++) {
                                if(hasilcarigrg[i][0]!=null){
                                    System.out.print((i + 1) + ".\t"+hasilcarigrg[i][0]);
                                    System.out.println("\t"+Integer.parseInt(hasilcarigrg[i][1]));
                                }
                            }  
                            System.out.print("Pesan = ");
                            beli=sc.nextInt();      
                            System.out.print("Jumlah = ");
                            jumlah[idx]= sc.nextInt();
                            pesanan[idx][0] = hasilcarigrg[beli- 1][0];
                            pesanan[idx][1] = String.valueOf(hasilcarigrg[beli-1][1]);
                            total[idx]= hitungharga(Integer.parseInt(pesanan[idx][1]), jumlah[idx]);
                            System.out.println("");
                            idx++;
                            break;                           
                    }
                break;
               
                case 3 :
                    System.out.println("Apakah Anda Memiliki Kartu Member Warung Sederhana? [YA/TIDAK]");	
                    break;
                    default:
                    System.out.println("Nomor yang Anda Masukkan Salah");
               
            }
            }while(pilih !=3);
        
        kartuMember = sc.next();
		if (kartuMember.equalsIgnoreCase("YA")) {
                System.out.println("       >> Selamat!! Anda mendapatkan diskon 5% <<         ");
                System.out.println("__________________________________________________________");
                System.out.println("                     DAFTAR PESANAN                       ");
                System.out.println("__________________________________________________________");
                System.out.println("No.\tMenu\t\tHarga\tPorsi\tTotal Biaya");
                for (int i=0; i<idx; i++){
                    System.out.println((i+1) + ". " + "\t" + pesanan[i][0]+"\t"+ pesanan[i][1]+"\t"+jumlah[i]+"\t"+total[i]);
        
                    grandtotal = grandtotal + total [i];
                }        
		
                System.out.println("__________________________________________________________");
		System.out.println("Total harga sebelum diskon          = Rp. " + grandtotal);
                diskon = grandtotal * 0.05;
		grandtotal = grandtotal - diskon;
		System.out.println("Total harga setelah diskon          = Rp. " + grandtotal);
                }
                
		else {
                System.out.println("Maaf,Anda belum berhasil mendapatkan diskon");
                System.out.println("__________________________________________________________");
                System.out.println("                     DAFTAR PESANAN                       ");
                System.out.println("__________________________________________________________");
                System.out.println("No.\tMenu\t\tHarga\tPorsi\tTotal Biaya");
                for (int i=0; i<idx; i++){
                    System.out.println((i+1) + ". " + "\t" + pesanan[i][0]+"\t"+ pesanan[i][1]+"\t"+jumlah[i]+"\t"+total[i]);
        
                    grandtotal = grandtotal + total [i];
                }        
		diskon = grandtotal * 0;
		grandtotal = grandtotal - diskon;
                
		System.out.println("__________________________________________________________");
                System.out.println("Total Harga                         = Rp. " + grandtotal);
		}
		System.out.print("Jumlah uang yang dibayar Anda       = Rp. ");
		jumlahuangPembeli = sc.nextInt();

		if (jumlahuangPembeli == grandtotal) {
		System.out.println("Uang anda PAS");
		} 
                
                else if (jumlahuangPembeli > grandtotal) {
		uangKembalian = jumlahuangPembeli - grandtotal;
		System.out.println("Jumlah kembalian Anda               = Rp. " + uangKembalian);
                } 
                
                else if (jumlahuangPembeli < grandtotal) {
		System.out.println("Jumlah uang yang Anda bayarkan kurang!");
		System.out.print("Masukkan kembali jumlah uang Anda = Rp. ");
		jumlahuangPembeli = sc.nextInt();
		} 
        System.out.println("\n==============================================================");
        System.out.println("            TERIMA KASIH! SILAHKAN DATANG KEMBALI!            ");
        break;
        
        case 2 :
        System.out.println("\nUSER ADMIN");
        System.out.println("1. Tambahkan Menu");
        System.out.println("2. Hapus Menu"); 
        System.out.println("3. Selesai");
        System.out.print("Pilih = ");
        int pilihmenuadm = sc.nextInt();
        switch(pilihmenuadm){
            case 1:
                System.out.println("======================== DAFTAR MENU =========================");
                System.out.println("1. Menu Makanan");
                System.out.println("2. Menu Minuman");
                System.out.println("3. Menu Gorengan");
                System.out.print("Pilih = ");
                int pilihmn=sc.nextInt();
                switch(pilihmn){
                    case 1 :
                        System.out.print("Nama = ");
                        sc = new Scanner(System.in);
                        makanan [jumlahmkn] = sc.nextLine();
                        System.out.print("Harga = ");
                        harga[jumlahmkn] = sc.nextInt();
                        jumlahmkn++;
                        break;
                }
        }
        break;
        
        case 3 :
        System.out.println("\nUSER OWNER");
        System.out.println("1. Lihat Laporan Pemasukan");      
        System.out.println("2. Daftar 5 Menu Paling Laris");          
        break;   
        
        case 4 :
        System.out.println("Selesai");   
            
        }
        
        }while(user!=4);
        }
        }


