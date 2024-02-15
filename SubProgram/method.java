package SubProgram;
import java.util.*;
import java.text.*;
import java.util.Scanner;
public class method {
    //method (static)void biasanya di dalamnya ada output, jadi tidak ada luaran apapun, hanya perintah sj 
    //di dalam kurung adl argumen/parameternya, tipe datanya bebas
    //harus sama static
    //method dengan tipe data (int, long, string, char, boolean) dengan return value, cirinya tidak ada outputnya hanya ada proses
    static void halo(String kata){
        System.out.println("1. "+kata);
    }
    static int hitungharga(int hargasatuan, int jumlah)//header
    {
        //body
        int harga = hargasatuan*jumlah;
        return harga;
    }
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
        String date [] = new String [50];
        date [0] = dateformat.format(now);
        System.out.println(""+date[0]);
        System.out.println(dateformat.format(now));
        
       //cara menampilkan return value menggunakan temp variabel (itc is "h")
        int h = hitungharga(1000,8);
        System.out.println("Harga : "+h);
        String kata = "halo";
        halo(kata);
        //atau langsung memasukkan argumennya pada perintah output
        System.out.println("Harga : "+hitungharga(12000,7));
        
    }
    
}
