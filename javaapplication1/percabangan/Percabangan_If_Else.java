
package javaapplication1.percabangan;

import java.util.Scanner;
public class Percabangan_If_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double IPK;
        int poin;
        //input
        System.out.println("Masukkan IPK anda = ");
        IPK = s.nextInt();
        System.out.println("Masukkan poin anda = ");
        poin = s.nextInt();
        if(IPK>=2.75 && IPK<=4){
            if(poin>250){
                //lulus
                System.out.println("Selamat! Anda lulus");
            }
            else{
                //tidak lulus
                System.out.println("Maaf, anda belum lulus");
                System.out.println("Poin kurang");
                }    
        }
        else if (IPK<2.75 && IPK>0){
             if(poin>=250){
                 System.out.println("Maaf, anda belum lulus");
                 System.out.println("IPK kurang");
             }else{
                  System.out.println("Maaf, anda belum lulus");
                  System.out.println("IPK dan poin kurang");
             }
            
        }
    }
}
