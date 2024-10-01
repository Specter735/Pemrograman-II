package PRAK104;

import java.util.Scanner;

public class PRAK104_2310817110004_AbdurrahmanGilangHarjuna {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tangan Abu: ");
		String tanganAbu = scanner.nextLine();
		System.out.print("Tangan Bagas: ");
		String tanganBagas = scanner.nextLine();
		
		String[] Abu = tanganAbu.split("");
		String[] Bagas = tanganBagas.split("");
		
		int poinAbu = 0;
		int poinBagas = 0;
		
		for (int i = 0; i < 3; i++) {
			String pilihanAbu = Abu[i];
			String pilihanBagas = Bagas[i];
			
			if (pilihanAbu.equals(pilihanBagas)) {
				continue;
			} else if (pilihanAbu.equals("B") && pilihanBagas.equals("G")) {
				poinAbu++;
			} else if (pilihanAbu.equals("G") && pilihanBagas.equals("K")) {
				poinAbu++;
			} else if (pilihanAbu.equals("K") && pilihanBagas.equals("B")) {
				poinAbu++;
			} else {
				poinBagas++;
			}
		}
		
		if (poinAbu > poinBagas) {
			System.out.print("Abu");
		} else if (poinBagas > poinAbu) {
			System.out.print("Bagas");
		} else {
			System.out.print("Seri");
		}
		
		
		scanner.close();
	}

}
