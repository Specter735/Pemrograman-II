package soal1;

import java.util.ArrayList;
import java.util.Scanner;

class IdentitasMahasiswa {
    private String nama;
    private String nim;


    public IdentitasMahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

public class Mahasiswa {
    private static ArrayList<IdentitasMahasiswa> daftarMahasiswa = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    tampilkanDaftarMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    daftarMahasiswa.clear(); // Menghapus semua data saat keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scanner.nextLine();

        for (IdentitasMahasiswa m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                System.out.println("NIM sudah ada! Mahasiswa tidak ditambahkan.");
                return;
            }
        }

        IdentitasMahasiswa mahasiswa = new IdentitasMahasiswa(nama, nim);
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    private static void hapusMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();

        for (IdentitasMahasiswa m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                daftarMahasiswa.remove(m);
                System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    private static void cariMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nim = scanner.nextLine();

        for (IdentitasMahasiswa m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                System.out.println("Data Mahasiswa:");
                System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    private static void tampilkanDaftarMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (IdentitasMahasiswa m : daftarMahasiswa) {
            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
        }
    }
}