package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu[]= new String[5];
        int harga2[] = new int[5];
        int subtotal[] = new int[5];
        int porsi[] = new int[5];
        String menuM[];
        String menu2[] = new String[5];
        int harga[]= new int[5];
        int pilih, pilihS=0, pilihM=1, grandtotal=0, nominal;
        //inisialisasi data 
        menu[0]="Sate"; harga[0]=15000;
        menu[1]="Soto"; harga[1]=12000;
        menu[2]="Gule"; harga[2]=20000;
        menu[3]="Bakso"; harga[3]=10000;
        menu[4]="Rawon"; harga[4]=14000;
        
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("=> Pilih : ");
        pilih=sc.nextInt();
        if(pilih==1){
        do{
        System.out.println("------------WARUNG MAKAN HAPPY------------");                    
        System.out.println("   Menu \t\t\tHarga");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". "+menu[i]+" "+"\t\t"+harga[i]);
            }
        do{
        System.out.println("..........................................");
        System.out.println("1. Urutkan menu dari yang Termahal");
        System.out.println("2. Urutkan menu dari yang Termurah");
        System.out.println("3. Lanjut memesan makanan");
        System.out.print("=>Pilih : ");
        pilihS=sc.nextInt();       
           switch(pilihS){
               case 1:
                    menu2 = menu;
                    harga2 = harga;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4; j++) {
                            if(harga2[j]<harga2[j+1]){
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
                    System.out.println("   Menu \t\t\tHarga");
                    for (int i = 0; i < 5; i++) {
                    System.out.println(i+1+". "+menu2[i]+" "+"\t\t"+harga2[i]);
                    }
                   break;
               case 2:
                    menu2 = menu;
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
                    System.out.println("   Menu \t\t\t\tHarga");
                    for (int i = 0; i < 5; i++) {
                    System.out.println(i+1+". "+menu2[i]+" "+"\t\t\t"+harga2[i]);
                    }
                   break;
               case 3:
                   break;                                       
        }
        }while(pilihS<3);                
        int idx=0;
        do{
            System.out.print("Masukkan nomor menu (0 untuk selesai) : ");
            pilihM=sc.nextInt();
            switch(pilihM){
                case 1:
                    menu[idx]=menu2[1];
                    harga[idx]=harga2[1];
                    System.out.print("Jumlah porsi : ");
                    porsi[idx]=sc.nextInt();
                    subtotal[idx]=porsi[idx]*harga2[1];
                    grandtotal=grandtotal+subtotal[idx];
                    break;
                case 2:
                    break;
                case 3:
                    break; 
                case 4:
                    break;  
                case 5:
                    break;
                default: 
                    System.out.println("");
            }
            
        }while(pilihM<=5 && pilihM!=0);
        
        System.out.println("-----------STRUK PEMBELIAN-----------");
        System.out.println("  Menu\tHarga\tJumlah\tSub Total");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"."+menu[i]+"\t"+porsi[i]+"\t"+"\t"+subtotal[i]);    
        }
        
        
        System.out.println("Ingin memesan? (1.Ya 2.Tidak)");
        System.out.print("=> Pilih : ");
        pilih=sc.nextInt();
        System.out.println("");
        }while(pilih<2);
        }
        }
    }
    

