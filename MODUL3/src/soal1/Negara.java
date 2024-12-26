package soal1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class IdentitasNegara {
    private String nama;
    private String Kepemimpinan;
    private String namaPemimpin;
    private int tanggalMerdeka;
    private int bulanMerdeka;
    private int tahunMerdeka;

    public IdentitasNegara(String nama, String Kepemimpinan, String namaPemimpin, int tanggalMerdeka, int bulanMerdeka, int tahunMerdeka) {
        this.nama = nama;
        this.Kepemimpinan = Kepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalMerdeka = tanggalMerdeka;
        this.bulanMerdeka = bulanMerdeka;
        this.tahunMerdeka = tahunMerdeka;
    }

    public IdentitasNegara(String nama, String Kepemimpinan, String namaPemimpin) {
        this(nama, Kepemimpinan, namaPemimpin, -1, -1, -1);
    }

    public void tampilkanInformasi(HashMap<Integer, String> bulanMap) {
        System.out.print("Negara " + nama + " mempunyai " + Kepemimpinan + " bernama " + namaPemimpin);
        if (tanggalMerdeka != -1) {
            System.out.println("\nDeklarasi Kemerdekaan pada Tanggal " + tanggalMerdeka + " " + bulanMap.get(bulanMerdeka) + " " + tahunMerdeka);
        } else {
            System.out.println();
        }
    }
}

public class Negara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        LinkedList<IdentitasNegara> daftarNegara = new LinkedList<>();

        System.out.print(" ");
        int jumlahNegara = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("");
            String nama = scanner.nextLine();

            System.out.print("");
            String Kepemimpinan = scanner.nextLine();

            System.out.print("");
            String namaPemimpin = scanner.nextLine();

            if (!Kepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print("");
                int tanggalMerdeka = Integer.parseInt(scanner.nextLine());

                System.out.print("");
                int bulanMerdeka = Integer.parseInt(scanner.nextLine());

                System.out.print("");
                int tahunMerdeka = Integer.parseInt(scanner.nextLine());

                daftarNegara.add(new IdentitasNegara(nama, Kepemimpinan, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka));
            } else {
                daftarNegara.add(new IdentitasNegara(nama, Kepemimpinan, namaPemimpin));
            }
        }

        for (IdentitasNegara negara : daftarNegara) {
            negara.tampilkanInformasi(bulanMap);
        }

        scanner.close();
    }
}