package PRAK102;

import java.util.Scanner;

public class PRAK102_2310817110004_AbdurrahmanGilangHarjuna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        int angka = scanner.nextInt();
        
        int counter = 0;
        
        while (counter < 11) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1) + " ");
            } else {
                System.out.print(angka + " ");
            }
            angka++;
            counter++;
        }
        
        scanner.close();
    }
}

