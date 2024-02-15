/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;
public class Loop_do_while {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pilih, setor, saldo=100000;
        do{
            System.out.println("Menu ATM");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Selesai");
            System.out.print("Pilih : ");
            pilih=s.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Nominal penyetoran : Rp");
                    setor=s.nextInt();
                    saldo=saldo+setor;
                    System.out.println("Penyetoran berhasil");
                    System.out.println("Saldo : Rp"+saldo);
                    break;
                case 2:
                    System.out.print("Nominal penarikan : Rp");
                    int tarik=s.nextInt();
                    if(saldo>=tarik){
                       saldo=saldo-tarik;
                        System.out.println("Penarikan berhasil");
                    }else{
                        System.out.println("Saldo tidak cukup");
                    }
                    System.out.println("Saldo : Rp"+saldo);
                    break;
                case 3:
                    System.out.print("Rekening tujuan : ");
                    long rek=s.nextLong();
                    System.out.print("Nominal penarikan : Rp");
                    int transfer=s.nextInt();
                    if(saldo>=transfer){
                       saldo=saldo-transfer;
                        System.out.println("Transfer berhasil");
                    }else{
                        System.out.println("Saldo tidak cukup");
                    }
                    System.out.println("Saldo : Rp"+saldo);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                
            }
        }while(pilih!=4);
    }
}
