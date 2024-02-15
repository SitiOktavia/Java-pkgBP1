package Searching;
import java.util.Scanner;
public class Searching_WarungMakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0, memesan=1;
        
        System.out.println("Ingin memesan? (1.Ya/2.Tidak)");
        System.out.print("=> Pilih :");
        memesan = sc.nextInt();
        while(memesan==1){
        String belimakan[] = new String[5];
        int beliharga[] = new int[5];
        int porsi[] = new int[5];
        int jumlahbeli = 0,  grandtotal=0, bayar, kembalian;
        int total[]= new int[5];
        //array
        String makanan[] = new String [10];
        int harga[] = new int[10];
        //inialisasi array
        makanan[0]="Sate Ayam   "; harga[0]=12000;
        makanan[1]="Sate Sapi   "; harga[1]=15000;
        makanan[2]="Sate Kambing"; harga[2]=20000;
        makanan[3]="Soto Madura "; harga[3]=12000;
        makanan[4]="Soto Lmgn   "; harga[4]=12000;
        makanan[5]="Gado-gado   "; harga[5]=10000;
        makanan[6]="Rawon       "; harga[6]=12000;
        makanan[7]="Bakso       "; harga[7]=8000;
        makanan[8]="Pecel       "; harga[8]=10000;
        makanan[9]="Penyetan    "; harga[9]=8000;
        
        System.out.println("======================================");
        System.out.println("                 MENU");
        do{            
            System.out.println("--------------------------------------");
            System.out.println("1. Daftar Menu Makanan");
            System.out.println("2. Cari berdasarkan menu");
            System.out.println("3. Cari berdasrakan harga");
            System.out.println("4. Selesai");
            System.out.println("......................................");
            System.out.print("=> Pilih : ");
            pilih=sc.nextInt();
            System.out.println("......................................");
            switch(pilih){
                case 1:
                    //urutkan bedasar nama menggunakan bubble sort
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 9; j++) {
                            if(makanan[j].compareToIgnoreCase(makanan[j+1])>0){
                                String t = makanan[j];
                                makanan[j] = makanan[j+1];
                                makanan[j+1] = t;
                                int h = harga[j];
                                harga[j]= harga[j+1];
                                harga[j+1] = h;
                            }
                        }
                    }
                    System.out.println("No. Menu\t\t\tHarga");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i+1+" . "+makanan[i]+"\t\t"+harga[i]);
                    }
                    
                    break;
                case 2:
                    System.out.print("Cari : ");
                    String cari = sc.next();
                    String carimakan[] = new String[10];
                    String menu[]=new String[10];
                    int cariharga[] = new int[10];
                    int idx = 0;                    
                    System.out.println("No. Menu\t\t\tHarga");
                    for (int i = 0; i < makanan.length; i++) {
                        menu[i]=makanan[i].toLowerCase();
                        String carimenu=cari.toLowerCase();
                        if (menu[i].indexOf(carimenu)>=0){
                            carimakan[idx] = makanan[i];
                            cariharga[idx] = harga[i];
                            idx++;
                            System.out.println(idx+" . "+makanan[i]+"\t\t"+harga[i]);
                        }
                    }
                    //transaksi
                    System.out.println(idx+1+" . Selesai");
                    int pilih2 =0;
                    while(pilih2!=idx+1){
                    System.out.println("......................................");
                    System.out.print("Pilih Menu : ");
                    pilih2 = sc.nextInt();
                    if(pilih2!=idx+1){
                    belimakan[jumlahbeli]=carimakan[pilih2-1];
                    beliharga[jumlahbeli]=cariharga[pilih2-1];
                    System.out.print("Jumlah porsi : ");
                    porsi[jumlahbeli]=sc.nextInt();
                    total[jumlahbeli]=porsi[jumlahbeli]*beliharga[jumlahbeli];
                    grandtotal=grandtotal+total[jumlahbeli];
                    jumlahbeli++;
                    }
                    }
                    break;
                case 3:
                    System.out.print("Harga minimum : ");
                    int min = sc.nextInt();
                    System.out.print("Harga maksimum : ");
                    int max = sc.nextInt();
                    int hargacari[]=new int[10];
                    String menucari[]=new String [10];
                    int idx1=0;                    
                    System.out.println("No. Menu\t\t\tHarga");
                    for (int i = 0; i < makanan.length; i++) {
                        if(harga[i]<=max && harga[i]>=min){
                            hargacari[idx1]=harga[i];
                            menucari[idx1]=makanan[i];
                            idx1++;
                            System.out.println(idx1+" . "+makanan[i]+"\t\t"+harga[i]);
                        }
                    }
                    System.out.println(idx1+1+". Selesai");
                    pilih2 =0;
                    while(pilih2!=idx1+1){
                    System.out.println("......................................");
                    System.out.print("Pilih Menu : ");
                    pilih2 = sc.nextInt();
                    if(pilih2!=idx1+1){
                    belimakan[jumlahbeli]=menucari[pilih2-1];
                    beliharga[jumlahbeli]=hargacari[pilih2-1];
                    System.out.print("Jumlah porsi : ");
                    porsi[jumlahbeli]=sc.nextInt();
                    total[jumlahbeli] = porsi[jumlahbeli]*hargacari[jumlahbeli];
                    grandtotal=grandtotal+total[jumlahbeli];
                    jumlahbeli++;
                    }
                    }
                    break; 
            }
        }while(pilih!=4);
        System.out.println("--------------------------------------");
        System.out.println("            DAFTAR PEMBELIAN");
        System.out.println("--------------------------------------");
        System.out.println("No. Menu\tHarga\tJumlah\tSub Total");
        for (int i = 0; i < jumlahbeli; i++) {
            System.out.println(i+1+". "+belimakan[i]+"\t"+beliharga[i]+"\t"+porsi[i]+"\t"+total[i]);
        }
        System.out.println("......................................");
        System.out.println("Grandtotal : "+grandtotal); 
        System.out.print("Masukkan nominal uang pembayaran : ");
        bayar = sc.nextInt();
        kembalian = bayar-grandtotal;
        if(kembalian!=0){
            System.out.println("Kembalian : "+kembalian);
        }else{
            System.out.println("Uang Anda pas.");
        }
        System.out.println("Terima kasih");
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Ingin memesan? (1.Ya/2.Tidak)");
        System.out.print("=> Pilih : ");
        memesan = sc.nextInt();
        System.out.println("");
    }
    }
    
}
