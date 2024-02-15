package perulangan;

import java.util.Scanner;
public class n_prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAM n BILANGAN PRIMA PERTAMA");
        System.out.print("Masukkan nilai n : ");
        int input = sc.nextInt();
        System.out.println(input+" bilangan prima pertama :");
        
        int n=0,angka=2;
        
        while(n<input){
           int  jml_faktor=0;
            for (int bagi = 1; bagi <= angka; bagi++) {
                if(angka % bagi == 0) {
                   jml_faktor++;} 
            	  }
                if(jml_faktor == 2){
                System.out.print(angka+" ");
                n++;
                }
        angka++;    
        }
        }}
   
   
