package javaapplication1;
import java.util.Scanner;
public class faktor {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int n, bagi, counter;
		int i = 1;
		int angka = 3;
		boolean indikator;
		
		System.out.print("Masukkan Input = ");
		n = input.nextInt();
		
		System.out.print(2 + " ");
		while (i < n) {
			bagi = 2;
			indikator = true;
			
			do {
				if (angka % bagi == 0) {
					indikator = false;
					break;
				} else {
					bagi++;
				}
			}
			while (angka > bagi);
			
			if (indikator == true) {
				System.out.print(angka + " ");
				i++;
			}
			
			angka++;
		}
	}
}

