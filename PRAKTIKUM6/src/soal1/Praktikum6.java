package soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum6 {
    private static ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        loadSampleData();

        do {
            System.out.println("\n=== Aplikasi CRUD Mahasiswa ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanData();
                case 2 -> tambahData(scanner);
                case 3 -> updateData(scanner);
                case 4 -> hapusData(scanner);
                case 5 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    private static void tampilkanData() {
        System.out.println("\n=== Data Mahasiswa ===");
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.printf("%-5s %-10s %-20s\n", "No", "NIM", "Nama");
            for (int i = 0; i < mahasiswaList.size(); i++) {
                Mahasiswa mhs = mahasiswaList.get(i);
                System.out.printf("%-5d %-10s %-20s\n", i + 1, mhs.getNim(), mhs.getNama());
            }
        }
    }

    private static void tambahData(Scanner scanner) {
        System.out.print("\nMasukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        mahasiswaList.add(new Mahasiswa(nim, nama));
        System.out.println("Data berhasil ditambahkan.");
    }

    private static void updateData(Scanner scanner) {
        tampilkanData();
        System.out.print("\nPilih nomor data yang akan diupdate: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < mahasiswaList.size()) {
            System.out.print("Masukkan NIM baru: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama baru: ");
            String nama = scanner.nextLine();

            Mahasiswa mhs = mahasiswaList.get(index);
            mhs.setNim(nim);
            mhs.setNama(nama);
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    private static void hapusData(Scanner scanner) {
        tampilkanData();
        System.out.print("\nPilih nomor data yang akan dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < mahasiswaList.size()) {
            mahasiswaList.remove(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    private static void loadSampleData() {
        mahasiswaList.add(new Mahasiswa("2310817210012", "Hakim"));
        mahasiswaList.add(new Mahasiswa("2310817210009", "Ibnu"));
        mahasiswaList.add(new Mahasiswa("2310817110015", "Chaidar"));
        mahasiswaList.add(new Mahasiswa("2310817210004", "Allanto"));
        mahasiswaList.add(new Mahasiswa("2310817210007", "Raymond"));
        mahasiswaList.add(new Mahasiswa("2310817110004", "Arjun"));
        mahasiswaList.add(new Mahasiswa("2310817310014", "Rizki"));
        mahasiswaList.add(new Mahasiswa("2310817110006", "Bintang"));
        mahasiswaList.add(new Mahasiswa("2310817110007", "Daffa"));
        mahasiswaList.add(new Mahasiswa("2310817110013", "Randy"));
    }
}
