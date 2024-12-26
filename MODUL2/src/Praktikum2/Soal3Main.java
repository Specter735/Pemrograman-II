package Praktikum2;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";  // Atribut asal sudah diubah menjadi String
        p1.setJabatan("Assasin");

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());  // Menggunakan getter untuk asal
        System.out.println("Jabatan: " + p1.getJabatan());  // Menggunakan getter untuk jabatan
        System.out.println("Umur: " + p1.getUmur() + " tahun");  // Umur diberikan nilai default 17
    }
}
