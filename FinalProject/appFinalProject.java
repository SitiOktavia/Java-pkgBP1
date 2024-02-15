package FinalProject;
import java.util.Scanner;
import java.util.*;
import java.text.*;
public class appFinalProject {
    static int hitungharga(int hargasatuan, int jumlah)//header
    {
        //body
        int harga = hargasatuan*jumlah;
        return harga;
    }
    static String[][]sort(String[]menu, int[]harga, int idx){
        String[][] hasilSort = new String[10][2];
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx-1; j++) {
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
        for (int i = 0; i < idx; i++) {
            hasilSort[i][0]=menu[i];
            hasilSort[i][1]=String.valueOf(harga[i]);
        }
        return hasilSort;        
    }
        
    static String[][] search(String[]menu,int harga[],String cari, int idxC){
        String[][] hasil=new String[10][2];
        String makanan2[][]=new String[10][2];
        int idx = 0;                    
        for (int i = 0; i < idxC; i++) {
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
        Scanner sc = new Scanner (System.in);
        Date now = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy || HH:mm:ss");
        String date [] = new String [50];
        int user=0, idxlapor=0, total=0;
        String menulapor[] = new String [50];
        int jumlahlapor [][] = new int [50][2];
        String kasir [] = new String[50];
                    //array menu makan
                    int idxMkn=7;
                    String menuMkn[] = new String[12];
                    int hargaMkn[] = new int[12];
                    menuMkn[0]="Sushi"; hargaMkn[0]=18000;
                    menuMkn[1]="Onigiri"; hargaMkn[1]=15000;
                    menuMkn[2]="Curry"; hargaMkn[2]=22000;
                    menuMkn[3]="Ramen"; hargaMkn[3]=20000;
                    menuMkn[4]="Yakiniku"; hargaMkn[4]=35000;
                    menuMkn[5]="Sukiyaki"; hargaMkn[5]=35000;
                    menuMkn[6]="Takoyaki"; hargaMkn[6]=15000;
                    //array menu minuman
                    int idxMnm=6;
                    String minuman[]=new String[10];
                    int hargaM[] = new int [10];
                    minuman[0]="Matcha";  hargaM[0]=15000;
                    minuman[1]="Juice";  hargaM[1]=10000;
                    minuman[2]="Mojito";  hargaM[2]=16000;
                    minuman[3]="Hojicha";  hargaM[3]=18000;  
                    minuman[4]="Lemonade";  hargaM[4]=10000;
                    minuman[5]="Soda ";  hargaM[5]=15000; 
                    //array menu dessert
                    int idxD=5;
                    String dessert[] = new String[10];
                    int hargaD[] = new int [10];
                    dessert[0]="Pudding";   hargaD[0]=10000;
                    dessert[1]="Ice Cream";   hargaD[1]=12000;
                    dessert[2]="Parfait";   hargaD[2]=15000;
                    dessert[3]="Pancake";   hargaD[3]=10000;  
                    dessert[4]="Mochi";   hargaD[4]=10000;
        do{
            System.out.println("Masuk sebagai?");
            System.out.println("1. Kasir");
            System.out.println("2. Admin");
            System.out.println("3. Owner");
            System.out.println("4. Exit");
            System.out.println("..........................................");
            System.out.print("=> Pilih : ");
            user = sc.nextInt();
            System.out.println("..........................................");
            switch(user){
                case 1:
                    int memesan = 1;
                    System.out.print("Masukkan nama   :  ");
                    String K1 = sc.next();
                    String K2 = sc.nextLine();
                    String namaK = K1+K2;
                    System.out.println("");
                    System.out.println("================MENU KASIR================");
                    System.out.println("1. Input pembelian");
                    System.out.println("2. Exit Kasir");
                    System.out.println("..........................................");
                    System.out.print("=> Pilih :");
                    memesan = sc.nextInt();
                    System.out.println("..........................................");
                    while(memesan==1){
                    String beli[][] = new String [10][2];
                    int jumlahbeli=0, grandtotal=0, bayar, kembalian;
                    int porsi[] = new int[10];
                    int subtotal[] = new int[10];
                    int pilihK=0;
                    System.out.println("");
                    System.out.println("==========================================");
                    System.out.println("                    MENU");
                    do{            
                        System.out.println("------------------------------------------");
                        System.out.println("1 . Makanan");
                        System.out.println("2 . Minuman");
                        System.out.println("3 . Dessert");
                        System.out.println("4 . Selesai");
                        System.out.println("..........................................");
                        System.out.print("=> Pilih : ");
                        pilihK = sc.nextInt();
                        System.out.println("..........................................");
                        switch(pilihK){
                            case 1:
                                System.out.println("1. Daftar Makanan");
                                System.out.println("2. Cari Makanan");
                                System.out.println("3. Exit Menu Makanan");
                                System.out.println(" ");
                                System.out.print("=> Pilih : ");
                                int pilih1=sc.nextInt();
                                System.out.println("");
                                switch(pilih1){
                                    case 1:
                                        String[][] sortM=sort(menuMkn,hargaMkn,idxMkn);
                                        System.out.println("----------------------------------------------");
                                        System.out.println("             Daftar Menu Makanan");
                                        System.out.println("----------------------------------------------");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        for (int i = 0; i < idxMkn; i++) {
                                            System.out.println((i+1)+" . "+sortM[i][0]+"\t\t\t\tRp"+sortM[i][1]);
                                        }
                                        System.out.println(idxMkn+1+" . Selesai");
                                        int pilih2 =0;
                                        while(pilih2<idxMkn+1){
                                        System.out.println("..........................................");
                                        System.out.print("Pilih Menu   : ");
                                        pilih2 = sc.nextInt();
                                        if(pilih2!=idxMkn+1){
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
                                        System.out.println("..........................................");
                                        System.out.print("Cari : ");
                                        String cari = sc.next();
                                        System.out.println("");
                                        System.out.println("-------------Hasil Pencarian-------------");
                                        System.out.println("");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        String hasilcari[][] = search(menuMkn,hargaMkn,cari,idxMkn);
                                        for (int i = 0; i < hasilcari.length; i++) {
                                            if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                            {
                                            System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t\t\tRp"
                                                    +Integer.parseInt(hasilcari[i][1]));
                                            idxP++;
                                            }
                                        }
                                        System.out.println(idxP+1+" . Selesai");
                                        int pilih3 =0;
                                        while(pilih3<idxP+1){
                                        System.out.println("..........................................");
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
                                    case 3:
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("1. Daftar Minuman");
                                System.out.println("2. Cari Minuman");
                                System.out.println("3. Exit Menu Minuman");
                                System.out.println("");
                                System.out.print("=> Pilih : ");
                                int pilih4=sc.nextInt();
                                switch(pilih4){
                                    case 1:
                                        String[][] sortM=sort(minuman,hargaM,idxMnm);
                                        System.out.println("-----------------------------------------");
                                        System.out.println("            Daftar Menu Minuman");
                                        System.out.println("-----------------------------------------");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        for (int i = 0; i < idxMnm; i++) {
                                            System.out.println((i+1)+" . "+sortM[i][0]+"\t\t\t\tRp"+sortM[i][1]);
                                        }
                                        System.out.println(idxMnm+1+" . Selesai");
                                        int pilih5 =0;
                                        while(pilih5<idxMnm+1){
                                        System.out.println("..........................................");
                                        System.out.print("Pilih Menu : ");
                                        pilih5 = sc.nextInt();
                                        if(pilih5!=idxMnm+1){
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
                                        System.out.println("");
                                        System.out.println("-------------Hasil Pencarian-------------");
                                        System.out.println("");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        String hasilcari[][] = search(minuman,hargaM,cari,idxMnm);
                                        for (int i = 0; i < hasilcari.length; i++) {
                                            if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                            {
                                            System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t\t\tRp"
                                                    +Integer.parseInt(hasilcari[i][1]));
                                            idxP++;
                                            }
                                        }
                                        System.out.println(idxP+1+" . Selesai");
                                        int pilih6 =0;
                                        while(pilih6!=idxP+1){
                                        System.out.println("..........................................");
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
                                    case 3:
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("1. Daftar Dessert");
                                System.out.println("2. Cari Dessert");
                                System.out.println("3. Exit Menu Dessert");
                                System.out.println("");
                                System.out.print("=> Pilih : ");
                                int pilih7=sc.nextInt();
                                switch(pilih7){
                                    case 1:
                                        String[][] sortM=sort(dessert,hargaD,idxD);
                                        System.out.println("-----------------------------------------");
                                        System.out.println("            Daftar Menu Dessert");
                                        System.out.println("-----------------------------------------");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        for (int i = 0; i < idxD; i++) {
                                            System.out.println((i+1)+" . "+sortM[i][0]+"\t\t\t\tRp"+sortM[i][1]);
                                        }
                                        System.out.println(idxD+1+" . Selesai");
                                        int pilih8 =0;
                                        while(pilih8<idxD+1){
                                        System.out.println("..........................................");
                                        System.out.print("Pilih Menu : ");
                                        pilih8 = sc.nextInt();
                                        if(pilih8!=idxD+1){
                                        beli[jumlahbeli][0]=sortM[pilih8-1][0];
                                        beli[jumlahbeli][1]=String.valueOf(sortM[pilih8-1][1]);
                                        System.out.print("Jumlah : ");
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
                                        System.out.println("");
                                        System.out.println("-------------Hasil Pencarian-------------");
                                        System.out.println("");
                                        System.out.println("No. Menu\t\t\t\tHarga");
                                        String hasilcari[][] = search(dessert,hargaD,cari,idxD);
                                        for (int i = 0; i < hasilcari.length; i++) {
                                            if(hasilcari[i][0]!=null&&hasilcari[i][1]!=null)
                                            {
                                            System.out.println(i+1+" . "+hasilcari[i][0]+"\t\t\t\tRp"
                                                    +Integer.parseInt(hasilcari[i][1]));
                                            idxP++;
                                            }
                                        }
                                        System.out.println(idxP+1+" . Selesai");
                                        int pilih9 =0;
                                        while(pilih9!=idxP+1){
                                        System.out.println("..........................................");
                                        System.out.print("Pilih Menu : ");
                                        pilih9 = sc.nextInt();
                                        if(pilih9!=idxP+1){
                                        beli[jumlahbeli][0]=hasilcari[pilih9-1][0];
                                        beli[jumlahbeli][1]=hasilcari[pilih9-1][1];
                                        System.out.print("Jumlah : ");
                                        porsi[jumlahbeli]=sc.nextInt();
                                        subtotal[jumlahbeli] = hitungharga (Integer.parseInt(beli[jumlahbeli][1]),porsi[jumlahbeli]);
                                        grandtotal=grandtotal+subtotal[jumlahbeli];
                                        jumlahbeli++;
                                        }
                                        }
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            default:
                                break;
                        }
                    }while(pilihK!=4);
                    System.out.println("");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("                       DAFTAR PEMBELIAN");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Kasir : "+namaK+"\t\tTanggal : "+dateformat.format(now));
                    System.out.println("........................................................");
                    System.out.println("No. Menu\t\tHarga\t   Jumlah\tSub Total");
                    for (int i = 0; i < jumlahbeli; i++) {
                        System.out.println(i+1+" . "+beli[i][0]+"\t\tRp"+beli[i][1]+"\t     "+porsi[i]+"\t\tRp"+subtotal[i]);
                        menulapor[idxlapor] = beli[i][0];
                        jumlahlapor[idxlapor][0] = porsi[i];                        
                        jumlahlapor[idxlapor][1] = subtotal[i];
                        kasir[idxlapor] = namaK;
                        date[idxlapor] = dateformat.format(now);                        
                        idxlapor++;
                    }
                    System.out.println("........................................................");
                    System.out.println("Grandtotal              :   Rp"+grandtotal);    
                    total = total+grandtotal;
                    System.out.print("Nominal uang pembayaran :   Rp");
                    bayar = sc.nextInt();
                    kembalian = bayar-grandtotal;
                    if(kembalian!=0){
                        System.out.println("Kembalian               :   Rp"+kembalian);
                    }else{
                        System.out.println("Uang Anda pas.");
                    }
                        System.out.println("");
                    System.out.println("---------------------Terima Kasih-----------------------");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("======================MENU KASIR======================");
                    System.out.println("1. Input pembelian");
                    System.out.println("2. Exit Kasir");
                    System.out.println("..........................................");
                    System.out.print("=> Pilih :");
                    memesan = sc.nextInt();
                    System.out.println("..........................................");
                    System.out.println("");
                    }
                    System.out.println("----------------------EXIT KASIR------------------------");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Menu tidak ditemukan");
                    break;
                case 2:
                    int pilihA=1;
                    do{
                        System.out.println("========================MENU ADMIN========================");
                        System.out.println("1.  Tambah Menu");
                        System.out.println("2.  Hapus Menu");
                        System.out.println("3.  Exit Admin");
                        System.out.println(".........................................................");
                        System.out.print("=>  Pilih  :  ");
                        pilihA = sc.nextInt();
                        System.out.println(".........................................................");                    
                        switch(pilihA){
                            case 1:
                                int pilihTM=0;
                                do{
                                    System.out.println("");
                                    System.out.println("1.  Tambah Menu Makanan");
                                    System.out.println("2.  Tambah Menu Minuman");
                                    System.out.println("3.  Tambah Menu Dessert");
                                    System.out.println("4.  Selesai");
                                    System.out.println(".........................................................");
                                    System.out.print("=>  Pilih  :  ");
                                    pilihTM = sc.nextInt();
                                    System.out.println(".........................................................");  
                                    switch(pilihTM){
                                        case 1:                                        
                                            System.out.print("Masukkan nama menu baru : ");                                      
                                            menuMkn[idxMkn]=sc.next();
                                            System.out.print("Masukkan harga menu baru :");
                                            hargaMkn[idxMkn]=sc.nextInt();
                                            idxMkn++;          
                                            System.out.println("");
                                            System.out.println("Menu ditambah.");
                                            System.out.println("");
                                            System.out.println("........................................................."); 
                                            break;
                                        case 2:
                                            System.out.print("Masukkan nama menu baru : ");                                      
                                            minuman[idxMnm]=sc.next();
                                            System.out.print("Masukkan harga menu baru :");
                                            hargaM[idxMnm]=sc.nextInt();
                                            idxMnm++;                
                                            System.out.println("");
                                            System.out.println("Menu ditambah.");
                                            System.out.println("");
                                            System.out.println("........................................................."); 
                                            break;
                                        case 3:
                                            System.out.print("Masukkan nama menu baru : ");                                      
                                            dessert[idxD]=sc.next();
                                            System.out.print("Masukkan harga menu baru :");
                                            hargaD[idxD]=sc.nextInt();
                                            idxD++;                         
                                            System.out.println("");
                                            System.out.println("Menu ditambah.");
                                            System.out.println("");
                                            System.out.println("........................................................."); 
                                            break;
                                        case 4:
                                            System.out.println("Daftar menu telah diperbarui");
                                            System.out.println("");
                                            break;
                                        default:
                                            break;
                                    }
                                }while(pilihTM!=4);
                                break;
                            case 2:
                                int pilihHM=0;
                                do{
                                System.out.println("1.  Hapus Menu Makanan");
                                System.out.println("2.  Hapus Menu Minuman");
                                System.out.println("3.  Hapus Menu Dessert");
                                System.out.println("4.  Selesai");
                                System.out.println(".........................................................");
                                System.out.print("=>  Pilih  :  ");
                                pilihHM = sc.nextInt();
                                System.out.println(".........................................................");  
                                switch(pilihHM){
                                    case 1:
                                        System.out.print("Cari nama menu yang akan dihapus : ");
                                        String cariHMkn = sc.next();
                                        boolean ketemu = false;
                                        int idxk = 0;
                                        for (int i = 0; i < idxMkn; i++) {
                                            if(menuMkn[i].compareToIgnoreCase(cariHMkn)==0){
                                                ketemu = true; idxk=i;
                                                break;
                                            }
                                        }
                                        if(ketemu=false){
                                            System.out.println("........................................................."); 
                                            System.out.println("Nama Menu tidak ditemukan");
                                            System.out.println("........................................................."); 
                                        }else{
                                            for (int i = idxk; i < idxMkn; i++) {
                                                menuMkn[i] = menuMkn[i+1]; 
                                                hargaMkn[i] = hargaMkn [i+1];
                                            }
                                            idxMkn--;
                                        }
                                        System.out.println("");
                                        System.out.println("Menu telah dihapus.");
                                        System.out.println("");
                                        System.out.println("........................................................."); 
                                        break;
                                    case 2:
                                        System.out.print("Cari nama menu yang akan dihapus : ");
                                        String cariHMnm = sc.next();
                                        boolean ketemuMnm = false;
                                        int idxkmnm = 0;
                                        for (int i = 0; i < idxMnm; i++) {
                                            if(minuman[i].compareToIgnoreCase(cariHMnm)==0){
                                                ketemuMnm = true; idxkmnm=i;
                                                break;
                                            }
                                        }
                                        if(ketemuMnm=false){
                                            System.out.println("........................................................."); 
                                            System.out.println("Nama Menu tidak ditemukan");
                                            System.out.println("........................................................."); 
                                        }else{
                                            for (int i = idxkmnm; i < idxMnm; i++) {
                                                minuman[i] = minuman[i+1]; 
                                                hargaM[i] = hargaM [i+1];
                                            }
                                            idxMnm--;
                                        }
                                        System.out.println("");
                                        System.out.println("Menu telah dihapus.");
                                        System.out.println("");
                                        System.out.println("........................................................."); 
                                        break;
                                    case 3:
                                        System.out.print("Cari nama menu yang akan dihapus : ");
                                        String cariHD = sc.next();
                                        boolean ketemuD = false;
                                        int idxkD = 0;
                                        for (int i = 0; i < idxD; i++) {
                                            if(dessert[i].compareToIgnoreCase(cariHD)==0){
                                                ketemuD = true; idxkD=i;
                                                break;
                                            }
                                        }
                                        if(ketemuD=false){
                                            System.out.println("........................................................."); 
                                            System.out.println("Nama Menu tidak ditemukan");
                                            System.out.println("........................................................."); 
                                        }else{
                                            for (int i = idxkD; i < idxD; i++) {
                                                dessert[i] = dessert[i+1]; 
                                                hargaD[i] = hargaD [i+1];
                                            }
                                            idxD--;
                                        }
                                        System.out.println("");
                                        System.out.println("Menu telah dihapus.");
                                        System.out.println("");
                                        System.out.println(".........................................................");
                                        break;
                                    case 4:
                                        System.out.println("Daftar menu telah diperbarui");                                    
                                        System.out.println("");
                                        break;
                                    default:
                                        System.out.println("");
                                        System.out.println("Menu tidak ditemukan!!!");
                                        System.out.println("");                               
                                        break;
                                }
                                }while(pilihHM!=4);
                                break;
                            case 3:                    
                                System.out.println("");
                                System.out.println("----------------------EXIT ADMIN------------------------");
                                System.out.println("");
                                break;
                            default:
                                break;
                    }   
                    }while(pilihA!=3);
                    break;
                case 3:
                    int pilihO = 0;
                    do{
                    System.out.println(""); 
                    System.out.println("======================MENU OWNER======================");
                    System.out.println("1.  Lihat laporan penjualan");
                    System.out.println("2.  Lihat menu terlaris");
                    System.out.println("3.  Exit Owner");
                    System.out.println(".........................................................");
                    System.out.print("=>  Pilih  :  ");
                    pilihO = sc.nextInt();
                    System.out.println(".........................................................");                    
                    switch(pilihO){
                        case 1:
                            System.out.println("No. Kasir\t  Waktu dan Tanggal\t Menu Terjual\tJumlah\tSubtotal");
                            for (int i = 0; i < idxlapor; i++) {
                                System.out.println(i+1+". "+kasir[i]+"\t"+date[i]+"\t"  +menulapor[i]+"\t\t   "+jumlahlapor[i][0]+"\tRp"+jumlahlapor[i][1]);
                            }
                            System.out.println("");
                            System.out.println(" TOTAL PEMASUKAN  :  Rp"+total);
                            break;
                        case 2:
                            for (int i = 0; i < idxlapor; i++) {
                                for (int j = 0; j < idxlapor-1; j++) {
                                    if(jumlahlapor[j][0]<jumlahlapor[j+1][0]){
                                      //sorting harga
                                      int temp = jumlahlapor[j][0];
                                      jumlahlapor[j][0] = jumlahlapor[j+1][0];
                                      jumlahlapor[j+1][0] = temp;
                                      //sorting menu
                                      String tempm = menulapor[j];
                                      menulapor[j] = menulapor[j+1];
                                      menulapor[j+1] = tempm;
                                    }
                                }
                            }
                            System.out.println("   Menu Terlaris \t\t\tJumlah Terjual");
                            for (int i = 0; i < 5; i++) {
                                if(menulapor[i]!=null){
                                System.out.println(i+1+". "+menulapor[i]+" "+"\t\t\t\t     "+jumlahlapor[i][0]);
                                }
                            }
                            break;
                        case 3:                    
                            System.out.println("");
                            System.out.println("----------------------EXIT OWNER------------------------");
                            System.out.println("");
                            break;
                                
                        }
                    }while(pilihO!=3);
                    break;
                case 4:
                    break;
                    
            }
        }while(user!=4);
        
        
    }
}
