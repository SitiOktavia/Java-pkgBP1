 package Array;

import java.util.Scanner; 
public class ArrayMultiDimensi_wrgmknpchy {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("Pilih : ");
        int pilih=sc.nextInt();
        do{
        String pesanan [][] = new String[5][2]; 
        int idx1=0, idx2=0;
        int nominal[][] = new int[5][6];
        int pilih1=0, pilih2=0, jumlah, grandtotal, grandtotal1=0, grandtotal2=0; 
        do{
            System.out.println("MENU");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Selesai");
            System.out.print("Pilih : ");
            pilih1 = sc.nextInt();
            System.out.println("..............................");
            
            switch(pilih1){
                case 1:
                    System.out.println("Daftar Menu Makanan");
                    System.out.println("1. Sate");
                    System.out.println("2. Soto");
                    System.out.println("3. Bakso");
                    System.out.print("Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            pesanan [idx1][0]="Sate";
                            nominal [idx1][0]=15000;
                            break;
                        case 2:
                            pesanan [idx1][0]="Soto";
                            nominal [idx1][0]=16000;
                            break;
                        case 3:
                            pesanan [idx1][0]="Bakso";
                            nominal [idx1][0]=12000;
                            break;
                    }
                    System.out.print("Jumlah = ");
                    jumlah = sc.nextInt();
                    nominal[idx1][2]=jumlah;
                    nominal [idx1][4]=nominal[idx1][0]*nominal[idx1][2]; 
                    idx1++;
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Daftar Menu Minuman");
                    System.out.println("1. Kopi");
                    System.out.println("2. Teh");
                    System.out.println("3. Jeruk");
                    System.out.print("Pilih = ");
                    pilih2 = sc.nextInt();
                    switch(pilih2){
                        case 1:
                            pesanan [idx2][1]="Kopi";
                            nominal [idx2][1]=4000;
                            break;
                        case 2:
                            pesanan [idx2][1]="Teh";
                            nominal [idx2][1]=2000;
                            break;
                        case 3:
                            pesanan [idx2][1]="Jeruk";
                            nominal [idx2][1]=5000;
                            break;
                    }
                    System.out.print("Jumlah = ");
                    jumlah = sc.nextInt();
                    nominal[idx2][3]=jumlah;
                    nominal [idx2][5]=nominal[idx2][1]*nominal[idx2][3]; 
                    idx2++;
                    System.out.println("");
                    break;
                case 3:
                    break;
            }
        }while(pilih1!=3);
        System.out.println("================================");
        System.out.println("        Daftar Pembelian");
        System.out.println("================================");
        System.out.println("Makanan");
        System.out.println("  Menu\tHarga\tJumlah\tSub Total");
        for (int i = 0; i < 5; i++) {
            if(pesanan[i][0]!=null){
                System.out.print((i+1)+"."+pesanan[i][0]);
                System.out.print("\t"+nominal[i][0]);
                System.out.print("\t"+nominal[i][2]);
                System.out.println("\t"+nominal[i][4]);
                grandtotal1=grandtotal1+nominal[i][4];
            }
                
            }
        System.out.println("--------------------------------");
        System.out.println("Minuman");
        System.out.println("  Menu\tHarga\tJumlah\tSub Total");
            for (int i = 0; i < 5; i++) {
             if(pesanan[i][1]!=null){
                System.out.print((i+1)+"."+pesanan[i][1]);
                System.out.print("\t"+nominal[i][1]);
                System.out.print("\t"+nominal[i][3]);
                System.out.println("\t"+nominal [i][5]);
                grandtotal2=grandtotal2+nominal [i][5];
                         
             }
              
            }
            System.out.println("--------------------------------");
            grandtotal=grandtotal1+grandtotal2;
            System.out.println("Grand Total pembelian : Rp"+grandtotal);
            System.out.println("================================");
            System.out.println("");
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("Pilih : ");
        pilih=sc.nextInt();                 
        }while(pilih<2);
}
        
    }   

