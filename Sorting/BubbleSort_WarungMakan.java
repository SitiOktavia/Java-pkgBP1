package Sorting;
import java.util.Scanner;
public class BubbleSort_WarungMakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("=> Pilih : ");
        int pilih=sc.nextInt();
        System.out.println("");
        if(pilih==1){
        do{            
        String menuMkn[] = new String[5];
        int hargaMkn[] = new int[5];
        String menuMnm[] = new String[5];
        int hargaMnm[] = new int[5];        
        //inisialisasi data Mkn
        menuMkn[0]="Sate "; hargaMkn[0]=15000;
        menuMkn[1]="Soto "; hargaMkn[1]=12000;
        menuMkn[2]="Gule "; hargaMkn[2]=17000;
        menuMkn[3]="Bakso"; hargaMkn[3]=10000;
        menuMkn[4]="Rawon"; hargaMkn[4]=14000;
        //inisialisasi data Mnm
        menuMnm[0]="Air Mineral"; hargaMnm[0]=3000;
        menuMnm[1]="Teh        "; hargaMnm[1]=3000;
        menuMnm[2]="Es Kelapa  "; hargaMnm[2]=5000;
        menuMnm[3]="Jeruk      "; hargaMnm[3]=4000;
        menuMnm[4]="Soda       "; hargaMnm[4]=6000;        
        //array struk
        String pesanan [][] = new String[5][2]; 
        int nominal[][] = new int[5][6];   
        String menuMnm2[] = new String[5];
        int hargaMnm2[] = new int[5]; 
        
        int pilih1=0, pilihmMkn=1, pilihmMnm=1, jumlah, grandtotal, 
            grandtotal1=0, grandtotal2=0, pilihMkn, 
            idx1=0, idx2=0;        
        
        System.out.println("=====================================");
        do{                
        int pilihUMkn=0, pilihUMnm=0;
        String menuMkn2[] = new String[5];
        int hargaMkn2[] = new int[5];  
        System.out.println("               MENU");
        System.out.println("-------------------------------------");
            System.out.println("\t1.    Makanan");
            System.out.println("\t2.    Minuman");
            System.out.println("\t3.    Selesai");
            System.out.println("....................................");
            System.out.print("=>  Pilih : ");
            pilih1 = sc.nextInt();
            System.out.println("....................................");
            
            switch(pilih1){
                case 1:
                    System.out.println("No. Menu\t\t\tHarga");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i+1+". "+menuMkn[i]+"\t\t\t"
                                            +hargaMkn[i]);
                    }
                    while(pilihUMkn<3){
                    System.out.println("...................................");          
                    System.out.println("1. Urutkan menu dari yang termurah");                    
                    System.out.println("2. Urutkan menu dari yang termahal");
                    System.out.println("3. Lanjutkan memesan");
                    System.out.println("...................................");
                    System.out.print("=> Pilih : ");
                    pilihUMkn = sc.nextInt();
                    System.out.println("...................................");                    
                    switch(pilihUMkn){
                        case 1:
                            menuMkn2 = menuMkn;
                            hargaMkn2 = hargaMkn;
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 4; j++) {
                                if(hargaMkn2[j]>hargaMkn2[j+1]){
                                  //sorting harga
                                  int tempMkn = hargaMkn2[j];
                                  hargaMkn2[j] = hargaMkn2[j+1];
                                  hargaMkn2[j+1] = tempMkn;
                                  //sorting menu
                                  String tempm = menuMkn2[j];
                                  menuMkn2[j] = menuMkn2[j+1];
                                  menuMkn2[j+1] = tempm;
                                }
                                }
                            }
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                            System.out.println(i+1+". "+menuMkn2[i]+"\t\t\t"
                                                +hargaMkn2[i]);
                            }
                            break;
                        case 2:
                            menuMkn2 = menuMkn;
                            hargaMkn2 = hargaMkn;
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 4; j++) {
                                if(hargaMkn2[j]<hargaMkn2[j+1]){
                                  //sorting harga
                                  int tempMkn = hargaMkn2[j];
                                  hargaMkn2[j] = hargaMkn2[j+1];
                                  hargaMkn2[j+1] = tempMkn;
                                  //sorting menu
                                  String tempm = menuMkn2[j];
                                  menuMkn2[j] = menuMkn2[j+1];
                                  menuMkn2[j+1] = tempm;
                                }
                                }
                            }
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                            System.out.println(i+1+". "+menuMkn2[i]+"\t\t\t"
                                                +hargaMkn2[i]);
                            }
                            break;
                        default:
                            menuMkn2=menuMkn;
                            hargaMkn2=hargaMkn;
                            break;
                    }                    
                    }
                    System.out.print("=> Pilih no.menu(0 untuk selesai): ");
                    pilihmMkn = sc.nextInt();
                    do{                    
                    System.out.print("=> Jumlah = ");
                    jumlah = sc.nextInt();
                    System.out.println("...................................");                       
                    pesanan [idx1][0]=menuMkn2[pilihmMkn-1];
                    nominal [idx1][0]=hargaMkn2[pilihmMkn-1];
                    nominal[idx1][2]=jumlah;
                    nominal [idx1][4]=nominal[idx1][0]*nominal[idx1][2]; 
                    idx1++;
                    System.out.print("=> Pilih no.menu(0 untuk selesai): ");
                    pilihmMkn = sc.nextInt();
                    }while(pilihmMkn!=0);
                    System.out.println("-------------------------------------");                    
                    break;
                case 2:
                    System.out.println("No. Menu\t\t\tHarga");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i+1+".  "+menuMnm[i]+"\t\t\t"
                                +hargaMnm[i]);
                    }
                    while(pilihUMnm<3){
                    System.out.println("...................................");
                    System.out.println("1. Urutkan menu dari yang termurah");                    
                    System.out.println("2. Urutkan menu dari yang termahal");
                    System.out.println("3. Lanjutkan memesan");
                    System.out.println("...................................");
                    System.out.print("=> Pilih : ");
                    pilihUMnm = sc.nextInt();
                    System.out.println("...................................");                    
                    switch(pilihUMnm){
                        case 1:
                            menuMnm2 = menuMnm;
                            hargaMnm2 = hargaMnm;
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 4; j++) {
                                if(hargaMnm2[j]>hargaMnm2[j+1]){
                                  //sorting harga
                                  int tempMnm = hargaMnm[j];
                                  hargaMnm2[j] = hargaMnm2[j+1];
                                  hargaMnm2[j+1] = tempMnm;
                                  //sorting menu
                                  String tempm = menuMnm2[j];
                                  menuMnm2[j] = menuMnm2[j+1];
                                  menuMnm2[j+1] = tempm;
                                }
                                }
                            }
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                            System.out.println(i+1+"  "+menuMnm2[i]+"\t\t\t"
                                    +hargaMnm2[i]);
                            }
                            break;
                        case 2:
                            menuMnm2 = menuMnm;
                            hargaMnm2 = hargaMnm;
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 4; j++) {
                                if(hargaMnm2[j]<hargaMnm2[j+1]){
                                  //sorting harga
                                  int tempMnm = hargaMnm2[j];
                                  hargaMnm2[j] = hargaMnm2[j+1];
                                  hargaMnm2[j+1] = tempMnm;
                                  //sorting menu
                                  String tempm = menuMnm2[j];
                                  menuMnm2[j] = menuMnm2[j+1];
                                  menuMnm2[j+1] = tempm;
                                }
                                }
                            }
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                            System.out.println(i+1+"  "+menuMnm2[i]+"\t\t\t"
                                    +hargaMnm2[i]);
                            }
                            break;
                        default:
                            menuMnm2=menuMnm;
                            hargaMnm2=hargaMnm;
                            break;
                    }                    
                    }
                    System.out.print("=> Pilih no. menu 0 untuk selesai): ");
                    pilihmMnm = sc.nextInt();
                    do{                    
                    System.out.print("=> Jumlah = ");
                    jumlah = sc.nextInt();                    
                    System.out.println("....................................");
                    pesanan [idx2][1]=menuMnm2[pilihmMnm-1];
                    nominal [idx2][1]=hargaMnm2[pilihmMnm-1];
                    nominal[idx2][3]=jumlah;
                    nominal [idx2][5]=nominal[idx2][1]*nominal[idx2][3]; 
                    idx2++;
                    System.out.print("=> Pilih no. menu(0 untuk selesai) : ");
                    pilihmMnm = sc.nextInt();
                    }while(pilihmMnm!=0);
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    break;
            }
        }while(pilih1!=3);
        System.out.println("======================================");
        System.out.println("            Struk Pembelian");
        System.out.println("======================================");
        System.out.println("  Makanan\tHarga\tJumlah\tSub Total");
        for (int i = 0; i < 5; i++) {
            if(pesanan[i][0]!=null){
                System.out.print((i+1)+"."+pesanan[i][0]);
                System.out.print("\t\t"+nominal[i][0]);
                System.out.print("\t"+nominal[i][2]);
                System.out.println("\t"+nominal[i][4]);
                grandtotal1=grandtotal1+nominal[i][4];
            }                
            }
        System.out.println("-------------------------------------");
        System.out.println("  Minuman\tHarga\tJumlah\tSub Total");
            for (int i = 0; i < 5; i++) {
             if(pesanan[i][1]!=null){
                System.out.print((i+1)+"."+pesanan[i][1]);
                System.out.print("\t"+nominal[i][1]);
                System.out.print("\t"+nominal[i][3]);
                System.out.println("\t"+nominal [i][5]);
                grandtotal2=grandtotal2+nominal [i][5];
                 }              
            }
            System.out.println("---------------------------------------");
            grandtotal=grandtotal1+grandtotal2;
            System.out.println("Grand Total pembelian : Rp"+grandtotal);
            System.out.print("Nominal uang pembayaran : Rp");
            int bayar=sc.nextInt();
            int kembalian=bayar-grandtotal;
            System.out.println("Kembalian : Rp"+kembalian);
            System.out.println("=======================================");
            System.out.println("--------------Terima Kasih--------------");
            System.out.println("=======================================");
            System.out.println("");
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("Pilih : ");
        pilih=sc.nextInt();                 
        }while(pilih<2);
        }        
    }
}
