/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author Nacchan^v^
 */
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesanan[][] = new String [5][3];
        int idxmkn=0, idxmnm=0, idx=0;
        int nominal[][]=new int[5][3];
        int pilih1=0, pilih2=0;
        do{
            System.out.println("MENU");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih1=sc.nextInt();
            switch(pilih1){
                case 1:
                    System.out.println("DAFTAR MAKANAN");
                    System.out.println("1. Sate");
                    System.out.println("2. Soto");
                    System.out.println("3. Bakso");
                    System.out.print("Pilih = ");
                    pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            pesanan[idx][idxmkn]="Sate";
                            //nominal index
                            break;
                        case 2:
                            pesanan[idx][idxmkn]="Soto";
                            break;
                        case 3:
                            pesanan[idx][idxmkn]="Bakso";
                            break;
                    }
                    idxmkn++;
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            idx++;
        }while(pilih1!=3);
        System.out.println("Daftar Pembelian");
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < 2; j++) {
                if(pesanan[i][j]!=null)
                 System.out.print(pesanan[i][j]+" ");    
            }
            if(pesanan[i][0]!=null||pesanan[i][1]!=null)
            System.out.println("");
        }
        System.out.println("");
    }
    
}
