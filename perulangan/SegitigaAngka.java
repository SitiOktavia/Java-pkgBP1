package perulangan;
public class SegitigaAngka {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= i ; j--) {
                System.out.print(" "+j+" ");
            }
            System.out.println("");
        }
    }
}
