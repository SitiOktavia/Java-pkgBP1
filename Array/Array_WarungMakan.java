package Array;
import java.util.Scanner;
public class Array_WarungMakan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu [];
        menu = new String[5];
        int harga[] = new int [5];
        int porsi[] = new int [5];
        int total1[] = new int [5];
        int indeks=0, pilih;
        int total2=0;
        do{
            System.out.println("DAFTAR MENU");
            System.out.println("1. Sate");
            System.out.println("2. Soto");
            System.out.println("3. Rawon");
            System.out.println("4. Pecel");
            System.out.println("5. Bakso");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();
            switch(pilih){
                case 1 :
                    menu[indeks]= "Sate";
                    harga[indeks]=15000;
                    System.out.print("Masukkan jumlah porsi = ");
                    porsi[indeks]=s.nextInt();
                    total1[indeks]=porsi[indeks]*15000;
                    total2=total2+total1[indeks];
                    System.out.println("");
                    break;
                case 2 :
                    menu[indeks]= "Soto";
                    harga[indeks]=10000;
                    System.out.print("Masukkan jumlah porsi = ");
                    porsi[indeks]=s.nextInt();
                    total1[indeks]=porsi[indeks]*10000;
                    total2=total2+total1[indeks];
                    System.out.println("");
                    break;
                case 3 :
                    menu[indeks]= "Rawon";
                    harga[indeks]=12000;
                    System.out.print("Masukkan jumlah porsi = ");
                    porsi[indeks]=s.nextInt();
                    total1[indeks]=porsi[indeks]*12000;
                    total2=total2+total1[indeks];
                    System.out.println("");
                    break;
                case 4 :
                    menu[indeks]= "Pecel";
                    harga[indeks]=8000;
                    System.out.print("Masukkan jumlah porsi = ");
                    porsi[indeks]=s.nextInt();
                    total1[indeks]=porsi[indeks]*8000;
                    total2=total2+total1[indeks];
                    System.out.println("");
                    break; 
                case 5 :
                    menu[indeks]= "Bakso";
                    harga[indeks]=10000;
                    System.out.print("Masukkan jumlah porsi = ");
                    porsi[indeks]=s.nextInt();
                    total1[indeks]=porsi[indeks]*10000;
                    total2=total2+total1[indeks];
                    System.out.println("");
                    break;    
            }
            indeks++;
        }while(pilih!=6);
        //tampilkan makanan yang dibeli
        System.out.println("===================================================");
        System.out.println("  Menu \t Harga Satuan\tJumlah Porsi\tHarga Total");
        for (int i = 0; i < indeks-1; i++) {
            System.out.println((i+1)+"."+menu[i]+"\t Rp."+harga[i]+"\t     "
                    +porsi[i]+"\t\t Rp"+total1[i]);     
        }
        System.out.println("");
        System.out.println("Grand Total : Rp" + total2);
        System.out.println("===================================================");
    }
}
