package Praktikum2;

class Buah {
    String nama;
    double hargaPerBerat;
    double beratPerSatuan;
    double diskon;
    double totalBerat;

    public Buah(String nama, double hargaPerBerat, double beratPerSatuan, double diskon, double totalBerat) {
        this.nama = nama;
        this.hargaPerBerat = hargaPerBerat;
        this.beratPerSatuan = beratPerSatuan;
        this.diskon = diskon;
        this.totalBerat = totalBerat;
    }

    public double hitungHargaSebelumDiskon() {
        double jumlahSatuan = totalBerat / beratPerSatuan;
        return jumlahSatuan * hargaPerBerat;
    }

    public double hitungDiskon() {
        double beratDiskon = Math.floor(totalBerat / 4);
        double totalDiskon = beratDiskon * 0.02 * hargaPerBerat * 4;
        return totalDiskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + beratPerSatuan + "kg");
        System.out.println("Harga: Rp" + hargaPerBerat);
        System.out.println("Jumlah Beli: " + totalBerat + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hitungHargaSebelumDiskon()));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", hitungDiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hitungHargaSetelahDiskon()));
        System.out.println();
    }
}

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 7000, 0.4, 2, 40);
        apel.tampilkanInfo();

        Buah mangga = new Buah("Mangga", 3500, 0.2, 2, 15);
        mangga.tampilkanInfo();

        Buah alpukat = new Buah("Alpukat", 10000, 0.25, 2, 12);
        alpukat.tampilkanInfo();
    }
}
