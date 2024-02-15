package SubProgram;
import java.util.Scanner;
public class method_appWarung {
    void kasir () {
    
    }
    static int hitungharga(int hargasatuan, int jumlah)//header
    {
        //body
        int harga = hargasatuan*jumlah;
        return harga;
    }
    static String[][]sort(String[]menu, int[]harga){
        String[][] hasilSort = new String[10][2];
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu.length-1; j++) {
                if(menu[j].compareToIgnoreCase(menu[j+1])>0){
                    String t = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = t;
                    int h = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = h;
                }
            }                
        }
        for (int i = 0; i < menu.length; i++) {
            hasilSort[i][0]=menu[i];
            hasilSort[i][1]=String.valueOf(harga[i]);
        }
        return hasilSort;        
    }
    static String[][] search(String[]menu,int harga[],String cari){
        String[][] hasil=new String[10][2];
        String makanan2[][]=new String[10][2];
        int idx = 0;                    
        for (int i = 0; i < menu.length; i++) {
            makanan2[i][0]=menu[i].toLowerCase();
            String carimenu=cari.toLowerCase();
            if (makanan2[i][0].indexOf(carimenu)>=0){
            hasil[idx][0]= menu[i];
            hasil[idx][1]= String.valueOf(harga[i]);
            idx++;
            }                        
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int memesan = 1, pilih=0;
        System.out.println("Ingin memesan? (1.Ya/2.Tidak)");
        System.out.print("=> Pilih :");
        memesan = sc.nextInt();
        while(memesan==1){
        String beli[][] = new String [10][2];
        int jumlahbeli=0, grandtotal=0, bayar, kembalian;
        int porsi[] = new int[10];
        int subtotal[] = new int[10];
        
        String makanan[] = new String[10];
        int harga[] = new int[10];
        makanan[0]="Sate Ayam   "; harga[0]=12000;
        makanan[1]="Ayam Geprek "; harga[1]=15000;
        makanan[2]="Sate Kambing"; harga[2]=20000;
        makanan[3]="Soto Madura "; harga[3]=12000;
        makanan[4]="Mie Ayam    "; harga[4]=12000;
        makanan[5]="Gado-gado   "; harga[5]=10000;
        makanan[6]="Rawon       "; harga[6]=12000;
        makanan[7]="Bakso       "; harga[7]=8000;
        makanan[8]="Pecel       "; harga[8]=10000;
        makanan[9]="Penyetan    "; harga[9]=8000;
        
        String minuman[]=new String[5];
        int hargaM[] = new int [5];
        minuman[0]="Teh         ";  hargaM[0]=4000;
        minuman[1]="Jeruk       ";  hargaM[1]=5000;
        minuman[2]="Air Mineral ";  hargaM[2]=3000;
        minuman[3]="Es Kelapa   ";  hargaM[3]=5000;  
        minuman[4]="Soda        ";  hargaM[4]=7000;
      
        String snack[] = new String[5];
        int hargaS[] = new int [5];
        snack[0]="Pudding       ";   hargaS[0]=4000;
        snack[1]="Kentang Goreng";   hargaS[1]=5000;
        snack[2]="Sosis Bakar   ";   hargaS[2]=6000;
        snack[3]="Sosis Goreng  ";   hargaS[3]=5000;  
        snack[4]="Jasuke        ";   hargaS[4]=6000;
        
        System.out.println("======================================");
        System.out.println("                 MENU");
        do{            
            System.out.println("--------------------------------------");
            System.out.println("1 . Makanan");
            System.out.println("2 . Minuman");
            System.out.println("3 . Snack");
            System.out.println("4 . Selesai");
            System.out.println("......................................");
            System.out.print("=> Pilih : ");
            pilih = sc.nextInt();
            System.out.println("......................................");
            switch(pilih){
                case 1:
                    System.out.println("1. Daftar Makanan");
                    System.out.println("2. Cari Makanan");
                    System.out.println(" ");
                    System.out.print("=> Pilih : ");
                    int pilih1=sc.nextInt();
                    System.out.println("");
                    switch(pilih1){
                        case 1:
                            String[][] sortM=sort(makanan,harga);
                            System.out.println("--------------------------------------");
                            System.out.println("           Daftar Menu Makanan");
                            System.out.println("--------------------------------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 10; i++) {
                                System.out.println((i+1)+" . "+sortM[i][0]+"\t\t"+sortM[i][1]);
                            }
                            System.out.println("11. Selesai");
                            int pilih2 =0;
                            while(pilih2<11){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu   : ");
                            pilih2 = sc.nextInt();
                            if(pilih2!=11){
                            beli[jumlahbeli][0]=sortM[pilih2-1][0];
                            beli[jumlahbeli][1]=String.valueOf(sortM[pilih2-1][1]);
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                        case 2:
                            int idxP =0;
                            System.out.println("......................................");
                            System.out.print("Cari : ");
                            String cari = sc.next();
                            System.out.println("------------Hasil Pencarian------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            String hasilcari[][] = search(makanan,harga,cari);
                            for (int i = 0; i < hasilcari.length; i++) {
                                if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                {
                                System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t"
                                        +Integer.parseInt(hasilcari[i][1]));
                                idxP++;
                                }
                            }
                            System.out.println(idxP+1+" . Selesai");
                            int pilih3 =0;
                            while(pilih3<idxP+1){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu : ");
                            pilih3 = sc.nextInt();
                            if(pilih3!=idxP+1){
                            beli[jumlahbeli][0]=hasilcari[pilih3-1][0];
                            beli[jumlahbeli][1]=hasilcari[pilih3-1][1];
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Daftar Minuman");
                    System.out.println("2. Cari Minuman");
                    System.out.println("");
                    System.out.print("=> Pilih : ");
                    int pilih4=sc.nextInt();
                    switch(pilih4){
                        case 1:
                            String[][] sortM=sort(minuman,hargaM);
                            System.out.println("--------------------------------------");
                            System.out.println("           Daftar Menu Minuman");
                            System.out.println("--------------------------------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                                System.out.println((i+1)+" . "+sortM[i][0]+"\t\t"+sortM[i][1]);
                            }
                            System.out.println("6 . Selesai");
                            int pilih5 =0;
                            while(pilih5<6){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu : ");
                            pilih5 = sc.nextInt();
                            if(pilih5!=6){
                            beli[jumlahbeli][0]=sortM[pilih5-1][0];
                            beli[jumlahbeli][1]=String.valueOf(sortM[pilih5-1][1]);
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                        case 2:
                            int idxP =0;
                            System.out.print("Cari : ");
                            String cari = sc.next();
                            System.out.println("------------Hasil Pencarian------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            String hasilcari[][] = search(minuman,hargaM,cari);
                            for (int i = 0; i < hasilcari.length; i++) {
                                if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                {
                                System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t"
                                        +Integer.parseInt(hasilcari[i][1]));
                                idxP++;
                                }
                            }
                            System.out.println(idxP+1+" . Selesai");
                            int pilih6 =0;
                            while(pilih6!=idxP+1){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu : ");
                            pilih6 = sc.nextInt();
                            if(pilih6!=idxP+1){
                            beli[jumlahbeli][0]=hasilcari[pilih6-1][0];
                            beli[jumlahbeli][1]=hasilcari[pilih6-1][1];
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Daftar Snack");
                    System.out.println("2. Cari Snack");
                    System.out.println("");
                    System.out.print("=> Pilih : ");
                    int pilih7=sc.nextInt();
                    switch(pilih7){
                        case 1:
                            String[][] sortM=sort(snack,hargaS);
                            System.out.println("--------------------------------------");
                            System.out.println("           Daftar Menu Minuman");
                            System.out.println("--------------------------------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            for (int i = 0; i < 5; i++) {
                                System.out.println((i+1)+" . "+sortM[i][0]+"\t\t"+sortM[i][1]);
                            }
                            System.out.println("6 . Selesai");
                            int pilih8 =0;
                            while(pilih8<6){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu : ");
                            pilih8 = sc.nextInt();
                            if(pilih8!=6){
                            beli[jumlahbeli][0]=sortM[pilih8-1][0];
                            beli[jumlahbeli][1]=String.valueOf(sortM[pilih8-1][1]);
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                        case 2:
                            int idxP =0;
                            System.out.print("Cari : ");
                            String cari = sc.next();
                            System.out.println("------------Hasil Pencarian------------");
                            System.out.println("No. Menu\t\t\tHarga");
                            String hasilcari[][] = search(snack,hargaS,cari);
                            for (int i = 0; i < hasilcari.length; i++) {
                                if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                {
                                System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t"
                                        +Integer.parseInt(hasilcari[i][1]));
                                idxP++;
                                }
                            }
                            System.out.println(idxP+1+" . Selesai");
                            int pilih9 =0;
                            while(pilih9!=idxP+1){
                            System.out.println("......................................");
                            System.out.print("Pilih Menu : ");
                            pilih9 = sc.nextInt();
                            if(pilih9!=idxP+1){
                            beli[jumlahbeli][0]=hasilcari[pilih9-1][0];
                            beli[jumlahbeli][1]=hasilcari[pilih9-1][1];
                            System.out.print("Jumlah porsi : ");
                            porsi[jumlahbeli]=sc.nextInt();
                            subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                            grandtotal=grandtotal+subtotal[jumlahbeli];
                            jumlahbeli++;
                            }
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }
        }while(pilih!=4);
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("             DAFTAR PEMBELIAN");
        System.out.println("----------------------------------------");
        System.out.println("No. Menu\tHarga\tJumlah\tSub Total");
        for (int i = 0; i < jumlahbeli; i++) {
            System.out.println(i+1+" . "+beli[i][0]+beli[i][1]+"\t"+porsi[i]+"\t"+subtotal[i]);
        }
        System.out.println(".......................................");
        System.out.println("Grandtotal              : "+grandtotal);    
        System.out.print("Nominal uang pembayaran : ");
        bayar = sc.nextInt();
        kembalian = bayar-grandtotal;
        if(kembalian!=0){
            System.out.println("Kembalian : "+kembalian);
        }else{
            System.out.println("Uang Anda pas.");
        }
        System.out.println("");
        System.out.println("--------------Terima Kasih----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingin memesan? (1.Ya/2.Tidak)");
        System.out.print("=> Pilih : ");
        memesan = sc.nextInt();
        System.out.println("");
    }
    }
    
}
