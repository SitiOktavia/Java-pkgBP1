package Sorting;
import java.util.Scanner;
public class Sorting_appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu [] = new String[5];
        int harga[] = new int [5];
        int pilih=0;
        //inisialisasi data 
        menu[0]="Sate"; harga[0]=15000;
        menu[1]="Soto"; harga[1]=12000;
        menu[2]="Gule"; harga[2]=20000;
        menu[3]="Bakso"; harga[3]=10000;
        menu[4]="Rawon"; harga[4]=14000;
        
        do{
            System.out.println("\nMENU");
            System.out.println("1. Daftar Makanan");
            System.out.println("2. Urutkan Termurah");
            System.out.println("3. Urutkan Termahal");
            System.out.println("4. Selesai");
            System.out.println("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Menu\t Harga");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(menu[i]+"\t"+harga[i]);
                    }
                    break;
                case 2:
                    //memakai algortima bubble sort
                    String menu2[] = new String[5];
                    menu2 = menu;
                    int harga2[] = new int[5];
                    harga2 = harga;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4; j++) {
                            if(harga2[j]>harga2[j+1]){
                              //sorting harga
                              int temp = harga2[j];
                              harga2[j] = harga2[j+1];
                              harga2[j+1] = temp;
                              //sorting menu
                              String tempm = menu2[j];
                              menu2[j] = menu2[j+1];
                              menu2[j+1] = tempm;
                            }
                        }
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(menu2[i]+"\t"+harga2[i]);
                    }
                    break;
                case 3:
                    //memakai algoritma seleksi sort
                    menu2 = menu;
                    harga2 = harga;
                    for (int i = 0; i < 4; i++) {
                        for (int j = i+1; j < 5; j++) {
                            if(harga2[i]<harga2[j]){
                              //sorting harga
                              int temp = harga2[j];
                              harga2[j] = harga2[i];
                              harga2[i] = temp;
                              //sorting menu
                              String tempm = menu2[j];
                              menu2[j] = menu2[i];
                              menu2[i] = tempm;
                            }
                        }
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(menu2[i]+"\t"+harga2[i]);
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
            }
        }while(pilih!=4);
    }
    
}
