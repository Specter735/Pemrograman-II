package PRAK103;

import java.util.Scanner;

public class PRAK103_2310817110004_AbdurrahmanGilangHarjuna {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(":");
		int N = scanner.nextInt();
		int angka = scanner.nextInt();
		
		int counter = 0;
		
		do {
			if (angka % 2 != 0) {
				System.out.print(angka + " ");
				counter++;
			}
			angka++;
		} while (counter < N);
		
		scanner.close();
	}
}
