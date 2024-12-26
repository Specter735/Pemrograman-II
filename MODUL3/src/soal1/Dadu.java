package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class NilaiDadu {
    private int nilai;

    public void AcakNilai() {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1;
    }

    public int Nilai() {
        return nilai;
    }
}

public class Dadu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<NilaiDadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            NilaiDadu dadu = new NilaiDadu();
            dadu.AcakNilai();
            daftarDadu.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.Nilai());
            totalNilai += dadu.Nilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        scanner.close();
    }
}