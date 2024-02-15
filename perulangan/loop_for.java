package perulangan;
public class loop_for {
    public static void main(String[] args) {
        int jumlah=0, kali=1;
        for (int i = 1; i < 9; i++)
            //(int i =9; i > 0; i--) untuk ke yg lebih kecil
        {
            System.out.print(i+"");
            jumlah=jumlah+i;
            kali=kali*i;
        }
        System.out.println("\nHasil jumlah : "+jumlah);
        System.out.println("Hasil kali : "+kali);
    }
}
